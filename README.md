# Gradle 依赖管理

为了充分利用 Android Plugin for Gradle 3.0+ 的优点，将 Android项目拆分成多个 module 的做法越来越常见。

然而，随着 module 数量的增多，我们很快就会遇到依赖管理的混乱问题。

## 管理 Gradle 依赖方法

1. 手动管理
2. 使用 Google 推荐 `ext`
3. **Kotlin + buildSrc**
4. **Kotlin + ComposingBuild**
5. **Gradle catalog**

## 1.手动管理

这是一种大多数人在采用的管理依赖的方法，但每次升级依赖库时都需要做大量的手动更改

**module_a/build.gradle** 和 **module_b/build.gradle**

```groovy
implementation 'androidx.core:core-ktx:1.9.0'
implementation 'androidx.appcompat:appcompat:1.5.1'
implementation 'com.google.android.material:material:1.6.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
```

这里存在许多重复的配置，而且当你的项目有很多 module 时很难管理依赖库的版本更新

## 2.使用 gradle extra 属性

Google在 [Android官方文档](https://developer.android.com/studio/build/gradle-tips) 中推荐这种管理依赖的方法。许多项目例如 ButterKnife、Picasso 等都在使用这种方法。

此方法非常适用于更新 support library 的版本，因为每个 support library 都具有相同的版本号，你只需要在一个地方更改它就行了。 Retrofit 等其它第三方库也是如此。

Root-level build.gradle:

```groovy
ext {
  dep = [CoreKtx         : "androidx.core:core-ktx:1.7.0",
         AppCompat       : "androidx.appcompat:appcompat:1.4.1",
         MaterialDesign  : "com.google.android.material:material:1.5.0",
         ConstraintLayout: "androidx.constraintlayout:constraintlayout:2.1.3",]
}
```

module/build.gradle:

```groovy
implementation dep.CoreKtx
implementation dep.AppCompat
implementation dep.MaterialDesign
implementation dep.ConstraintLayout
```

- 这种方法是手动管理的一大进步，而且同样支持依赖更新提升
- 但是缺少 IDE 的支持，更准确的说是在更新依赖库的时候 IDE 不能自动补全

### 3.Kotlin + buildSrc

Support Android Studio Autocomplete 😄

[Gradle文档](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources) 中有这样一段话:

> 当你运行 Gradle 时，它会检查项目中是否存在一个名为 `buildSrc` 的目录。然后 Gradle 会自动编译并测试这段代码，并将其放入构建脚本的类路径中。您不需要提供任何进一步的操作提示。

**实现步骤：**

1. 在项目 `根目录` 下新建一个名为 `buildSrc` 的文件夹(与项目里的 app 文件夹同级)。
2. 在 `buildSrc` 文件夹里创建名为 `build.gradle.kts` 的文件，文件内容参考之前的描述。

   ```groovy
   plugins {
       `kotlin-dsl`
   }
   ```

3. 在 `buildSrc` 文件夹里创建 `src/main/kotlin` 文件夹，如下图所示。并在该文件夹下创建 `Dependencies.kt` 文件，文件内容参考之前的描述。

   ```kotlin
   object AndroidXLibs {
      const val CoreKtx = "androidx.core:core-ktx:1.9.0"
      const val AppCompat = "androidx.appcompat:appcompat:1.5.1"
      const val MaterialDesign = "com.google.android.material:material:1.6.0"
      const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
   }
   ```

4. build 一遍你的项目，然后 **重启 Android Studio**，项目里就会多出一个名为 **buildSrc** 的 module。

经过上面4个步骤后，执行一次 **Gradle Sync任务**，现在我们可以在 Android Studio 中访问 **Dependencies.kt** 中任何值了。看起来结果与 `ext` 非常相似，但是它 **支持自动补全和单击跳转**。

**module_a/build.gradle** 和 **module_a/build.gradle**

```groovy
implementation AndroidXLibs.CoreKtx
implementation AndroidXLibs.AppCompat
implementation AndroidXLibs.MaterialDesign
implementation AndroidXLibs.ConstraintLayout
```

- 这样的缺点就是，每次依赖变更的时候都会触发全量构建，耗时较多，可以尝试使用 Gradle 的 [Build Cache](https://docs.gradle.org/current/userguide/build_cache.html) 来解决。
- 另外 IDE 无法提示依赖更新，需要通过插件来检查

## 4.Kotlin + ComposingBuild

https://github.com/leown/ComposingBuildsDemo

## Gradle catalog

catalog 是 gradle 7.0+ 新增的功能，使用可以参考

缺点：无法跳转到依赖申明的位置，弃！！！

gradle-version-catalog 转换工具：

https://takahirom.github.io/gradle-version-catalog-converter/

## 总结

推荐使用 **Kotlin + buildSrc** 的方法。它支持 **自动补全和单击跳转**，使得您无需在文件之间手动来回切换，方便你更好的管理 Gradle 依赖。

缺点是：无法知道哪些库已经有新版本了

## 依赖更新检查

### Plugin 方式检查

https://github.com/ben-manes/gradle-versions-plugin

```groovy
//😳 add plugin
// add to root build.gradle ->buildscript -> dependencies
// https://github.com/ben-manes/gradle-versions-plugin
classpath 'com.github.ben-manes:gradle-versions-plugin:0.42.0'

//😳 apply checkVersions
// add to module build.gradle
apply from: './buildSrc/check-versions.gradle'
```

执行命令检查库更新

```zsh
./gradlew dependencyUpdates

./gradlew dependencyUpdates -Drevision=release

./gradlew dependencyUpdates -Drevision=release -DoutputFormatter=json,xml,html
```

### Lint 方式检查

https://github.com/PicPay/version-checker-gradle-lint
