plugins {
    id("java-gradle-plugin")
    // id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    //添加Gradle相关的API，否则无法自定义Plugin和Task
    implementation(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
}

gradlePlugin {
    plugins {
        create("version") {
            //添加插件
            id = "com.weiwei.dependency"
            //在根目录创建类 VersionPlugin 继承 Plugin<Project>
            implementationClass = "com.weiwei.dependency.DependencyPlugin"
        }
    }
}