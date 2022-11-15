/*
 * Copyright (c) 2022 Weiwei. https://github.com/lecymeng
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused", "objectName")

package com.weiwei.dependency

/**
 * 选择 dependencies 时需要注意:
 * 1. 打开连接查看依赖的repositories
 * 2. 不同版本内容
 * 3. 混淆内容
 *
 * 与 class 字段冲突: 加上 _lib
 * groupId 带 - 替换为 _
 * artifactId 带 _ 替换为 __, 带 - 替换为 _
 * 不同 object 中使用同一 version 定义在 Versions 中
 * 超过三个使用同一 Version 定义为常量
 *
 * https://search.maven.org
 * https://mvnrepository.com
 * https://github.com/xfslove/alfred-mvns
 */

object Versions {
    const val minSdk = 21
    const val targetSdk = 32
    const val compileSdk = 33
    const val buildTools = "33.0.0"

    const val Kotlin = "1.7.10"
    const val compose = "1.3.0-rc01"
    const val composeCompiler = "1.3.0"
}

class Plugins {
    class com {
        class github {
            object ben_manes {
                // https://github.com/ben-manes/gradle-versions-plugin
                const val gradle_versions_plugin = "com.github.ben-manes:gradle-versions-plugin:0.42.0"
            }
        }

        class org {
            class jetbrains {
                object kotlin {
                    const val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.Kotlin}"
                }
            }
        }
    }
}

class Libs {

    class androidx {
        object annotation {
            const val annotation_lib = "androidx.annotation:annotation:1.5.0"
        }

        object appcompat {
            const val appcompat = "androidx.appcompat:appcompat:1.5.1"
        }

        object activity {
            private const val activityVer = "1.6.0"
            const val activity = "androidx.activity:activity:$activityVer"
            const val activity_ktx = "androidx.activity:activity-ktx:$activityVer"
            const val activity_compose = "androidx.activity:activity-compose:$activityVer"
        }

        object browser {
            const val browser = "androidx.browser:browser:1.4.0"
        }

        object constraintlayout {
            const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.1.3"
            const val constraintlayout_compose = "androidx.constraintlayout:constraintlayout-compose:1.0.1"
        }

        object core {
            const val core = "androidx.core:core:1.9.0"
            const val core_ktx = "androidx.core:core-ktx:1.9.0"
        }

        class compose {
            object animation {
                const val animation = "androidx.compose.animation:animation:${Versions.compose}"
            }

            object foundation {
                const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
                const val foundation_layout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
            }

            object material {
                const val material = "androidx.compose.material:material:${Versions.compose}"
                const val material_icons_core = "androidx.compose.material:material-icons-core:${Versions.compose}"
                const val material_icons_extended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
            }

            object material3 {
                const val material3 = "androidx.compose.material3:material3:1.0.0-rc01"
                const val material3_window_size_class = "androidx.compose.material3:material3-window-size-class:1.0.0-rc01"
            }

            object runtime {
                const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
                const val runtime_livedata = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
            }

            object ui {
                const val ui = "androidx.compose.ui:ui:${Versions.compose}"
                const val ui_tooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
                const val ui_tooling_preview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
            }
        }

        object fragment {
            const val fragment = "androidx.fragment:fragment:1.5.3"
            const val fragment_ktx = "androidx.fragment:fragment-ktx:1.5.3"
        }

        object recyclerview {
            const val recyclerview = "androidx.recyclerview:recyclerview:1.2.1"
        }

        object vectordrawable {
            const val vectordrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
            const val vectordrawable_animated = "androidx.vectordrawable:vectordrawable-animated:1.1.0"
        }

        object viewpager2 {
            const val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"
        }

