@file:Suppress("unused")

/**
 * 选择DependenceLibrary时需要注意:
 * 1. 打开连接查看依赖的repositories
 * 2. 是否是AndroidX特有
 * 3. 不同版本内容
 * 4. 混淆内容
 */

object Versions {
  const val minSdkVersion = 21
  const val targetSdkVersion = 29
  const val compileSdkVersion = 29
  const val buildToolsVersion = "29.0.3"
}

object DepLibs {
  // CheckOn 20200814 AndroidPlugin
  // https://mvnrepository.com/artifact/com.android.tools.build/gradle?repo=google
  const val AndroidPlugin = "com.android.tools.build:gradle:4.0.1"

  // CheckOn 20200814 AndResGuardPlugin
  // https://github.com/shwenzhang/AndResGuard
  const val AndResGuardPlugin = "com.tencent.mm:AndResGuard-gradle-plugin:1.2.18"

  // CheckOn 20200814 KotlinLib
  // https://github.com/JetBrains/kotlin
  private const val KotlinVer = "1.4.0"
  const val KotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinVer}"
  const val KotlinLib = "org.jetbrains.kotlin:kotlin-stdlib:${KotlinVer}" // Java6 及以上版本
  const val KotlinLib7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KotlinVer}" // 增加了对 JDK7 中某些特性支持
  const val KotlinLib8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KotlinVer}" // 增加了对 JDK8 中某些特性支持

  // CheckOn 20200814 EventBus
  // https://github.com/greenrobot/EventBus
  const val EventBus = "org.greenrobot:eventbus:3.2.0"

  // CheckOn 20200814 Gson
  // https://github.com/google/gson
  const val Gson = "com.google.code.gson:gson:2.8.6"

  // CheckOn 20200814 JSoup
  // https://github.com/jhy/jsoup
  const val JSoup = "org.jsoup:jsoup:1.13.1"

  // CheckOn 20200814 ARouter
  // https://github.com/alibaba/ARouter
  const val ARouter = "com.alibaba:arouter-api:1.5.0"
  const val ARouterCompiler = "com.alibaba:arouter-compiler:1.2.2"
  const val ARouterRegisterPlugin = "com.alibaba:arouter-register:1.0.2"

  // CheckOn 20200814 IjkPlayerVer
  // https://github.com/bilibili/ijkplayer
  private const val IjkPlayerVer = "0.8.8"
  const val IjkPlayer = "tv.danmaku.ijk.media:ijkplayer-java:${IjkPlayerVer}"
  const val IjkPlayerArm64 = "tv.danmaku.ijk.media:ijkplayer-arm64:${IjkPlayerVer}"
  const val IjkPlayerArmV7a = "tv.danmaku.ijk.media:ijkplayer-armv7a:${IjkPlayerVer}"

  // CheckOn 20200814 Danmaku
  // https://github.com/bilibili/DanmakuFlameMaster
  const val DanmakuFlameMaster = "com.github.ctiao:DanmakuFlameMaster:0.9.25"
  const val DanmakuNdkBitmap = "com.github.ctiao:ndkbitmap-armv7a:0.9.21"

  // CheckOn 20200814 Dagger2
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
 * Desc: Android X library
 */
object AndroidXLibs {
  private const val SupportXLibVer = "1.1.0"

  // Contains Core Fragment AppCompatResources CursorAdapter DrawerLayout Collection Annotation
  // https://mvnrepository.com/artifact/androidx.appcompat/
  const val AppCompat = "androidx.appcompat:appcompat:1.2.0"
  const val AppCompatResources = "androidx.appcompat:appcompat-resources:1.2.0"

  // https://mvnrepository.com/artifact/com.google.android.material/material
  const val MaterialDesign = "com.google.android.material:material:1.2.0"

  // https://mvnrepository.com/artifact/androidx.legacy/legacy-support-v4
  const val SupportV4 = "androidx.legacy:legacy-support-v4:1.0.0"

  // https://mvnrepository.com/artifact/androidx.cardview/cardview
  const val CardView = "androidx.cardview:cardview:1.0.0"

