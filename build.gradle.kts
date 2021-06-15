plugins {
  `kotlin-dsl`
}

repositories {
  // The org.jetbrains.kotlin.jvm plugin requires a repository
  // where to download the Kotlin compiler dependencies from.
  maven(url = "https://maven.aliyun.com/repository/public")
  mavenCentral()
}