        object lifecycle {
            private const val lifecycleVer = "2.5.1"
            const val lifecycle_runtime = "androidx.lifecycle:lifecycle-runtime:${lifecycleVer}"
            const val lifecycle_runtime_ktx = "androidx.lifecycle:lifecycle-runtime-ktx:${lifecycleVer}"
            const val lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata:${lifecycleVer}"
            const val lifecycle_livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${lifecycleVer}"
            const val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel:${lifecycleVer}"
            const val lifecycle_viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${lifecycleVer}"
            const val lifecycle_viewmodel_compose = "androidx.lifecycle:lifecycle-viewmodel-compose:${lifecycleVer}"
            const val lifecycle_viewmodel_savedstate = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${lifecycleVer}"
            const val lifecycle_common_java8 = "androidx.lifecycle:lifecycle-common-java8:${lifecycleVer}"
            const val lifecycle_process = "androidx.lifecycle:lifecycle-process:${lifecycleVer}"
            const val lifecycle_service = "androidx.lifecycle:lifecycle-service:${lifecycleVer}"
        }

        object navigation {
            private const val NavigationLibVer = "2.5.2"
            const val navigation_compose = "androidx.navigation:navigation-compose:${NavigationLibVer}"
            const val navigation_fragment = "androidx.navigation:navigation-fragment:${NavigationLibVer}"
            const val navigation_fragment_ktx = "androidx.navigation:navigation-fragment-ktx:${NavigationLibVer}"
            const val navigation_ui = "androidx.navigation:navigation-ui:${NavigationLibVer}"
            const val navigation_ui_ktx = "androidx.navigation:navigation-ui-ktx:${NavigationLibVer}"
            const val navigation_runtime = "androidx.navigation:navigation-runtime:${NavigationLibVer}"
            const val navigation_runtime_ktx = "androidx.navigation:navigation-runtime-ktx:${NavigationLibVer}"
        }

        object room {
            private const val roomVer = "2.4.1"
            const val room_runtime = "androidx.room:room-runtime:${roomVer}"
            const val room_compiler = "androidx.room:room-compiler:${roomVer}"
            const val room_rxjava2 = "androidx.room:room-rxjava2:${roomVer}"
            const val room_ktx = "androidx.room:room-ktx:${roomVer}"
        }

        object paging {
            private const val PagingLibVer = "3.1.1"
            const val paging_runtime = "androidx.paging:paging-runtime:${PagingLibVer}"
            const val paging_runtime_ktx = "androidx.paging:paging-runtime-ktx:${PagingLibVer}"
            const val paging_common = "androidx.paging:paging-common:${PagingLibVer}"
            const val paging_common_ktx = "androidx.paging:paging-common-ktx:${PagingLibVer}"
            const val paging_rxjava2 = "androidx.paging:paging-rxjava2:${PagingLibVer}"
            const val paging_rxjava2_ktx = "androidx.paging:paging-rxjava2-ktx:${PagingLibVer}"
        }

        object startup {
            const val startup_runtime = "androidx.startup:startup-runtime:1.1.1"
        }

        object work {
            const val work_runtime = "androidx.work:work-runtime:2.7.1"
            const val work_runtime_ktx = "androidx.work:work-runtime-ktx:2.7.1"
        }
    }

    object com {

        class airbnb {
            object android {
                // https://github.com/airbnb/lottie-android
                const val lottie = "com.airbnb.android:lottie:5.2.0"
                const val lottie_compose = "com.airbnb.android:lottie-compose:5.2.0"
            }
        }

        object alibaba {
            // https://github.com/alibaba/ARouter
            const val arouter_api = "com.alibaba:arouter-api:1.5.0"
            const val arouter_compiler = "com.alibaba:arouter-compiler:1.2.2"
            const val arouter_register = "com.alibaba:arouter-register:1.0.2"
        }

        class android {
            object tools {
                const val desugar__jdk__libs = "com.android.tools:desugar_jdk_libs:1.1.6"
            }
        }

        class drakeet {
            object about {
                // https://github.com/drakeet/MultiType
                const val about = "com.drakeet.about:about:2.5.1"
            }

            object multitype {
                // https://github.com/PureWriter/about-page
                const val multitype = "com.drakeet.multitype:multitype:4.3.0"
            }
        }

        class facebook {
            object fresco {
                // https://github.com/facebook/fresco
                const val fresco = "com.facebook.fresco:fresco:2.6.0"
            }
        }

