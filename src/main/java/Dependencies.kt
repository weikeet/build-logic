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
  // Plugin
  // CheckOn 20200408 https://mvnrepository.com/artifact/com.android.tools.build/gradle?repo=google
  const val AndroidPlugin = "com.android.tools.build:gradle:3.6.3"

  // https://github.com/shwenzhang/AndResGuard
  const val AndResGuardPlugin = "com.tencent.mm:AndResGuard-gradle-plugin:1.2.17"

  // KotlinLib
  // CheckOn 20200408 https://github.com/JetBrains/kotlin
  private const val KotlinVer = "1.3.71"
  const val KotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${KotlinVer}"

  // kotlin-stdlib 面向 Java6 及以上版本
  const val KotlinLib = "org.jetbrains.kotlin:kotlin-stdlib:${KotlinVer}"

  // kotlin-stdlib-jdk7 增加了对 JDK7 中某些特性支持
  const val KotlinLib7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${KotlinVer}"

  // kotlin-stdlib-jdk8 增加了对 JDK8 中某些特性支持
  const val KotlinLib8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KotlinVer}"

  // Tools
  // CheckOn 20200408 https://github.com/greenrobot/EventBus
  const val EventBus = "org.greenrobot:eventbus:3.2.0"

  // https://github.com/greenrobot/greenDAO
  private const val GreenDaoVer = "3.2.2"
  const val GreenDaoPlugin = "org.greenrobot:greendao-gradle-plugin:${GreenDaoVer}"
  const val GreenDao = "org.greenrobot:greendao:${GreenDaoVer}"

  // CheckOn 20200408 https://github.com/google/gson
  const val Gson = "com.google.code.gson:gson:2.8.6"

  // https://github.com/jhy/jsoup
  const val Jsoup = "org.jsoup:jsoup:1.11.3"

  // CheckOn 20200426 https://github.com/alibaba/ARouter
  const val Arouter = "com.alibaba:arouter-api:1.5.0"
  const val ArouterCompiler = "com.alibaba:arouter-compiler:1.2.2"
  const val ArouterPlugin = "com.alibaba:arouter-register:1.0.2"

  // https://github.com/Tencent/tinker
  private const val TinkerVer = "1.9.1"
  const val TinkerPlugin = "com.tencent.tinker:tinker-patch-gradle-plugin:${TinkerVer}"
  const val TinkerLib = "com.tencent.tinker:tinker-android-lib:${TinkerVer}"
  const val TinkerAnno = "com.tencent.tinker:tinker-android-anno:${TinkerVer}"

  // https://github.com/bilibili/ijkplayer
  private const val IjkPlayerVer = "0.8.8"
  const val IjkPlayer = "tv.danmaku.ijk.media:ijkplayer-java:${IjkPlayerVer}"
  const val IjkPlayerArmV7a = "tv.danmaku.ijk.media:ijkplayer-armv7a:${IjkPlayerVer}"
  const val IjkPlayerArm64 = "tv.danmaku.ijk.media:ijkplayer-arm64:${IjkPlayerVer}"

  // https://github.com/YoKeyword/Fragmentation
  const val Fragmentation = "me.yokeyword:fragmentationx:1.0.1"

  // https://github.com/MindorksOpenSource/PRDownloader
  const val PrDownloader = "com.mindorks.android:prdownloader:0.6.0"

  // https://github.com/lingochamp/FileDownloader
  const val FileDownloader = "com.liulishuo.filedownloader:library:1.7.6"

  // https://github.com/bilibili/DanmakuFlameMaster
  const val DanmakuFlameMaster = "com.github.ctiao:DanmakuFlameMaster:0.9.25"
  const val DanmakuNdkBitmap = "com.github.ctiao:ndkbitmap-armv7a:0.9.21"

  // read smsVerifyCode https://github.com/stfalcon-studio/SmsVerifyCatcher
  const val SmsVerifyCode = "https://github.com/stfalcon-studio/SmsVerifyCatcher"

  private const val Dagger2Ver = "2.19"
  const val Dagger2 = "com.google.dagger:dagger:${Dagger2Ver}"
  const val Dagger2Android = "com.google.dagger:dagger-android:${Dagger2Ver}"
  const val Dagger2Compiler = "com.google.dagger:dagger-compiler:${Dagger2Ver}"
  const val Dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Dagger2Ver}"
  const val Dagger2AndroidProcessor = "com.google.dagger:dagger-android-processor:${Dagger2Ver}"

  const val Multidex = "com.android.support:multidex:1.0.3"
  const val JavaxAnnotation = "javax.annotation:jsr250-api:1.0"
}