  // https://mvnrepository.com/artifact/androidx.browser/browser
  const val CustomTabs = "androidx.browser:browser:1.2.0"

  // https://mvnrepository.com/artifact/androidx.recyclerview/recyclerview
  const val RecyclerView = "androidx.recyclerview:recyclerview:${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.vectordrawable/vectordrawable
  const val VectorDrawable = "androidx.vectordrawable:vectordrawable:${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.vectordrawable/vectordrawable-animated
  const val VectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated':${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.annotation/annotation
  const val Annotation = "androidx.annotation:annotation:${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.constraintlayout/constraintlayout
  const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.0.1"

  // https://mvnrepository.com/artifact/androidx.core/core
  // https://mvnrepository.com/artifact/androidx.core/core-ktx
  const val Core = "androidx.core:core:1.3.0"
  const val CoreKtx = "androidx.core:core-ktx:1.3.0"

  // https://mvnrepository.com/artifact/androidx.activity/activity
  // https://mvnrepository.com/artifact/androidx.activity/activity-ktx
  const val Activity = "androidx.activity:activity:${SupportXLibVer}"
  const val ActivityKtx = "androidx.activity:activity-ktx:${SupportXLibVer}"

  // Contains Activity(Ktx) Core(Ktx) ViewModel(Ktx) LiveDataCore(Ktx)
  // https://mvnrepository.com/artifact/androidx.fragment/fragment
  // https://mvnrepository.com/artifact/androidx.fragment/fragment-ktx
  const val Fragment = "androidx.fragment:fragment:${SupportXLibVer}"
  const val FragmentKtx = "androidx.fragment:fragment-ktx:${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.cursoradapter/cursoradapter
  const val CursorAdapter = "androidx.cursoradapter:cursoradapter:${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.drawerlayout/drawerlayout
  const val DrawerLayout = "androidx.drawerlayout:drawerlayout:${SupportXLibVer}"

  // https://mvnrepository.com/artifact/androidx.collection/collection
  const val Collection = "androidx.collection:${SupportXLibVer}"
}

/**
 * Desc: Google official architecture
 * Url: https://developer.android.com/topic/libraries/architecture/index.html
 * Ktx可与Java版本同时依赖，Ktx与Java存在类似功能的单独使用即可
 */
object ArchitectureLibs {
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-extensions
  @Deprecated("Use Runtime/ViewModel/LiveData")
  const val LifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"

  // CheckOn 20200814 Runtime
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx
  private const val RuntimeVer = "2.2.0"
  const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${RuntimeVer}"
  const val LifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${RuntimeVer}"

  // CheckOn 20200814 ViewModel
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-savedstate
  private const val ViewModelVer = "2.2.0"
  const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${ViewModelVer}"
  const val LifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${ViewModelVer}"
  const val LifecycleViewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${ViewModelVer}"

  // CheckOn 20200814 LiveData
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-ktx
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-core
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-core-ktx
  private const val LiveDataVer = "2.2.0"
  const val LifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:${LiveDataVer}" //Contains LiveData Core
  const val LifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${LiveDataVer}"  //Contains LiveData CoreKtx
  const val LifecycleLiveDataCore = "androidx.lifecycle:lifecycle-livedata-core:${LiveDataVer}"
  const val LifecycleLiveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:${LiveDataVer}"

  // CheckOn 20200814 LifecycleCommon
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-common
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-common-java8
  private const val LifecycleCommonVer = "2.2.0"
  const val LifecycleCommon = "androidx.lifecycle:lifecycle-common:${LifecycleCommonVer}"
  const val LifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${LifecycleCommonVer}"