        class github {
            class bumptech {
                object glide {
                    // https://github.com/bumptech/glide
                    private const val GlideVer = "4.14.2"
                    const val glide = "com.github.bumptech.glide:glide:${GlideVer}"
                    const val compiler = "com.github.bumptech.glide:compiler:${GlideVer}"
                    const val okhttp3_integration = "com.github.bumptech.glide:okhttp3-integration:4.11.0"
                }
            }

            object chrisbanes {
                // https://github.com/chrisbanes/PhotoView
                const val PhotoView = "com.github.chrisbanes:PhotoView:2.3.0"
            }

            object PhilJay {
                // https://github.com/PhilJay/MPAndroidChart
                const val MPAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"
            }

            object tiann {
                const val FreeReflection = "com.github.tiann:FreeReflection:3.1.0"
            }
        }

        class google {
            object accompanist {
                // https://github.com/google/accompanist
                private const val accompanistVer = "0.25.1"
                const val accompanist_drawablepainter = "com.google.accompanist:accompanist-drawablepainter:$accompanistVer"
                const val accompanist_flowlayout = "com.google.accompanist:accompanist-flowlayout:$accompanistVer"
                const val accompanist_pager = "com.google.accompanist:accompanist-pager:$accompanistVer"
                const val accompanist_pager_indicators = "com.google.accompanist:accompanist-pager-indicators:$accompanistVer"
                const val accompanist_navigation_animation = "com.google.accompanist:accompanist-navigation-animation:$accompanistVer"
                const val accompanist_insets = "com.google.accompanist:accompanist-insets:$accompanistVer"
                const val accompanist_systemuicontroller = "com.google.accompanist:accompanist-systemuicontroller:$accompanistVer"
                const val accompanist_webview = "com.google.accompanist:accompanist-webview:$accompanistVer"
            }

            class android {
                object exoplayer {
                    // https://github.com/google/ExoPlayer
                    private const val exoplayerVersion = "2.18.1"
                    const val exoplayer = "com.google.android.exoplayer:exoplayer:$exoplayerVersion"
                    const val exoplayer_core = "com.google.android.exoplayer:exoplayer-core:$exoplayerVersion"
                    const val exoplayer_ui = "com.google.android.exoplayer:exoplayer-ui:$exoplayerVersion"
                    const val exoplayer_hls = "com.google.android.exoplayer:exoplayer-hls:$exoplayerVersion"
                    const val exoplayer_dash = "com.google.android.exoplayer:exoplayer-dash:$exoplayerVersion"
                    const val exoplayer_smoothstreaming = "com.google.android.exoplayer:exoplayer-smoothstreaming:$exoplayerVersion"
                    const val extension_mediasession = "com.google.android.exoplayer:extension-mediasession:$exoplayerVersion"
                }

                object material {
                    const val material = "com.google.android.material:material:1.6.1"
                }

                object play {
                    const val review = "com.google.android.play:review:2.0.0"
                    const val review_ktx = "com.google.android.play:review-ktx:2.0.0"
                }
            }

            class code {
                object gson {
                    // https://github.com/google/gson
                    const val gson = "com.google.code.gson:gson:2.9.0"
                }
            }

            object dagger {
                private const val Dagger2Ver = "2.41"
                const val dagger = "com.google.dagger:dagger:${Dagger2Ver}"
                const val dagger_compiler = "com.google.dagger:dagger-compiler:${Dagger2Ver}"
                const val dagger_android = "com.google.dagger:dagger-android:${Dagger2Ver}"
                const val dagger_android_support = "com.google.dagger:dagger-android-support:${Dagger2Ver}"
                const val dagger_android_processor = "com.google.dagger:dagger-android-processor:${Dagger2Ver}"
                private const val HiltVer = "2.41"
                const val hilt_android = "com.google.dagger:hilt-android:${HiltVer}"
                const val hilt_android_compiler = "com.google.dagger:hilt-android-compiler:${HiltVer}"
            }
        }