/**
 * Desc: Android library
 * Latest update: 2019.10.17
 */
object AndroidLibs {
  const val SupportLibVer = "28.0.0"

  // Android AppCompat Library V7
  // https://mvnrepository.com/artifact/com.android.support/appcompat-v7
  const val AppcompatV7 = "com.android.support:appcompat-v7:${SupportLibVer}"

  // Material Components For Android
  // https://mvnrepository.com/artifact/com.android.support/design
  const val MaterialDesign = "com.android.support:design:${SupportLibVer}"

  // Android Support Library V4
  // https://mvnrepository.com/artifact/com.android.support/support-v4
  const val SupportV4 = "com.android.support:support-v4:${SupportLibVer}"

  // Android Support CardView V7
  // https://mvnrepository.com/artifact/com.android.support/cardview-v7
  const val CardViewV7 = "com.android.support:cardview-v7:${SupportLibVer}"

  // Android Support Custom Tabs
  // https://mvnrepository.com/artifact/com.android.support/customtabs
  const val CustomTabs = "com.android.support:customtabs:${SupportLibVer}"

  // Android Support RecyclerView V7
  // https://mvnrepository.com/artifact/com.android.support/recyclerview-v7
  const val RecyclerViewV7 = "com.android.support:recyclerview-v7:${SupportLibVer}"

  // vector drawable
  // https://mvnrepository.com/artifact/com.android.support/support-vector-drawable
  const val SupportVectorDrawable = "com.android.support:support-vector-drawable:${SupportLibVer}"

  // animated vector drawable
  // https://mvnrepository.com/artifact/com.android.support/animated-vector-drawable
  const val SupportAnimatedVectorDrawable = "com.android.support:animated-vector-drawable':${SupportLibVer}"

  // Android Support Library Annotations
  // https://mvnrepository.com/artifact/com.android.support/support-annotations
  const val SupportAnnotations = "com.android.support:support-annotations:${SupportLibVer}"

  // Android ConstraintLayout
  // https://mvnrepository.com/artifact/com.android.support.constraint/constraint-layout
  const val ConstraintLayout = "com.android.support.constraint:constraint-layout:1.1.3"
}

/**
 * Desc: Android X library
 * Latest update: 2020.04.24
 */
object AndroidXLibs {
  const val SupportXLibVer = "1.1.0"

  // Android AppCompat Library V7
  // https://mvnrepository.com/artifact/androidx.appcompat/appcompat
  const val AppCompat = "androidx.appcompat:appcompat:${SupportXLibVer}"

  // Legacy Support V4
  // https://mvnrepository.com/artifact/androidx.legacy/legacy-support-v4
  const val SupportV4 = "androidx.legacy:legacy-support-v4:1.0.0"

  // Material Design
  // https://mvnrepository.com/artifact/com.google.android.material/material
  const val MaterialDesign = "com.google.android.material:material:1.0.0"

  // Android Support CardView V7
  // https://mvnrepository.com/artifact/androidx.cardview/cardview
  const val CardView = "androidx.cardview:cardview:1.0.0"

  // Android Support Custom Tabs
  // https://mvnrepository.com/artifact/androidx.browser/browser
  const val CustomTabs = "androidx.browser:browser:1.2.0"

  // Android Support RecyclerView V7
  // https://mvnrepository.com/artifact/androidx.recyclerview/recyclerview
  const val RecyclerView = "androidx.recyclerview:recyclerview:${SupportXLibVer}"

  // Vector drawable
  // https://mvnrepository.com/artifact/androidx.vectordrawable/vectordrawable
  const val SupportVectorDrawable = "androidx.vectordrawable:vectordrawable:${SupportXLibVer}"

  // Animated vector drawable
  // https://mvnrepository.com/artifact/androidx.vectordrawable/vectordrawable-animated
  const val SupportAnimatedVectorDrawable = "androidx.vectordrawable:vectordrawable-animated':${SupportXLibVer}"