  // CheckOn 20200814 LifecycleOther
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-compiler
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-process
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-service
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-reactivestreams
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-reactivestreams-ktx
  private const val LifecycleOtherVer = "2.2.0"
  const val LifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${LifecycleOtherVer}"
  const val LifecycleProcess = "androidx.lifecycle:lifecycle-process:${LifecycleOtherVer}"
  const val LifecycleService = "androidx.lifecycle:lifecycle-service:${LifecycleOtherVer}"
  const val LifecycleReactiveStreams = "androidx.lifecycle:lifecycle-reactivestreams:${LifecycleOtherVer}"
  const val LifecycleReactiveStreamsKtx = "androidx.lifecycle:lifecycle-reactivestreams-ktx:${LifecycleOtherVer}"

  // CheckOn 20200814 Room
  // https://mvnrepository.com/artifact/androidx.room/room-runtime
  // https://mvnrepository.com/artifact/androidx.room/room-compiler
  // https://mvnrepository.com/artifact/androidx.room/room-rxjava2
  // https://mvnrepository.com/artifact/androidx.room/room-common
  // https://mvnrepository.com/artifact/androidx.room/room-ktx
  private const val RoomLibVer = "2.2.5"
  const val RoomRuntime = "androidx.room:room-runtime:${RoomLibVer}"
  const val RoomCompiler = "androidx.room:room-compiler:${RoomLibVer}"
  const val RoomRxJava2 = "androidx.room:room-rxjava2:${RoomLibVer}"
  const val RoomCommon = "androidx.room:room-common:${RoomLibVer}"
  const val RoomKtx = "androidx.room:room-ktx:${RoomLibVer}"

  // CheckOn 20200814 Paging
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

  // CheckOn 20200814 Navigation
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-fragment
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-fragment-ktx
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-ui
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-ui-ktx
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-runtime
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-runtime-ktx
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-common
  // https://mvnrepository.com/artifact/androidx.navigation/navigation-common-ktx
  private const val NavigationLibVer = "2.3.0"
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
  // CheckOn 20200814 Retrofit
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

  // CheckOn 20200814 OkHttp
  // https://github.com/square/okhttp
  // https://mvnrepository.com/artifact/com.squareup.okhttp3
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/logging-interceptor
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp-urlconnection
  private const val OkHttpVer = "4.8.1"
  const val OkHttp = "com.squareup.okhttp3:okhttp:${OkHttpVer}"
  const val OkHttpLogging = "com.squareup.okhttp3:logging-interceptor:${OkHttpVer}"
  const val OkHttpUrlConnection = "com.squareup.okhttp3:okhttp-urlconnection:${OkHttpVer}"
  private const val OkHttp3Ver = "3.14.9"
  const val OkHttp3 = "com.squareup.okhttp3:okhttp:${OkHttp3Ver}"
  const val OkHttp3Logging = "com.squareup.okhttp3:logging-interceptor:${OkHttp3Ver}"
  const val OkHttp3UrlConnection = "com.squareup.okhttp3:okhttp-urlconnection:${OkHttp3Ver}"
}

/**
 * Desc: Rx Libs
 */
object RxLibs {
  // CheckOn 20200814 RxJava
  // https://github.com/ReactiveX/RxJava
  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxjava
  const val RxJava2 = "io.reactivex.rxjava2:rxjava:2.2.19"
  const val RxJava3 = "io.reactivex.rxjava3:rxjava:3.0.2"

  // CheckOn 20200814 RxAndroid
  // https://github.com/ReactiveX/RxAndroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxandroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxandroid
  const val RxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.1.1"
  const val RxAndroid3 = "io.reactivex.rxjava3:rxandroid:3.0.0"

  // CheckOn 20200814 RxKotlin
  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxkotlin
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxkotlin
  const val RxKotlin2 = "io.reactivex.rxjava2:rxkotlin2.4.0"
  const val RxKotlin3 = "io.reactivex.rxjava3:rxkotlin3.0.0"

  // CheckOn 20200814 RxPermissions
  // https://github.com/tbruyelle/RxPermissions
  const val RxPermissions2 = "com.github.tbruyelle:rxpermissions:0.12"