        class microsoft {
            object appcenter {
                const val appcenter_analytics = "com.microsoft.appcenter:appcenter-analytics:4.1.0"
                const val appcenter_crashes = "com.microsoft.appcenter:appcenter-crashes:4.1.0"
            }
        }

        class squareup {
            object okhttp3 {
                // https://github.com/square/okhttp
                private const val OkHttp3Ver = "4.9.3"
                const val okhttp = "com.squareup.okhttp3:okhttp:${OkHttp3Ver}"
                const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${OkHttp3Ver}"
                const val okhttp_urlconnection = "com.squareup.okhttp3:okhttp-urlconnection:${OkHttp3Ver}"
            }

            object retrofit2 {
                // https://github.com/square/retrofit
                private const val RetrofitVer = "2.9.0"
                const val retrofit = "com.squareup.retrofit2:retrofit:${RetrofitVer}"
                const val converter_gson = "com.squareup.retrofit2:converter-gson:${RetrofitVer}"
                const val converter_moshi = "com.squareup.retrofit2:converter-moshi:${RetrofitVer}"
                const val adapter_rxjava2 = "com.squareup.retrofit2:adapter-rxjava2:${RetrofitVer}"
                const val adapter_rxjava3 = "com.squareup.retrofit2:adapter-rxjava3:${RetrofitVer}"
            }
        }

        object tencent {
            const val mmkv = "com.tencent:mmkv:1.2.14"
        }
    }

    class io {
        object coil_kt {
            // https://github.com/coil-kt/coil
            const val coil = "io.coil-kt:coil:2.2.2"
            const val coil_compose = "io.coil-kt:coil-compose:2.2.2"
        }

        class reactivex {
            object rxjava2 {
                const val rxjava = "io.reactivex.rxjava2:rxjava:2.2.21"
                const val rxandroid = "io.reactivex.rxjava2:rxandroid:2.1.1"
            }

            object rxjava3 {
                // https://github.com/ReactiveX/RxJava
                // https://github.com/ReactiveX/RxAndroid
                const val rxjava = "io.reactivex.rxjava3:rxjava:3.1.5"
                const val rxandroid = "io.reactivex.rxjava3:rxandroid:3.0.0"
            }
        }
    }

    class jakewharton {
        object timber {
            // https://github.com/JakeWharton/timber
            const val timber = "com.jakewharton.timber:timber:5.0.1"
        }
    }

    class jp {
        object wasabeef {
            // https://github.com/wasabeef/glide-transformations
            const val glide_transformations = "jp.wasabeef:glide-transformations:4.3.0"
            const val blurry = "jp.wasabeef:blurry:4.0.1"
        }
    }

    class org {

        object greenrobot {
            // https://github.com/greenrobot/EventBus
            const val eventbus = "org.greenrobot:eventbus:3.3.1"
        }

        class jetbrains {
            object kotlin {
                // https://github.com/JetBrains/kotlin
                const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.Kotlin}"
                const val kotlin_reflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.Kotlin}"
            }

            object kotlinx {
                // https://github.com/Kotlin/kotlinx.coroutines
                private const val coroutinesVer = "1.6.4"
                const val kotlinx_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${coroutinesVer}"
                const val kotlinx_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${coroutinesVer}"

                // https://github.com/Kotlin/kotlinx-datetime
                const val kotlinx_datetime = "org.jetbrains.kotlinx:kotlinx-datetime:0.4.0"
                // https://github.com/Kotlin/kotlinx.serialization
                const val kotlinx_serialization_json = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1"
            }
        }

        object jsoup {
            const val jsoup = "org.jsoup:jsoup:1.14.3"
        }

        object yaml {
            const val snakeyaml = "org.yaml:snakeyaml:1.30"
        }

    }

    class squareup {
        object leakcanary {
            private const val LeakCanaryVer = "2.9.1"
            const val leakcanary_android = "com.squareup.leakcanary:leakcanary-android:${LeakCanaryVer}"
            const val leakcanary_android_no_op = "com.squareup.leakcanary:leakcanary-android-no-op:${LeakCanaryVer}"
        }
    }

}
