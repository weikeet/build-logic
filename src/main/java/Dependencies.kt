@file:Suppress("unused")

/**
 * 选择DependenceLibrary时需要注意:
 * 1. 打开连接查看依赖的repositories
 * 2. 是否是AndroidX特有
 * 3. 不同版本内容
 * 4. 混淆内容
 */

object Versions {
  const val minSdk = 21
  const val targetSdk = 30
  const val compileSdk = 30
  const val buildTools = "30.0.3"
}

object DepLibs {
  // https://mvnrepository.com/artifact/com.android.tools.build/gradle?repo=google
  const val AndroidPlugin = "com.android.tools.build:gradle:4.2.1"

  // https://github.com/shwenzhang/AndResGuard
  const val AndResGuardPlugin = "com.tencent.mm:AndResGuard-gradle-plugin:1.2.20"

  // https://github.com/ben-manes/gradle-versions-plugin
  const val GradleVersionPlugin = "com.github.ben-manes:gradle-versions-plugin:0.38.0"

  // https://github.com/JetBrains/kotlin
  private const val KotlinVer = "1.5.10"
  const val KotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinVer}"
  const val KotlinLib = "org.jetbrains.kotlin:kotlin-stdlib:${KotlinVer}" // Java6 及以上版本
  const val KotlinLib7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KotlinVer}" // 增加了对 JDK7 中某些特性支持
  const val KotlinLib8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KotlinVer}" // 增加了对 JDK8 中某些特性支持
  const val KotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${KotlinVer}"

  // https://github.com/Kotlin/kotlinx.coroutines
  private const val KotlinXVer = "1.5.0"
  const val KotlinXCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${KotlinXVer}"
  const val KotlinXAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${KotlinXVer}"

  // https://github.com/greenrobot/EventBus
  const val EventBus = "org.greenrobot:eventbus:3.2.0"

  // https://github.com/google/gson
  const val Gson = "com.google.code.gson:gson:2.8.6"

  // https://github.com/jhy/jsoup
  const val JSoup = "org.jsoup:jsoup:1.13.1"

  // https://github.com/alibaba/ARouter
  const val ARouter = "com.alibaba:arouter-api:1.5.0"
  const val ARouterCompiler = "com.alibaba:arouter-compiler:1.2.2"
  const val ARouterRegisterPlugin = "com.alibaba:arouter-register:1.0.2"

  // https://github.com/bilibili/ijkplayer
  private const val IjkPlayerVer = "0.8.8"
  const val IjkPlayer = "tv.danmaku.ijk.media:ijkplayer-java:${IjkPlayerVer}"
  const val IjkPlayerArm64 = "tv.danmaku.ijk.media:ijkplayer-arm64:${IjkPlayerVer}"
  const val IjkPlayerArmV7a = "tv.danmaku.ijk.media:ijkplayer-armv7a:${IjkPlayerVer}"

  // https://github.com/bilibili/DanmakuFlameMaster
  const val DanmakuFlameMaster = "com.github.ctiao:DanmakuFlameMaster:0.9.25"
  const val DanmakuNdkBitmap = "com.github.ctiao:ndkbitmap-armv7a:0.9.21"

  // https://mvnrepository.com/artifact/com.google.dagger
  private const val Dagger2Ver = "2.83.3"
  const val Dagger2 = "com.google.dagger:dagger:${Dagger2Ver}"
  const val Dagger2Compiler = "com.google.dagger:dagger-compiler:${Dagger2Ver}"
  const val Dagger2Android = "com.google.dagger:dagger-android:${Dagger2Ver}"
  const val Dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Dagger2Ver}"
  const val Dagger2AndroidProcessor = "com.google.dagger:dagger-android-processor:${Dagger2Ver}"
  private const val HiltVer = "2.83.3-alpha"
  const val Hilt = "com.google.dagger:hilt-android:${HiltVer}"
  const val HiltCompiler = "com.google.dagger:hilt-android-compiler:${HiltVer}"
}