  // Android Support Library Annotations
  // https://mvnrepository.com/artifact/androidx.annotation/annotation
  const val Annotation = "androidx.annotation:annotation:${SupportXLibVer}"

  // Android ConstraintLayout
  // https://mvnrepository.com/artifact/androidx.constraintlayout/constraintlayout
  const val ConstraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"

  // Kotlin extensions for 'core'
  // https://mvnrepository.com/artifact/androidx.core/core-ktx
  const val AndroidCoreKtx = "androidx.core:core-ktx:1.2.0"
}

/**
 * Desc: Google official architecture
 * Url: https://developer.android.com/topic/libraries/architecture/index.html
 * Latest update: 2020.04.24
 */
object ArchitectureLibs {
  private const val ArchitectureVer = "2.2.0"

  // CheckOn 20200408 Android Lifecycle Runtime
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime
  const val LifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${ArchitectureVer}"

  // Android Lifecycle Extensions
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-extensions
  const val LifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${ArchitectureVer}"

  // Android Lifecycle LiveData
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata
  const val LifecycleLiveData = "androidx.lifecycle:lifecycle-livedata:${ArchitectureVer}"

  // Android Lifecycle ViewModel
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel
  const val LifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel:${ArchitectureVer}"

  // Android Lifecycle Common
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-common
  const val LifecycleCommon = "androidx.lifecycle:lifecycle-common:${ArchitectureVer}"

  // Android Lifecycle Compiler
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-compiler
  const val LifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${ArchitectureVer}"

  // Android Lifecycle Process
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-process
  const val LifecycleProcess = "androidx.lifecycle:lifecycle-process:${ArchitectureVer}"

  // Android Lifecycle Service
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-service
  const val LifecycleService = "androidx.lifecycle:lifecycle-service:${ArchitectureVer}"


  // Android Lifecycle Kotlin Extensions
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-runtime-ktx
  const val LifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${ArchitectureVer}"

  // LiveData Kotlin Extensions
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-ktx
  const val LifecycleLiveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:${ArchitectureVer}"

  // LiveData Core Kotlin Extensions
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-livedata-core-ktx
  const val LifecycleLiveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:${ArchitectureVer}"

  // Android Lifecycle ViewModel Kotlin Extensions
  // https://mvnrepository.com/artifact/androidx.lifecycle/lifecycle-viewmodel-ktx
  const val LifecycleViewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${ArchitectureVer}"

  // CheckOn 20200408 Android Room Runtime
  // https://mvnrepository.com/artifact/androidx.room/room-runtime
  private const val RoomLibVer = "2.2.5"
  const val RoomRuntime = "androidx.room:room-runtime:${RoomLibVer}"

  // Android Room RXJava2
  // https://mvnrepository.com/artifact/androidx.room/room-rxjava2
  const val RoomRxJava2 = "androidx.room:room-rxjava2:${RoomLibVer}"

  // Android Room Compiler
  // https://mvnrepository.com/artifact/androidx.room/room-compiler
  const val RoomCompiler = "androidx.room:room-compiler:${RoomLibVer}"

  // Android Room Common
  // https://mvnrepository.com/artifact/androidx.room/room-common
  const val RoomCommon = "androidx.room:room-common:${RoomLibVer}"

  // Android Room Kotlin Extensions
  // https://mvnrepository.com/artifact/androidx.room/room-ktx
  const val RoomKtx = "androidx.room:room-ktx:${RoomLibVer}"
}

/**
 * Desc: Network request library
 * Latest update: 2019.10.17
 */
object NetworkLibs {
  // CheckOn 20200408 https://github.com/square/retrofit
  // https://mvnrepository.com/artifact/com.squareup.retrofit2/retrofit
  private const val RetrofitVer = "2.8.1"
  const val Retrofit = "com.squareup.retrofit2:retrofit:${RetrofitVer}"

  // https://mvnrepository.com/artifact/com.squareup.retrofit2/converter-gson
  const val RetrofitConverterGson = "com.squareup.retrofit2:converter-gson:${RetrofitVer}"

  // https://mvnrepository.com/artifact/com.squareup.retrofit2/adapter-rxjava2
  const val RetrofitAdapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${RetrofitVer}"

  // OkHttp
  // CheckOn 20200408 https://github.com/square/okhttp
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
  private const val OkHttpVer = "4.5.0"
  const val OkHttp3 = "com.squareup.okhttp3:okhttp:${OkHttpVer}"

