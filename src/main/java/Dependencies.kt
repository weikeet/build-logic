object Versions {
  const val minSdk = 21
  const val targetSdk = 28
  const val compileSdk = 28
  const val versionCode = 1
  const val versionName = "1.0"

  const val androidPlugin = "3.3.2"
  const val kotlin = "1.3.11"
  const val supportLib = "28.0.0"
  const val supportXLib = "1.0.0-beta01"
  const val jetPack = "1.1.1"
  const val retrofit = "2.4.0"
  const val dagger2 = "2.19"
  const val glide = "4.8.0"
  const val greenDao = "3.2.2"
  const val butterKnife = "8.8.1" //"10.0.0": androidX
  const val rxLifecycle = "3.0.0"
  const val leakCanary = "1.5.4"
  const val espresso = "3.0.1"
}

object Libs {
  const val androidPlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
  const val kotlinlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  const val greebDaolugin = "org.greenrobot:greendao-gradle-plugin:${Versions.greenDao}"
  const val butterKnifePlugin = "com.jakewharton:butterknife-gradle-plugin:${Versions.butterKnife}"

  //KotlinLib
  const val KotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

  //AndroidSupport
  const val appcompatV7 = "com.android.support:appcompat-v7:${Versions.supportLib}"
  const val design = "com.android.support:design:${Versions.supportLib}"
  const val supportV4 = "com.android.support:support-v4:${Versions.supportLib}"
  const val cardViewV7 = "com.android.support:cardview-v7:${Versions.supportLib}"
  const val customTabs = "com.android.support:customtabs:${Versions.supportLib}"
  const val annotations = "com.android.support:support-annotations:${Versions.supportLib}"
  const val recyclerViewV7 = "com.android.support:recyclerview-v7:${Versions.supportLib}"
  const val constraintLayout = "com.android.support.constraint:constraint-layout:1.1.3"

  //AndroidXSupport
  const val xMaterialDesign = "com.google.android.material:material:${Versions.supportXLib}"
  const val xAppcompat = "androidx.appcompat:appcompat:${Versions.supportXLib}"
  const val xSupportV4 = "androidx.legacy:legacy-support-v4:${Versions.supportXLib}"
  const val xCardView = "androidx.cardview:cardview:${Versions.supportXLib}"
  const val xCustomTabs = "androidx.browser:browser:${Versions.supportXLib}"
  const val xConstraintLayout = "androidx.constraintlayout:constraintlayout:1.1.2"

  //JetPack
  const val lifecycleRuntime = "android.arch.lifecycle:runtime:${Versions.jetPack}"
  const val lifecycleCompiler = "android.arch.lifecycle:compiler:${Versions.jetPack}"
  const val lifecycleExtensions = "android.arch.lifecycle:extensions:${Versions.jetPack}"
  const val roomRuntime = "android.arch.persistence.room:runtime:${Versions.jetPack}"
  const val roomRxJava2 = "android.arch.persistence.room:rxjava2:${Versions.jetPack}"
  const val roomCompiler = "android.arch.persistence.room:compiler:${Versions.jetPack}"

  //Retrofit
  const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
  const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
  const val retrofitAdapterRxJava2 = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"

  //OkHttp
  const val okHttp3 = "com.squareup.okhttp3:okhttp:3.11.0"
  const val okHttpUrlConnection = "com.squareup.okhttp:okhttp-urlconnection:2.0.0"

  //RxSeries2
  const val rxJava2 = "io.reactivex.rxjava2:rxjava:2.2.3"
  const val rxAndroid2 = "io.reactivex.rxjava2:rxandroid:2.1.0"
  const val rxCache2 = "com.github.VictorAlbertos.RxCache:runtime:1.8.3-2.x"
  const val rxPermissions2 = "com.github.tbruyelle:rxpermissions:0.10.2"
  const val rxErrorHandler2 = "me.jessyan:rxerrorhandler:2.1.1"
  const val rxDownload = "zlc.season:rxdownload3:1.2.7"
  const val rxLifecycle = "com.trello.rxlifecycle3:rxlifecycle:${Versions.rxLifecycle}"