/**
 * desc: Android X library
 * link: https://developer.android.com/jetpack/androidx/versions
 */
object AndroidXLibs {
  // https://developer.android.com/jetpack/androidx/versions

  // Contains: Core Fragment AppCompatResources CursorAdapter DrawerLayout Collection Annotation
  const val AppCompat = "androidx.appcompat:appcompat:1.3.0"

  const val MaterialDesign = "com.google.android.material:material:1.3.0"

  const val RecyclerView = "androidx.recyclerview:recyclerview:1.2.0"

  const val SupportV4 = "androidx.legacy:legacy-support-v4:1.0.0"

  const val CardView = "androidx.cardview:cardview:1.0.0"

  const val CustomTabs = "androidx.browser:browser:1.2.0"

  const val VectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
  const val VectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.1.0"

  const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

  const val Annotation = "androidx.annotation:annotation:1.2.0"

  const val Core = "androidx.core:core:1.5.0"
  const val CoreKtx = "androidx.core:core-ktx:1.5.0"

  const val Activity = "androidx.activity:activity:1.2.2"
  const val ActivityKtx = "androidx.activity:activity-ktx:1.2.2"

  // Contains: Activity(Ktx) Core(Ktx) ViewModel(Ktx) LiveDataCore(Ktx)
  const val Fragment = "androidx.fragment:fragment:1.3.4"
  const val FragmentKtx = "androidx.fragment:fragment-ktx:1.3.4"

  // https://mvnrepository.com/artifact/androidx.cursoradapter/cursoradapter
  const val CursorAdapter = "androidx.cursoradapter:cursoradapter:1.0.0"

  // https://mvnrepository.com/artifact/androidx.drawerlayout/drawerlayout
  const val DrawerLayout = "androidx.drawerlayout:drawerlayout:1.1.1"

  // https://mvnrepository.com/artifact/androidx.viewpager2/viewpager2
  const val ViewPager2 = "androidx.viewpager2:viewpager2:1.0.0"
}

/**
 * Desc: Google official architecture
 * Ktx可与Java版本同时依赖，Ktx与Java存在类似功能的单独使用即可
 */
object ArchitectureLibs {
  // https://developer.android.com/topic/libraries/architecture/index.html

  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-extensions
  @Deprecated("Use Runtime/ViewModel/LiveData")
  const val LifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"

  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx
  private const val RuntimeVer = "2.3.1"
  const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${RuntimeVer}"
  const val LifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${RuntimeVer}"

  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-savedstate
  private const val ViewModelVer = "2.3.1"
  const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${ViewModelVer}"
  const val LifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${ViewModelVer}"
  const val LifecycleViewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${ViewModelVer}"

  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-ktx
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-core
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-core-ktx
  private const val LiveDataVer = "2.3.1"
  const val LifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:${LiveDataVer}" //Contains LiveData Core
  const val LifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${LiveDataVer}"  //Contains LiveData CoreKtx
  const val LifecycleLiveDataCore = "androidx.lifecycle:lifecycle-livedata-core:${LiveDataVer}"
  const val LifecycleLiveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:${LiveDataVer}"

  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-common
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-common-java8
  private const val LifecycleCommonVer = "2.3.1"
  const val LifecycleCommon = "androidx.lifecycle:lifecycle-common:${LifecycleCommonVer}"
  const val LifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${LifecycleCommonVer}"

  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-compiler
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-process
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-service
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-reactivestreams
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-reactivestreams-ktx
  private const val LifecycleOtherVer = "2.3.1"
  const val LifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${LifecycleOtherVer}"
  const val LifecycleProcess = "androidx.lifecycle:lifecycle-process:${LifecycleOtherVer}"
  const val LifecycleService = "androidx.lifecycle:lifecycle-service:${LifecycleOtherVer}"
  const val LifecycleReactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams:${LifecycleOtherVer}"
  const val LifecycleReactiveStreamsKtx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${LifecycleOtherVer}"