  // OkHttp URLConnection
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp-urlconnection
  const val OkHttp3UrlConnection = "com.squareup.okhttp3:okhttp-urlconnection:${OkHttpVer}"

  // OkHttp Logging Interceptor
  // https://mvnrepository.com/artifact/com.squareup.okhttp3/logging-interceptor
  const val OkHttp3LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${OkHttpVer}"
}

/**
 * Desc: Rx series
 * Latest update: 2019.10.17
 */
object RxLibs {
  // CheckOn 20200408 RxJava
  // https://github.com/ReactiveX/RxJava
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxjava
  const val RxJava3 = "io.reactivex.rxjava3:rxjava:3.0.2"

  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava
  const val RxJava2 = "io.reactivex.rxjava2:rxjava:2.2.19"

  // CheckOn 20200408 RxAndroid
  // https://github.com/ReactiveX/RxAndroid
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxandroid
  const val RxAndroid3 = "io.reactivex.rxjava3:rxandroid:3.0.0"

  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxandroid
  const val RxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.1.1"

  // CheckOn 20200408 RxKotlin
  // https://mvnrepository.com/artifact/io.reactivex.rxjava3/rxkotlin
  const val RxKotlin3 = "io.reactivex.rxjava3:rxkotlin3.0.0"

  // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxkotlin
  const val RxKotlin2 = "io.reactivex.rxjava2:rxkotlin2.4.0"

  // RxCache
  // https://github.com/VictorAlbertos/RxCache
  const val RxCache2 = "com.github.VictorAlbertos.RxCache:runtime:1.8.3-2.x"
  const val RxCache2Json = "com.github.VictorAlbertos.Jolyglot:gson:0.0.4"

  // RxPermissions
  // https://github.com/tbruyelle/RxPermissions
  // https://mvnrepository.com/artifact/com.tbruyelle.rxpermissions2/rxpermissions
  const val RxPermissions2 = "com.github.tbruyelle:rxpermissions:0.10.2"

  // CheckOn 20200408 RxDownload
  // https://github.com/ssseasonnn/RxDownload
  private const val RxDownloadVer = "1.0.9"

  // Add all dependencies of RxDownload4
  const val RxDownload = "com.github.ssseasonnn:RxDownload:${RxDownloadVer}"

  // Or Load on demand
  const val RxDownloads = "com.github.ssseasonnn.RxDownload:rxdownload4:${RxDownloadVer}"
  const val RxDownloadManager = "com.github.ssseasonnn.RxDownload:rxdownload4-manager:${RxDownloadVer}"
  const val RxDownloadRecorder = "com.github.ssseasonnn.RxDownload:rxdownload4-recorder:${RxDownloadVer}"
  const val RxDownloadNotification = "com.github.ssseasonnn.RxDownload:rxdownload4-notification:${RxDownloadVer}"

  // RxLifecycle
  // https://github.com/trello/RxLifecycle
  private const val RxLifecycleVer = "3.0.0"

  // https://mvnrepository.com/artifact/com.trello.rxlifecycle2
  const val RxLifecycle = "com.trello.rxlifecycle3:rxlifecycle:${RxLifecycleVer}"

  // If you want to bind to Android-specific lifecycles
  const val RxLifecycleAndroid = "com.trello.rxlifecycle3:rxlifecycle-android:${RxLifecycleVer}"

  // If you want pre-written Activities and Fragments you can subclass as providers
  const val RxLifecycleComponents = "com.trello.rxlifecycle3:rxlifecycle-components:${RxLifecycleVer}"

  // If you want pre-written support preference Fragments you can subclass as providers
  const val RxLifecycleComponentsPreference = "com.trello.rxlifecycle3:rxlifecycle-components-preference:${RxLifecycleVer}"

  // If you want to use Android Lifecycle for providers
  const val RxLifecycleAndroidLifecycle = "com.trello.rxlifecycle3:rxlifecycle-android-lifecycle:${RxLifecycleVer}"

  // If you want to use Kotlin syntax
  const val RxLifecycleKotlin = "com.trello.rxlifecycle3:rxlifecycle-kotlin:${RxLifecycleVer}"