  // CheckOn 20200814 RxDownload
  // https://github.com/ssseasonnn/RxDownload
  private const val RxDownloadVer = "1.0.9"
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
  // CheckOn 20200814 Glide
  // https://github.com/bumptech/glide
  private const val GlideVer = "4.11.0"
  const val Glide = "com.github.bumptech.glide:glide:${GlideVer}"
  const val GlideCompiler = "com.github.bumptech.glide:compiler:${GlideVer}"
  const val GlideLoaderOkHttp3 = "com.github.bumptech.glide:okhttp3-integration:${GlideVer}"

  // CheckOn 20200814 Coil
  // https://github.com/coil-kt/coil
  const val Coil = "io.coil-kt:coil:0.11.0"

  // CheckOn 20200814 Fresco
  // https://github.com/facebook/fresco
  const val Fresco = "com.facebook.fresco:fresco:2.3.0"
}

/**
 * Desc: Log,Flurry,Performance Libs
 */
object AnalyticLibs {
  // CheckOn 20200814 Timber
  // https://github.com/JakeWharton/timber
  const val Timber = "com.jakewharton.timber:timber:4.7.1"

  // CheckOn 20200814 LeakCanary
  // https://github.com/square/leakcanary
  private const val LeakCanaryVer = "2.4"
  const val LeakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${LeakCanaryVer}"
  const val LeakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${LeakCanaryVer}"

  // CheckOn 20200814 AndroidGodEye
  // https://github.com/Kyson/AndroidGodEye
  private const val GodEyeVer = "3.1.2" //性能检测
  const val GodEyeCore = "cn.hikyson.godeye:godeye-core:${GodEyeVer}"
  const val GodEyeToolBox = "cn.hikyson.godeye:godeye-toolbox:${GodEyeVer}"
  const val GodEyeMonitor = "cn.hikyson.godeye:godeye-monitor:${GodEyeVer}"
  const val GodEyeMonitorNoOp = "cn.hikyson.godeye:godeye-monitor-no-op:${GodEyeVer}"
}

/**
 * Desc: UILib, CustomView
 */
object WidgetLibs {
  // CheckOn 20200814 FlowLayout
  // https://github.com/nex3z/FlowLayout
  const val FlowLayout = "com.nex3z:flow-layout:1.3.1"

  // CheckOn 20200814 MPAndroidChart
  // https://github.com/PhilJay/MPAndroidChart
  const val MPAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"

  // CheckOn 20200814 BottomNavigation
  // https://github.com/aurelhubert/ahbottomnavigation
  const val AHBottomNavigation = "com.aurelhubert:ahbottomnavigation:2.3.4"

  // CheckOn 20200814 CircleImageView
  // https://github.com/hdodenhof/CircleImageView
  const val CircleImageView = "de.hdodenhof:circleimageview:3.1.0"

  // CheckOn 20200814 PhotoView
  // https://github.com/chrisbanes/PhotoView
  const val PhotoView = "com.github.chrisbanes:PhotoView:2.3.0"

  // CheckOn 20200814 ImmersionBar
  // https://github.com/gyf-dev/ImmersionBar
  const val ImmersionBar = "com.gyf.immersionbar:immersionbar:3.0.0"
  const val ImmersionBarKtx = "com.gyf.immersionbar:immersionbar-ktx:3.0.0"

  // CheckOn 20200814 BaseRecyclerViewAdapterHelper
  // https://github.com/CymChad/BaseRecyclerViewAdapterHelper
  const val BaseRecyclerViewAdapterHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.46"

  // CheckOn 20200814 Drakeet
  // https://github.com/drakeet/MultiType
  // https://github.com/PureWriter/about-page
  const val AboutPage = "me.drakeet.support:about:2.4.1"
  const val MultiType = "me.drakeet.multitype:multitype:4.2.0"

  // CheckOn 20200814 Lottie
  // https://github.com/airbnb/lottie-android
  // https://mvnrepository.com/artifact/com.airbnb.android/lottie
  const val Lottie = "com.airbnb.android:lottie:3.4.1"

  // CheckOn 20200814 SmartRefreshLayout
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

  // CheckOn 20200814 MaterialDialog
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