  // https://mvnrepository.com/artifact/androidx.room/room-runtime
  // https://mvnrepository.com/artifact/androidx.room/room-compiler
  // https://mvnrepository.com/artifact/androidx.room/room-rxjava2
  // https://mvnrepository.com/artifact/androidx.room/room-common
  // https://mvnrepository.com/artifact/androidx.room/room-ktx
  private const val RoomLibVer = "2.3.0"
  const val RoomRuntime = "androidx.room:room-runtime:${RoomLibVer}"
  const val RoomCompiler = "androidx.room:room-compiler:${RoomLibVer}"
  const val RoomRxJava2 = "androidx.room:room-rxjava2:${RoomLibVer}"
  const val RoomCommon = "androidx.room:room-common:${RoomLibVer}"
  const val RoomKtx = "androidx.room:room-ktx:${RoomLibVer}"

  // https://mvnrepository.com/artifact/androidx.paging/paging-runtime
  // https://mvnrepository.com/artifact/androidx.paging/paging-runtime-ktx
  // https://mvnrepository.com/artifact/androidx.paging/paging-common
  // https://mvnrepository.com/artifact/androidx.paging/paging-common-ktx
  // https://mvnrepository.com/artifact/androidx.paging/paging-rxjava2
  // https://mvnrepository.com/artifact/androidx.paging/paging-rxjava2-ktx
  private const val PagingLibVer = "2.1.2"
  const val PagingRuntime = "androidx.paging:paging-runtime:${PagingLibVer}"
  const val PagingRuntimeKtx = "androidx.paging:paging-runtime-ktx:${PagingLibVer}"
  const val PagingCommon = "androidx.paging:paging-common:${PagingLibVer}"
  const val PagingCommonKtx = "androidx.paging:paging-common-ktx:${PagingLibVer}"
  const val PagingRxJava2 = "androidx.paging:paging-rxjava2:${PagingLibVer}"
  const val PagingRxJava2Ktx = "androidx.paging:paging-rxjava2-ktx:${PagingLibVer}"

  // https://mvnrepository.com/artifact/androidx.navigation/navigation-fragment
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-fragment-ktx
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-ui
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-ui-ktx
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-runtime
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-runtime-ktx
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-common
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-common-ktx
  private const val NavigationLibVer = "2.3.5"
  const val NavigationFragment = "androidx.navigation:navigation-fragment:${NavigationLibVer}"
  const val NavigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${NavigationLibVer}"
  const val NavigationUI = "androidx.navigation:navigation-ui:${NavigationLibVer}"
  const val NavigationUIKtx = "androidx.navigation:navigation-ui-ktx:${NavigationLibVer}"
  const val NavigationRuntime = "androidx.navigation:navigation-runtime:${NavigationLibVer}"
  const val NavigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:${NavigationLibVer}"
  const val NavigationCommon = "androidx.navigation:navigation-common:${NavigationLibVer}"
  const val NavigationCommonKtx = "androidx.navigation:navigation-common-ktx:${NavigationLibVer}"
}

/**
 * Desc: Http Libs
 */
object HttpLibs {
  // https://github.com/square/retrofit
  // https://mvnrepository.com/artifact/com.squareup.retrofit2
  // https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit
  // https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson
  // https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-moshi
  // https://mvnrepository.com/artifact/com.squareup.retrofit2/adapter-rxjava2
  // https://mvnrepository.com/artifact/com.squareup.retrofit2/adapter-rxjava3
  private const val RetrofitVer = "2.9.0"
  const val Retrofit = "com.squareup.retrofit2:retrofit:${RetrofitVer}"
  const val RetrofitConverterGson = "com.squareup.retrofit2:converter-gson:${RetrofitVer}"
  const val RetrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${RetrofitVer}"
  const val RetrofitAdapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${RetrofitVer}"
  const val RetrofitAdapterRxJava3 = "com.squareup.retrofit2:adapter-rxjava3:${RetrofitVer}"