  // If you want to use Kotlin syntax with Android Lifecycle
  const val RxLifecycleAndroidLifecycleKotlin = "com.trello.rxlifecycle3:rxlifecycle-android-lifecycle-kotlin:${RxLifecycleVer}"
}

/**
 * Desc: Image Loader
 * Latest update: 2019.10.17
 */
object ImageLoaderLibs {
  // https://github.com/bumptech/glide
  // https://mvnrepository.com/artifact/com.github.bumptech.glide
  private const val GlideVer = "4.9.0"
  const val Glide = "com.github.bumptech.glide:glide:${GlideVer}"
  const val GlideCompiler = "com.github.bumptech.glide:compiler:${GlideVer}"
  const val GlideLoaderOkHttp3 = "com.github.bumptech.glide:okhttp3-integration:${GlideVer}"

  // https://github.com/square/picasso
  // https://mvnrepository.com/artifact/com.squareup.picasso/picasso
  const val Picasso = "com.squareup.picasso:picasso:2.71828"

  // https://github.com/facebook/fresco
  // https://mvnrepository.com/artifact/com.facebook.fresco
  const val Fresco = "com.facebook.fresco:fresco:2.0.0"
}

/**
 * Desc: Log/Flurry/Performance analysis
 * Latest update: 2019.10.17
 */
object AnalyticLibs {
  // CheckOn 20200408 https://github.com/JakeWharton/timber
  const val Timber = "com.jakewharton.timber:timber:4.7.1"

  // https://developer.umeng.com/sdk/android
  const val UmengAnalytics = "com.umeng.analytics:analytics:6.0.1"

  // CheckOn 20200408 https://github.com/square/leakcanary
  private const val LeakCanaryVer = "2.2"
  const val LeakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${LeakCanaryVer}"
  const val LeakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${LeakCanaryVer}"

  // Debug bridge
  // https://github.com/facebook/stetho
  private const val StethoVer = "1.5.0"
  const val Stetho = "com.facebook.stetho:stetho:${StethoVer}"
  const val StethoOkHttp3 = "com.facebook.stetho:stetho-okhttp3:${StethoVer}"

  // 性能检测
  // https://github.com/Kyson/AndroidGodEye
  private const val GodEyeVer = "3.1.2"
  const val GodEyeCore = "cn.hikyson.godeye:godeye-core:${GodEyeVer}"
  const val GodEyeToolBox = "cn.hikyson.godeye:godeye-toolbox:${GodEyeVer}"
  const val GodEyeMonitor = "cn.hikyson.godeye:godeye-monitor:${GodEyeVer}"
  const val GodEyeMonitorNoOp = "cn.hikyson.godeye:godeye-monitor-no-op:${GodEyeVer}"

  // 耗时分析
  // https://github.com/zhengcx/MethodTraceMan
  const val MethodTraceManPlugin = "gradle.plugin.cn.cxzheng.methodTracePlugin:tracemanplugin:1.0.3"
  const val MethodTraceManPluginName = "cn.cxzheng.asmtraceman"
  const val MethodTraceManDebug = "com.github.zhengcx:MethodTraceMan:1.0.6"
  const val MethodTraceManRelease = "com.github.zhengcx:MethodTraceMan:1.0.6"
}

/**
 * Desc: Ui library, custom view
 * Latest update: None
 */
object WidgetLibs {
  // ui module
  // https://github.com/qiujuer/Genius-Android
  private const val GeniusVer = "2.1.1"
  const val GeniusUi = "net.qiujuer.genius:ui:${GeniusVer}"
  const val GeniusRes = "net.qiujuer.genius:res:${GeniusVer}"

  // use to bitmap blur and more
  const val GeniusGraphics = "net.qiujuer.genius:graphics:${GeniusVer}"

  // ping/telnet/tracert/dns and run cmd
  const val GeniusKitCmd = "net.qiujuer.genius:kit-cmd:${GeniusVer}"

  // shuttle between ui-thread and child-thread
  const val GeniusKitHandler = "net.qiujuer.genius:kit-handler:${GeniusVer}"

  // calss reflect
  const val GeniusKitReflect = "net.qiujuer.genius:kit-reflect:${GeniusVer}"

  // https://github.com/Nightonke/BoomMenu
  const val BoomMenu = "com.nightonke:boommenu:2.1.1"

