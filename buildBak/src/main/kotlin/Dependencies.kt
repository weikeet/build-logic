@file:Suppress("unused")

/**
 * 选择 DependenceLibrary 时需要注意:
 * 1. 打开连接查看依赖的 repositories (Google/MavenCenter/jitpack)
 * 2. 不同版本内容
 * 3. 混淆内容
 */

object Versions {
  const val minSdk = 21
  const val targetSdk = 32
  const val compileSdk = 32
  const val buildTools = "32.0.0"

  const val KotlinVer = "1.7.10"
}

object PluginLibs {
  // https://github.com/shwenzhang/AndResGuard
  const val AndResGuardPlugin = "com.tencent.mm:AndResGuard-gradle-plugin:1.2.21"

  // https://github.com/ben-manes/gradle-versions-plugin
  const val GradleVersionPlugin = "com.github.ben-manes:gradle-versions-plugin:0.42.0"

  const val KotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KotlinVer}"
}

// desc: Android X library
// link: https://developer.android.com/jetpack/androidx/versions
object AndroidXLibs {
  // Contains: Core Fragment AppCompatResources CursorAdapter DrawerLayout Collection Annotation
  const val AppCompat = "androidx.appcompat:appcompat:1.5.1"

  const val MaterialDesign = "com.google.android.material:material:1.6.1"

  const val Core = "androidx.core:core:1.9.0"
  const val CoreKtx = "androidx.core:core-ktx:1.9.0"

  // Contains: Activity(Ktx) Core(Ktx) ViewModel(Ktx) LiveDataCore(Ktx)
  const val Fragment = "androidx.fragment:fragment:1.5.3"
  const val FragmentKtx = "androidx.fragment:fragment-ktx:1.5.3"

  const val Annotation = "androidx.annotation:annotation:1.4.0"

  const val RecyclerView = "androidx.recyclerview:recyclerview:1.2.1"

  const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"

  const val CustomTabs = "androidx.browser:browser:1.4.0"

  // https://mvnrepository.com/artifact/androidx.viewpager2/viewpager2
  const val ViewPager2 = "androidx.viewpager2:viewpager2:1.0.0"

  const val VectorDrawable = "androidx.vectordrawable:vectordrawable:1.1.0"
  const val VectorDrawableAnimated = "androidx.vectordrawable:vectordrawable-animated:1.1.0"
}

// Desc: Google official architecture
// link: https://developer.android.com/jetpack/androidx/explorer?case=popular
object ArchitectureLibs {
  private const val RuntimeVer = "2.4.1"
  const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${RuntimeVer}"
  const val LifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${RuntimeVer}"

  private const val ViewModelVer = "2.4.1"
  const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${ViewModelVer}"
  const val LifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${ViewModelVer}"
  const val LifecycleViewModelSaveState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${ViewModelVer}"

  private const val LiveDataVer = "2.4.1"
  const val LifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:${LiveDataVer}" //Contains LiveData Core
  const val LifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${LiveDataVer}"  //Contains LiveData CoreKtx
  const val LifecycleLiveDataCore = "androidx.lifecycle:lifecycle-livedata-core:${LiveDataVer}"
  const val LifecycleLiveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:${LiveDataVer}"

  private const val LifecycleCommonVer = "2.4.1"
  const val LifecycleCommon = "androidx.lifecycle:lifecycle-common:${LifecycleCommonVer}"
  const val LifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8:${LifecycleCommonVer}"

  private const val LifecycleOtherVer = "2.4.1"
  const val LifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${LifecycleOtherVer}"
  const val LifecycleProcess = "androidx.lifecycle:lifecycle-process:${LifecycleOtherVer}"
  const val LifecycleService = "androidx.lifecycle:lifecycle-service:${LifecycleOtherVer}"

  // https://mvnrepository.com/artifact/androidx.startup
  const val Startup = "androidx.startup:startup-runtime:1.1.1"

  private const val WorkManagerLibVer = "2.7.1"
  const val WorkManager = "androidx.work:work-runtime:$WorkManagerLibVer"
  const val WorkManagerKtx = "androidx.work:work-runtime-ktx:$WorkManagerLibVer"

  // https://mvnrepository.com/artifact/androidx.room
  private const val RoomLibVer = "2.4.1"
  const val RoomRuntime = "androidx.room:room-runtime:${RoomLibVer}"
  const val RoomCompiler = "androidx.room:room-compiler:${RoomLibVer}"
  const val RoomRxJava2 = "androidx.room:room-rxjava2:${RoomLibVer}"
  const val RoomCommon = "androidx.room:room-common:${RoomLibVer}"
  const val RoomKtx = "androidx.room:room-ktx:${RoomLibVer}"