  // https://github.com/square/okhttp
  // https://mvnrepository.com/artifact/com.squareup.okhttp3
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/logging-interceptor
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp-urlconnection
  private const val OkHttp3Ver = "4.9.1"
  const val OkHttp3 = "com.squareup.okhttp3:okhttp:${OkHttp3Ver}"
  const val OkHttp3Logging = "com.squareup.okhttp3:logging-interceptor:${OkHttp3Ver}"
  const val OkHttp3UrlConnection = "com.squareup.okhttp3:okhttp-urlconnection:${OkHttp3Ver}"
}

/**
 * Desc: Rx Libs
 */
object RxLibs {
  // https://github.com/ReactiveX/RxJava
  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxjava
  const val RxJava2 = "io.reactivex.rxjava2:rxjava:2.2.19"
  const val RxJava3 = "io.reactivex.rxjava3:rxjava:3.0.12"

  // https://github.com/ReactiveX/RxAndroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxandroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxandroid
  const val RxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.1.1"
  const val RxAndroid3 = "io.reactivex.rxjava3:rxandroid:3.0.0"

  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxkotlin
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxkotlin
  const val RxKotlin2 = "io.reactivex.rxjava2:rxkotlin2.4.0"
  const val RxKotlin3 = "io.reactivex.rxjava3:rxkotlin3.0.1"

  // https://github.com/tbruyelle/RxPermissions
  const val RxPermissions2 = "com.github.tbruyelle:rxpermissions:0.12"

  // https://github.com/ssseasonnn/RxDownload
  private const val RxDownloadVer = "1.1.2"
  const val RxDownload = "com.github.ssseasonnn:RxDownload:${RxDownloadVer}"
  const val RxDownloads = "com.github.ssseasonnn.RxDownload:rxdownload4:${RxDownloadVer}"
  const val RxDownloadManager = "com.github.ssseasonnn.RxDownload:rxdownload4-manager:${RxDownloadVer}"
  const val RxDownloadRecorder = "com.github.ssseasonnn.RxDownload:rxdownload4-recorder:${RxDownloadVer}"
  const val RxDownloadNotification = "com.github.ssseasonnn.RxDownload:rxdownload4-notification:${RxDownloadVer}"
}

/**
 * Desc: Image Loader
 */
object ImageLoaderLibs {
  // https://github.com/bumptech/glide
  private const val GlideVer = "4.12.0"
  const val Glide = "com.github.bumptech.glide:glide:${GlideVer}"
  const val GlideCompiler = "com.github.bumptech.glide:compiler:${GlideVer}"
  const val GlideLoaderOkHttp3 = "com.github.bumptech.glide:okhttp3-integration:${GlideVer}"

  // https://github.com/coil-kt/coil
  const val Coil = "io.coil-kt:coil:1.2.1"

  // https://github.com/facebook/fresco
  const val Fresco = "com.facebook.fresco:fresco:2.4.0"
}

/**
 * Desc: Log,Flurry,Performance Libs
 */
object AnalyticLibs {
  // https://github.com/JakeWharton/timber
  const val Timber = "com.jakewharton.timber:timber:4.7.1"

  // https://github.com/square/leakcanary
  private const val LeakCanaryVer = "2.7"
  const val LeakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${LeakCanaryVer}"
  const val LeakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${LeakCanaryVer}"
}

/**
 * Desc: UILib, CustomView
 */
object WidgetLibs {
  // https://github.com/nex3z/FlowLayout
  const val FlowLayout = "com.nex3z:flow-layout:1.3.2"

  // https://github.com/PhilJay/MPAndroidChart
  const val MPAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"

  // https://github.com/aurelhubert/ahbottomnavigation
  const val AHBottomNavigation = "com.aurelhubert:ahbottomnavigation:2.3.4"

  // https://github.com/hdodenhof/CircleImageView
  const val CircleImageView = "de.hdodenhof:circleimageview:3.1.0"

  // https://github.com/chrisbanes/PhotoView
  const val PhotoView = "com.github.chrisbanes:PhotoView:2.3.0"