  // CustomView
  // https://github.com/chrisbanes/PhotoView
  const val PhotoView = "com.github.chrisbanes:PhotoView:2.3.0"

  // https://github.com/lopspower/CircularImageView
  const val CircularImageView = "com.mikhaellopez:circularimageview:3.2.0"

  // https://github.com/Bigkoo/Android-PickerView 时间选择器/省市区三级联动
  const val AndroidPickerView = "com.contrarywind:Android-PickerView:4.1.7"

  // https://github.com/daimajia/NumberProgressBar
  const val NumberProgressbar = "com.daimajia.numberprogressbar:library:1.4@aar"

  // https://github.com/hootsuite/nachos 文本标签/Tag
  const val Nachos = "com.hootsuite.android:nachos:1.1.1"

  // https://github.com/alibaba/vlayout LayoutManager extension for RecyclerView
  const val VLayout = "com.alibaba.android:vlayout:1.2.8@aar"

  // https://github.com/nex3z/FlowLayout
  const val FlowLayout = "com.nex3z:flow-layout:1.2.4"

  // https://github.com/PhilJay/MPAndroidChart
  const val MPAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.0.3"

  // https://github.com/aurelhubert/ahbottomnavigation
  const val AHBottomNavigation = "com.aurelhubert:ahbottomnavigation:2.3.4"

  // https://github.com/armcha/Space-Navigation-View
  const val SapceNavigationView = "com.github.armcha:SpaceNavigationView:1.6.0"

  // https://github.com/pchmn/MaterialChipsInput
  const val MaterialChipsInput = "com.github.pchmn:MaterialChipsInput:1.0.8"

  // https://github.com/daniel-stoneuk/material-about-library
  const val MaterialAboutLibrary = "com.github.daniel-stoneuk:material-about-library:2.3.0"

  // https://github.com/jrvansuita/MaterialAbout
  const val MaterialAbout = "com.github.jrvansuita:MaterialAbout:0.2.3"

  // ripple
  // https://github.com/balysv/material-ripple
  const val MaterialRipple = "com.balysv:material-ripple:1.0.2"

  // load anim
  // https://github.com/nntuyen/mkloader
  const val MkLoader = "com.tuyenmonkey:mkloader:1.4.0"

  // https://github.com/Andy671/Dachshund-Tab-Layout
  const val DachTabLayout = "com.github.Andy671:Dachshund-Tab-Layout:v0.3.3"

  // Alerting Library
  // https://github.com/Tapadoo/Alerter
  const val Alerter = "com.tapadoo.android:alerter:4.0.1" //AndroidX

  // runtime theme library
  // https://github.com/garretyoder/Colorful
  const val Colorful = "com.github.garretyoder:Colorful:2.3.4"

  // contact picker
  // https://github.com/quiin/UnifiedContactPicker
  const val ContactPicker = "com.github.quiin:unifiedContactPicker:1.0"

  // https://github.com/MAXDeliveryNG/slideview
  const val SlideView = "com.github.MAXDeliveryNG:slideview:1.1.0"

  // 换肤框架
  // https://github.com/ximsfei/Android-skin-support
  const val SkinSupport = "skin.support:skin-support-appcompat:4.0.1"

  // https://github.com/ImangazalievM/CircleMenu
  const val CircleMenu = "com.github.imangazalievm:circlemenu:2.0.2"

  // 屏幕顶部底部显示消息
  // https://github.com/liuguangqiang/CookieBar
  const val CookieBar = "com.liuguangqiang.cookie:library:1.0"

  // 横向滑动组件
  // https://github.com/yarolegovich/DiscreteScrollView
  const val DiscreteScrollView = "com.yarolegovich:discrete-scrollview:1.4.9"

  // https://github.com/hluhovskyi/HoldingButton
  const val HoldingButton = "com.dewarder:holdingbutton:0.1.3"

  // Dialog
  // https://github.com/geniusforapp/fancyDialog
  const val FancyDialog = "com.github.geniusforapp:fancyDialog:1.0"

  // Read excel csv
  // https://github.com/Cleveroad/AdaptiveTableLayout
  const val AdaptiveTableLayout = "com.cleveroad:adaptivetablelayout:1.2.1"

  // https://github.com/Devlight/NavigationTabBar
  const val NavigationTabBar = "devlight.io:navigationtabbar:1.2.5"

