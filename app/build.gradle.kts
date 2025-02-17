plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.eks.mvvm_user_crud"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.eks.mvvm_user_crud"
        minSdk = 28
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
    implementation(libs.activity)
    implementation("androidx.lifecycle:lifecycle-viewmodel:2.5.1")
    implementation("androidx.room:room-runtime:2.5.0")
    implementation("androidx.lifecycle:lifecycle-livedata:2.5.1")
    annotationProcessor("androidx.room:room-compiler:2.5.0")
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}