  // https://mvnrepository.com/artifact/androidx.paging
  private const val PagingLibVer = "3.1.0"
  const val PagingRuntime = "androidx.paging:paging-runtime:${PagingLibVer}"
  const val PagingRuntimeKtx = "androidx.paging:paging-runtime-ktx:${PagingLibVer}"
  const val PagingCommon = "androidx.paging:paging-common:${PagingLibVer}"
  const val PagingCommonKtx = "androidx.paging:paging-common-ktx:${PagingLibVer}"
  const val PagingRxJava2 = "androidx.paging:paging-rxjava2:${PagingLibVer}"
  const val PagingRxJava2Ktx = "androidx.paging:paging-rxjava2-ktx:${PagingLibVer}"

  // https://mvnrepository.com/artifact/androidx.navigation
  private const val NavigationLibVer = "2.4.2"
  const val NavigationFragment = "androidx.navigation:navigation-fragment:${NavigationLibVer}"
  const val NavigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${NavigationLibVer}"
  const val NavigationUI = "androidx.navigation:navigation-ui:${NavigationLibVer}"
  const val NavigationUIKtx = "androidx.navigation:navigation-ui-ktx:${NavigationLibVer}"
  const val NavigationRuntime = "androidx.navigation:navigation-runtime:${NavigationLibVer}"
  const val NavigationRuntimeKtx = "androidx.navigation:navigation-runtime-ktx:${NavigationLibVer}"
  const val NavigationCommon = "androidx.navigation:navigation-common:${NavigationLibVer}"
  const val NavigationCommonKtx = "androidx.navigation:navigation-common-ktx:${NavigationLibVer}"
}

object DepLibs {
  // https://github.com/JetBrains/kotlin
  const val KotlinLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KotlinVer}"
  const val KotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KotlinVer}"

  // https://github.com/Kotlin/kotlinx.coroutines
  private const val KotlinXVer = "1.6.4"
  const val KotlinXCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${KotlinXVer}"
  const val KotlinXAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${KotlinXVer}"

  // https://github.com/guolindev/PermissionX
  const val PermissionX = "com.guolindev.permissionx:permissionx:1.7.1"

  // https://github.com/tiann/FreeReflection
  const val FreeReflection = "com.github.tiann:FreeReflection:3.1.0"

  // https://github.com/tiann/epic
  const val Epic = "com.github.tiann:epic:0.11.2"

  // https://github.com/anggrayudi/SimpleStorage
  const val SimpleStorage = "com.anggrayudi:storage:1.4.1"

  // https://github.com/HokoFly/HokoBlur
  const val HokoBlur = "io.github.hokofly:hoko-blur:1.3.7"

  // https://github.com/wasabeef/Blurry
  const val Blurry = "jp.wasabeef:blurry:4.0.1"

  // https://github.com/greenrobot/EventBus
  const val EventBus = "org.greenrobot:eventbus:3.3.1"

  // https://github.com/google/gson
  const val Gson = "com.google.code.gson:gson:2.9.0"

  // https://github.com/jhy/jsoup
  const val JSoup = "org.jsoup:jsoup:1.14.3"

  // https://github.com/alibaba/ARouter
  const val ARouter = "com.alibaba:arouter-api:1.5.2"
  const val ARouterCompiler = "com.alibaba:arouter-compiler:1.5.2"
  const val ARouterRegisterPlugin = "com.alibaba:arouter-register:1.0.2"

  // https://github.com/bilibili/ijkplayer
  private const val IjkPlayerVer = "0.8.8"
  const val IjkPlayer = "tv.danmaku.ijk.media:ijkplayer-java:${IjkPlayerVer}"
  const val IjkPlayerArm64 = "tv.danmaku.ijk.media:ijkplayer-arm64:${IjkPlayerVer}"
  const val IjkPlayerArmv7a = "tv.danmaku.ijk.media:ijkplayer-armv7a:${IjkPlayerVer}"

  // https://github.com/bilibili/DanmakuFlameMaster
  const val DanmakuFlameMaster = "com.github.ctiao:DanmakuFlameMaster:0.9.25"
  const val DanmakuNdkBitmap = "com.github.ctiao:ndkbitmap-armv7a:0.9.21"

  // https://mvnrepository.com/artifact/com.google.dagger
  private const val Dagger2Ver = "2.44"
  const val Dagger2 = "com.google.dagger:dagger:${Dagger2Ver}"
  const val Dagger2Compiler = "com.google.dagger:dagger-compiler:${Dagger2Ver}"
  const val Dagger2Android = "com.google.dagger:dagger-android:${Dagger2Ver}"
  const val Dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Dagger2Ver}"
  const val Dagger2AndroidProcessor = "com.google.dagger:dagger-android-processor:${Dagger2Ver}"
  private const val HiltVer = "2.44"
  const val Hilt = "com.google.dagger:hilt-android:${HiltVer}"
  const val HiltCompiler = "com.google.dagger:hilt-android-compiler:${HiltVer}"
}