  // If you want to bind to Android-specific lifecycles
  const val rxLifecycleAndroid = "com.trello.rxlifecycle3:rxlifecycle-android:${Versions.rxLifecycle}"
  // If you want pre-written Activities and Fragments you can subclass as providers
  const val rxLifecycleComponents = "com.trello.rxlifecycle3:rxlifecycle-components:${Versions.rxLifecycle}"
  // If you want pre-written support preference Fragments you can subclass as providers
  const val rxLifecycleComponentsPreference = "com.trello.rxlifecycle3:rxlifecycle-components-preference:${Versions.rxLifecycle}"
  // If you want to use Android Lifecycle for providers
  const val rxLifecycleAndroidLifecycle = "com.trello.rxlifecycle3:rxlifecycle-android-lifecycle:${Versions.rxLifecycle}"
  // If you want to use Kotlin syntax
  const val rxLifecycleKotlin = "com.trello.rxlifecycle3:rxlifecycle-kotlin:${Versions.rxLifecycle}"
  // If you want to use Kotlin syntax with Android Lifecycle
  const val rxLifecycleAndroidLifecycleKotlin = "com.trello.rxlifecycle3:rxlifecycle-android-lifecycle-kotlin:${Versions.rxLifecycle}"
  // If you want to use Navi for providers
  // DEPRECATED: Use rxlifecycle-android-lifecycle instead. This will be removed in a future release.
  const val rxLifecycleNavi = "com.trello.rxlifecycle3:rxlifecycle-navi:${Versions.rxLifecycle}"

  //ImageLoader
  const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
  const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
  const val glideLoaderOkHttp3 = "com.github.bumptech.glide:okhttp3-integration:${Versions.glide}"
  const val picasso = "com.squareup.picasso:picasso:2.5.2"
  const val fresco = "com.facebook.fresco:fresco:1.10.0"

  //ScreenAdaptation
  const val autoSize = "me.jessyan:autosize:1.1.1"
  const val autoLayout = "com.zhy:autolayout:1.4.5"

  //CustomView
  const val photoView = "com.github.chrisbanes.photoview:library:1.2.3"
  const val circularImageView = "com.mikhaellopez:circularimageview:3.2.0"
  const val androidPickerView = "com.contrarywind:Android-PickerView:3.2.5"
  const val numberProgressbar = "com.daimajia.numberprogressbar:library:1.2@aar"
  const val nachos = "com.hootsuite.android:nachos:1.1.1"
  const val vLayout = "com.alibaba.android:vlayout:1.1.0@aar"
  const val flowLayout = "com.nex3z:flow-layout:1.2.4"
  const val mpAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.0.3"
  const val ahBottomNavigation = "com.aurelhubert:ahbottomnavigation:2.3.4"
  const val materialChipsInput = "com.github.pchmn:MaterialChipsInput:1.0.8"
  const val materialAboutLibrary = "com.github.daniel-stoneuk:material-about-library:2.3.0"
  const val materialDateTimePicker = "com.wdullaer:materialdatetimepicker:4.1.0"

  //Tools
  const val butterKnife = "com.jakewharton:butterknife:${Versions.butterKnife}"
  const val butterKnifeCompiler = "com.jakewharton:butterknife-compiler:${Versions.butterKnife}"
  const val dagger2 = "com.google.dagger:dagger:${Versions.dagger2}"
  const val dagger2Android = "com.google.dagger:dagger-android:${Versions.dagger2}"
  const val dagger2Compiler = "com.google.dagger:dagger-compiler:${Versions.dagger2}"
  const val dagger2AndroidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger2}"
  const val dagger2AndroidProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger2}"
  const val androidEventBus = "org.simple:androideventbus:1.0.5.1"
  const val eventBus = "org.greenrobot:eventbus:3.1.1"
  const val greenDao = "org.greenrobot:greendao:${Versions.greenDao}"
  const val otto = "com.squareup:otto:1.3.8"
  const val gson = "com.google.code.gson:gson:2.8.5"
  const val jsoup = "org.jsoup:jsoup:1.11.2"
  const val multidex = "com.android.support:multidex:1.0.3"
  const val arouter = "com.alibaba:arouter-api:1.3.1"
  const val arouterCompiler = "com.alibaba:arouter-compiler:1.1.4"
  const val javaxAnnotation = "javax.annotation:jsr250-api:1.0"
  const val progressManager = "me.jessyan:progressmanager:1.5.0"
  const val retrofitUrlManager = "me.jessyan:retrofit-url-manager:1.4.0"
  const val lifecycleModel = "me.jessyan:lifecyclemodel:1.0.1"

  //LogAndAnalytics
  const val logger = "com.orhanobut:logger:2.2.0"
  const val timber = "com.jakewharton.timber:timber:4.7.1"
  const val umengAnalytics = "com.umeng.analytics:analytics:6.0.1"
  const val leakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${Versions.leakCanary}"
  const val leakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${Versions.leakCanary}"

  //Test
  const val jUnit = "junit:junit:4.12"
  const val runner = "com.android.support.test:runner:1.0.1"
  const val androidJUnitRunner = "android.support.test.runner.AndroidJUnitRunner"
  const val espressoCore = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
  const val espressoContrib = "com.android.support.test.espresso:espresso-contrib:${Versions.espresso}"
  const val espressoIntents = "com.android.support.test.espresso:espresso-intents:${Versions.espresso}"
  const val mockitoCore = "org.mockito:mockito-core:1.+"
}