  // https://github.com/gyf-dev/ImmersionBar
  const val ImmersionBar = "com.gyf.immersionbar:immersionbar:3.0.0"
  const val ImmersionBarKtx = "com.gyf.immersionbar:immersionbar-ktx:3.0.0"
  const val ImmersionBarFragment = "com.gyf.immersionbar:immersionbar-components:3.0.0"

  // https://github.com/CymChad/BaseRecyclerViewAdapterHelper
  const val BaseRecyclerViewAdapterHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.46"

  // https://github.com/drakeet/MultiType
  // https://github.com/PureWriter/about-page
  const val AboutPage = "me.drakeet.support:about:2.4.1"
  const val MultiType = "me.drakeet.multitype:multitype:4.2.0"

  // https://github.com/airbnb/lottie-android
  // https://mvnrepository.com/artifact/com.airbnb.android/lottie
  const val Lottie = "com.airbnb.android:lottie:3.4.1"

  // https://github.com/scwang90/SmartRefreshLayout
  private const val SmartRefreshVer = "2.0.1"
  const val SmartRefreshCore = "com.scwang.smart:refresh-layout-kernel:${SmartRefreshVer}"
  const val SmartRefreshHeaderClassic = "com.scwang.smart:refresh-header-classics:${SmartRefreshVer}"
  const val SmartRefreshHeaderRadar = "com.scwang.smart:refresh-header-radar:${SmartRefreshVer}"
  const val SmartRefreshHeaderFalsify = "com.scwang.smart:refresh-header-falsify:${SmartRefreshVer}"
  const val SmartRefreshHeaderMaterial = "com.scwang.smart:refresh-header-material:${SmartRefreshVer}"
  const val SmartRefreshHeaderTwoLevel = "com.scwang.smart:refresh-header-two-level:${SmartRefreshVer}"
  const val SmartRefreshFooterBall = "com.scwang.smart:refresh-footer-ball:${SmartRefreshVer}"
  const val SmartRefreshFooterClassic = "com.scwang.smart:refresh-footer-classics:${SmartRefreshVer}"

  // https://github.com/afollestad/material-dialogs
  private const val MaterialDialogVer = "3.3.0"
  const val MaterialDialogCore = "com.afollestad.material-dialogs:core:${MaterialDialogVer}"
  const val MaterialDialogInput = "com.afollestad.material-dialogs:input:${MaterialDialogVer}"
  const val MaterialDialogFiles = "com.afollestad.material-dialogs:files:${MaterialDialogVer}"
  const val MaterialDialogColor = "com.afollestad.material-dialogs:color:${MaterialDialogVer}"
  const val MaterialDialogDatetime = "com.afollestad.material-dialogs:datetime:${MaterialDialogVer}"
  const val MaterialDialogBottomSheets = "com.afollestad.material-dialogs:bottomsheets:${MaterialDialogVer}"
  const val MaterialDialogLifecycle = "com.afollestad.material-dialogs:lifecycle:${MaterialDialogVer}"
}

/**
 * Desc: Test Libs
 */
object TestLibs {
  const val JUnit = "junit:junit:4.12"

  // https://mvnrepository.com/artifact/org.mockito
  const val MockitoCore = "org.mockito:mockito-core:3.1.0"

  // https://mvnrepository.com/artifact/com.android.support.test
  // https://mvnrepository.com/artifact/com.android.support.test/runner
  const val Runner = "com.android.support.test:runner:1.0.2"
  const val AndroidJUnitRunner = "android.support.test.runner.AndroidJUnitRunner"

  // https://mvnrepository.com/artifact/com.android.support.test.espresso
  private const val EspressoVer = "3.0.2"
  const val EspressoCore = "com.android.support.test.espresso:espresso-core:${EspressoVer}"
  const val EspressoContrib = "com.android.support.test.espresso:espresso-contrib:${EspressoVer}"
  const val EspressoIntents = "com.android.support.test.espresso:espresso-intents:${EspressoVer}"
}