  // https://github.com/Mauker1/MaterialSearchView
  const val MaterialSearchView = "br.com.mauker.materialsearchview:materialsearchview:1.2.3"

  // https://github.com/lapism/MaterialSearchView
  const val MaterialSearchView2 = "com.lapism:searchview:27.1.1.0.0"

  // https://github.com/fython/MaterialStepperView
  const val MaterialStepperView = "moe.feng:MaterialStepperView:0.2.4.2"

  // https://github.com/mancj/MaterialSearchBar
  const val MaterialSearchBar = "com.github.mancj:MaterialSearchBar:0.8.2"

  // https://github.com/navasmdc/MaterialDesignLibrary
  const val MaterialDesignLibrary = "com.github.navasmdc:MaterialDesign:1.5@aar"

  // https://github.com/idic779/monthweekmaterialcalendarview
  const val MaterialCalendarView = "com.github.idic779:monthweekmaterialcalendarview:1.7"

  // https://github.com/wdullaer/MaterialDateTimePicker
  const val MaterialDateTimePicker = "com.wdullaer:materialdatetimepicker:4.1.2"

  // https://github.com/Ramotion/folding-cell-android
  const val FoldingCell = "com.ramotion.foldingcell:folding-cell:1.2.3"

  // https://github.com/ogaclejapan/SmartTabLayout
  const val SmartTabLayoutXLib = "com.ogaclejapan.smarttablayout:library:2.0.0@aar"
  const val SmartTabLayoutXUtil = "com.ogaclejapan.smarttablayout:utils-v4:2.0.0@aar"
  const val SmartTabLayoutLib = "com.ogaclejapan.smarttablayout:library:1.7.0@aar"
  const val SmartTabLayoutUtil = "com.ogaclejapan.smarttablayout:utils-v4:1.7.0@aar"

  // 图片视频选择
  // https://github.com/zhihu/Matisse
  const val Matisse = "com.zhihu.android:matisse:0.5.2-beta4"

  // Media选择
  // https://github.com/bilibili/boxing
  private const val BoxingVer = "1.0.4"
  const val BoxingCore = "com.bilibili:boxing:${BoxingVer}"
  const val BoxingImpl = "com.bilibili:boxing-impl:${BoxingVer}"

  // Media album
  // https://github.com/yanzhenjie/Album
  const val Album = "com.yanzhenjie:album:2.1.3"

  // https://github.com/DroidNinja/Android-FilePicker
  const val FilePicker = "com.droidninja:filepicker:2.2.0"

  // https://github.com/dm77/barcodescanner
  const val BarcodeScanner = "me.dm7.barcodescanner:zxing:1.9.13"

  // https://github.com/SumiMakito/AwesomeQRCode
  const val AwesomeQRCode = "com.github.SumiMakito:AwesomeQRCode:1.2.0"

  // https://github.com/hdodenhof/CircleImageView
  const val CircleImageView = "de.hdodenhof:circleimageview:3.0.0"

  // https://github.com/huangyanbin/smartTable
  const val SmartTable = "com.github.huangyanbin:SmartTable:2.2.0"

  // https://github.com/gyf-dev/ImmersionBar
  const val ImmersionBar = "com.gyf.immersionbar:immersionbar:2.3.3"

  // https://github.com/scwang90/SmartRefreshLayout
  const val SmartRefreshLayout = "com.scwang.smartrefresh:SmartRefreshLayout:1.1.0-alpha-21"
  const val SmartRefreshHeader = "com.scwang.smartrefresh:SmartRefreshHeader:1.1.0-alpha-21"
  const val SmartRefreshLayoutX = "com.scwang.smartrefresh:SmartRefreshLayout:1.1.0-andx-4"
  const val SmartRefreshHeaderX = "com.scwang.smartrefresh:SmartRefreshHeader:1.1.0-andx-4"

  // ThemeLib
  // https://github.com/bilibili/MagicaSakura
  const val MagicaSakura = "com.bilibili:magicasakura:0.1.9-beta3@aar"

  // https://github.com/rubensousa/RecyclerViewSnap
  const val RecyclerViewSnapX = "com.github.rubensousa:gravitysnaphelper:2.0"
  const val RecyclerViewSnap = "com.github.rubensousa:gravitysnaphelper-compat:2.0"