/**
 * Desc: Http Libs
 */
object HttpLibs {
  // https://github.com/square/retrofit
  // https://mvnrepository.com/artifact/com.squareup.retrofit2
  private const val RetrofitVer = "2.9.0"
  const val Retrofit = "com.squareup.retrofit2:retrofit:${RetrofitVer}"
  const val RetrofitConverterGson = "com.squareup.retrofit2:converter-gson:${RetrofitVer}"
  const val RetrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${RetrofitVer}"
  const val RetrofitAdapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${RetrofitVer}"
  const val RetrofitAdapterRxJava3 = "com.squareup.retrofit2:adapter-rxjava3:${RetrofitVer}"

  // https://github.com/square/okhttp
  // https://mvnrepository.com/artifact/com.squareup.okhttp3
  private const val OkHttp3Ver = "4.10.0"
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
  const val RxJava2 = "io.reactivex.rxjava2:rxjava:2.2.21"
  const val RxJava3 = "io.reactivex.rxjava3:rxjava:3.1.5"

  // https://github.com/ReactiveX/RxAndroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxandroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxandroid
  const val RxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.1.1"
  const val RxAndroid3 = "io.reactivex.rxjava3:rxandroid:3.0.0"

  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxkotlin
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxkotlin
  const val RxKotlin2 = "io.reactivex.rxjava2:rxkotlin2.4.0"
  const val RxKotlin3 = "io.reactivex.rxjava3:rxkotlin3.0.1"

  // https://github.com/ssseasonnn/RxDownload
  private const val RxDownloadVer = "1.1.4"
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
  private const val GlideVer = "4.14.2"
  const val Glide = "com.github.bumptech.glide:glide:${GlideVer}"
  const val GlideCompiler = "com.github.bumptech.glide:compiler:${GlideVer}"

  // https://muyangmin.github.io/glide-docs-cn/int/okhttp3.html
  const val GlideLoaderOkHttp3 = "com.github.bumptech.glide:okhttp3-integration:4.11.0"

  // https://github.com/wasabeef/glide-transformations
  const val GlideTransformations = "jp.wasabeef:glide-transformations:4.3.0"
  const val GlideGPUImage = "jp.co.cyberagent.android:gpuimage:2.1.0" // If you want to use the GPU Filters

  // https://github.com/coil-kt/coil
  const val Coil = "io.coil-kt:coil:2.1.0"

  // https://github.com/facebook/fresco
  const val Fresco = "com.facebook.fresco:fresco:2.6.0"

  // https://github.com/Curzibn/Luban
  const val LubanCompress = "top.zibin:Luban:1.1.8"
}

/**
 * Desc: Log,Flurry,Performance Libs
 */
object AnalyticLibs {
  // https://github.com/JakeWharton/timber
  const val Timber = "com.jakewharton.timber:timber:5.0.1"

  // https://github.com/square/leakcanary
  private const val LeakCanaryVer = "2.9.1"
  const val LeakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${LeakCanaryVer}"
  const val LeakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${LeakCanaryVer}"
}

/**
 * Desc: UILib, CustomView
 */
object WidgetLibs {
  // https://github.com/nex3z/FlowLayout
  const val FlowLayout = "com.nex3z:flow-layout:1.3.3"

  // https://github.com/PhilJay/MPAndroidChart
  const val MPAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"

  // https://github.com/chrisbanes/PhotoView
  const val PhotoView = "com.github.chrisbanes:PhotoView:2.3.0"

  // https://github.com/drakeet/MultiType
  // https://github.com/PureWriter/about-page
  // https://github.com/PureWriter/ToastCompat
  const val AboutPage = "com.drakeet.about:about:2.5.1"
  const val MultiType = "com.drakeet.multitype:multitype:4.3.0"
  const val ToastCompat = "me.drakeet.support:toastcompat:1.1.0"

  // https://github.com/airbnb/lottie-android
  const val Lottie = "com.airbnb.android:lottie:5.2.0"

  // https://github.com/scwang90/SmartRefreshLayout
  private const val SmartRefreshVer = "2.0.5"
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
