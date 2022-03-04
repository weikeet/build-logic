## 使用Kotlin管理Gradle依赖

为了充分利用Android Plugin for Gradle 3.0+的优点，将Android项目拆分成多个module的做法越来越常见。

然而，随着module数量的增多，我们很快就会遇到依赖管理的混乱问题。

### 管理Gradle依赖的三种不同方法

1. 手动管理
2. 使用Google推荐的`ext`
3. **Kotlin + buildSrc**

### 1. 手动管理

这是一种大多数人在采用的管理依赖的方法，但每次升级依赖库时都需要做大量的手动更改

**module_a/build.gradle** 和 **module_b/build.gradle**

```groovy
implementation 'androidx.core:core-ktx:1.7.0'
implementation 'androidx.appcompat:appcompat:1.4.1'
implementation 'com.google.android.material:material:1.5.0'
implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
```

这里存在许多重复的配置，而且当你的项目有很多module时很难管理依赖库的版本更新

### 2. Google推荐：使用gradle的extra属性

Google在 [Android官方文档](https://developer.android.com/studio/build/gradle-tips) 中推荐这种管理依赖的方法。许多项目例如ButterKnife、Picasso等都在使用这种方法。

此方法非常适用于更新 support library 的版本，因为每个 support library 都具有相同的版本号，你只需要在一个地方更改它就行了。 Retrofit 等其它第三方库也是如此。

**Root-level build.gradle**

```groovy
ext {
  dep = [CoreKtx         : "androidx.core:core-ktx:1.7.0",
         AppCompat       : "androidx.appcompat:appcompat:1.4.1",
         MaterialDesign  : "com.google.android.material:material:1.5.0",
         ConstraintLayout: "androidx.constraintlayout:constraintlayout:2.1.3",]
}
```

**module/build.gradle**

```groovy
implementation dep.CoreKtx
implementation dep.AppCompat
implementation dep.MaterialDesign
implementation dep.ConstraintLayout
```

这种方法是手动管理的一大进步，但是缺少IDE的支持，更准确的说是在更新依赖库的时候IDE不能自动补全。

### 3. Kotlin + buildSrc

Support Android Studio Autocomplete 😎

![img](https://user-gold-cdn.xitu.io/2018/5/31/163b57650aacdc7d?imageslim)

**[Gradle文档](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources)**中有这样一段话:

> 当你运行Gradle时，它会检查项目中是否存在一个名为`buildSrc`的目录。然后Gradle会自动编译并测试这段代码，并将其放入构建脚本的类路径中。您不需要提供任何进一步的操作提示。

**实现步骤：**

1. 在项目**根目录**下新建一个名为**buildSrc**的文件夹(与项目里的app文件夹同级)。
2. 在**buildSrc**文件夹里创建名为**build.gradle.kts**的文件，文件内容参考之前的描述。

   ```groovy
   plugins {
       `kotlin-dsl`
   }
   ```

3. 在**buildSrc**文件夹里创建**src/main/java**文件夹，如下图所示。并在该文件夹下创建**Dependencies.kt**文件，文件内容参考之前的描述。

   ```kotlin
   object AndroidXLibs {
      const val CoreKtx = "androidx.core:core-ktx:1.7.0"
      const val AppCompat = "androidx.appcompat:appcompat:1.4.1"
      const val MaterialDesign = "com.google.android.material:material:1.5.0"
      const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.1.3"
   }
   ```

4. build一遍你的项目，然后**重启Android Studio**，项目里就会多出一个名为**buildSrc**的module。

经过上面4个步骤后，执行一次**Gradle Sync任务**，现在我们可以在Android Studio中访问**Dependencies.kt**中任何值了。看起来结果与“ext”非常相似，但是它**支持自动补全和单击跳转**。

**module_a/build.gradle** 和 **module_a/build.gradle**

```groovy
implementation AndroidXLibs.CoreKtx
implementation AndroidXLibs.AppCompat
implementation AndroidXLibs.MaterialDesign
implementation AndroidXLibs.ConstraintLayout
```

### 总结

推荐使用**Kotlin + buildSrc**的方法。它支持**自动补全和单击跳转**，使得您无需在文件之间手动来回切换，方便你更好的管理Gradle依赖。

缺点是：无法知道哪些库已经有新版本了

## 依赖更新检查

https://github.com/ben-manes/gradle-versions-plugin

```groovy
//😳 apply checkVersions
apply from: './buildSrc/checkVersions.gradle'

buildscript {
  ext {
    kotlin_version = '1.6.10'
  }

  repositories {
    google()
    mavenCentral()
    maven { url 'https://maven.aliyun.com/repository/public/' }
  }

  dependencies {
    classpath "com.android.tools.build:gradle:7.1.2"
    classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"

    //😳 add plugin
    // https://github.com/ben-manes/gradle-versions-plugin
    classpath "com.github.ben-manes:gradle-versions-plugin:0.42.0"
  }
}
```

```zsh
./gradlew dependencyUpdates

./gradlew dependencyUpdates -Drevision=release

./gradlew dependencyUpdates -Drevision=release -DoutputFormatter=json,xml,html
```

### Lint方式检查更新

https://github.com/PicPay/version-checker-gradle-lint