  // https://github.com/yanzhenjie/SwipeRecyclerView
  const val SwipeRecyclerView = "com.yanzhenjie.recyclerview:support:1.3.1"
  const val SwipeRecyclerViewX = "com.yanzhenjie.recyclerview:x:1.3.1"

  // UserGuildeLib https://github.com/AppIntro/AppIntro
  const val AppIntroX = "com.github.AppIntro:AppIntro:v5.1.0"
  const val AppIntro = "com.github.AppIntro:AppIntro:v4.2.3"

  // https://github.com/wasabeef/recyclerview-animators
  const val RecyclerViewAnim = "jp.wasabeef:recyclerview-animators:3.0.0"

  // https://github.com/CymChad/BaseRecyclerViewAdapterHelper
  const val BaseRecyclerViewAdapterHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper:2.9.46"

  // https://github.com/PureWriter/about-page
  const val AboutPage = "me.drakeet.support:about:2.3.0-alpha2"

  // CheckOn 20200408 https://github.com/drakeet/MultiType
  const val MultiType = "me.drakeet.multitype:multitype:4.2.0"

  // https://github.com/ChadCSong/ShineButton
  const val ShineButton = "com.sackcentury:shinebutton:0.2.0"

  // https://github.com/google/flexbox-layout
  const val FlexBox = "com.google.android:flexbox:1.1.0"

  // https://github.com/airbnb/lottie-android
  const val Lottie = "com.airbnb.android:lottie:2.8.0"

  // CheckOn 20200408 MaterialDialog
  // https://github.com/afollestad/material-dialogs
  private const val MaterialDialogVer = "3.3.0"
  const val MaterialDialogCore = "com.afollestad.material-dialogs:core:${MaterialDialogVer}"
  const val MaterialDialogInput = "com.afollestad.material-dialogs:input:${MaterialDialogVer}"
  const val MaterialDialogFiles = "com.afollestad.material-dialogs:files:${MaterialDialogVer}"
  const val MaterialDialogColor = "com.afollestad.material-dialogs:color:${MaterialDialogVer}"
  const val MaterialDialogDatetime = "com.afollestad.material-dialogs:datetime:${MaterialDialogVer}"
  const val MaterialDialogBottomSheets = "com.afollestad.material-dialogs:bottomsheets:${MaterialDialogVer}"
  const val MaterialDialogLifecycle = "com.afollestad.material-dialogs:lifecycle:${MaterialDialogVer}"

  // https://github.com/HotBitmapGG/RingProgressBar
  const val RingProgressBar = "com.github.HotBitmapGG:RingProgressBar:V1.2.3"

  // https://github.com/Solartisan/WaveSideBar
  // https://github.com/gjiazhe/WaveSideBar
  const val WaveSideBar = "com.gjiazhe:wavesidebar:1.3"

  // https://github.com/Devlight/InfiniteCycleViewPager
  const val CycleViewPager = "com.github.devlight:infinitecycleviewpager:1.0.2"

  // https://github.com/robinhood/ticker
  const val Ticker = "com.robinhood.ticker:ticker:2.0.1"

  // https://github.com/aliab/circular-music-progressbar
  const val CircularMusicProgressbar = "com.github.aliab:circular-music-progressbar:v1.3.0"
}

/**
 * Desc: Ui library, custom view
 * Latest update: 2019.10.17
 */
object TestLibs {
  const val JUnit = "junit:junit:4.12"

  // Mockito
  // https://mvnrepository.com/artifact/org.mockito
  const val MockitoCore = "org.mockito:mockito-core:3.1.0"

  // Android Support Test
  // https://mvnrepository.com/artifact/com.android.support.test
  // https://mvnrepository.com/artifact/com.android.support.test/runner
  const val Runner = "com.android.support.test:runner:1.0.2"
  const val AndroidJUnitRunner = "android.support.test.runner.AndroidJUnitRunner"

  // Android Support Test Espresso
  // https://mvnrepository.com/artifact/com.android.support.test.espresso
  private const val EspressoVer = "3.0.2"
  const val EspressoCore = "com.android.support.test.espresso:espresso-core:${EspressoVer}"
  const val EspressoContrib = "com.android.support.test.espresso:espresso-contrib:${EspressoVer}"
  const val EspressoIntents = "com.android.support.test.espresso:espresso-intents:${EspressoVer}"
}
