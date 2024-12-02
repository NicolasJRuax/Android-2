plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.myproyect.android_2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.myproyect.android_2"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation ("androidx.recyclerview:recyclerview:1.3.1")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.1")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1")
    implementation ("com.google.android.gms:play-services-maps:18.1.0")
    implementation ("com.google.firebase:firebase-database:20.1.0")
    implementation ("com.google.firebase:firebase-analytics:21.3.0")
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}