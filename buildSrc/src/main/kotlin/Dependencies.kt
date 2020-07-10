object Versions {
	const val compileSdkVersion = 29
	const val buildToolsVersion = "29.0.3"
	const val applicationId = "com.prongbang.modular"
	const val minSdkVersion = 21
	const val targetSdkVersion = 29
	const val versionCode = 1
	const val versionName = "1.0"
	const val multidexEnabled = true
	const val minifyEnabled = true

	const val kotlin = "1.3.72"
	const val androidX = "1.1.0"
	const val androidxCore = "1.3.0"
	const val androidxConstraintLayout = "1.1.3"
	const val koin = "2.1.6"

	const val junit = "4.13"
	const val androidxExtJunit = "1.1.1"
	const val androidxEspresso = "3.2.0"
	const val coil = "0.11.0"
}

object Deps {
	const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
	const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.androidxCore}"
	const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidX}"
	const val androidxConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintLayout}"
	const val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
	const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
	const val koinFragment = "org.koin:koin-androidx-fragment:${Versions.koin}"
	const val koinExt = "org.koin:koin-androidx-ext:${Versions.koin}"
	const val coil = "io.coil-kt:coil:${Versions.coil}"

	const val junit = "junit:junit:${Versions.junit}"
	const val androidxExtJunit = "androidx.test.ext:junit:${Versions.androidxExtJunit}"
	const val androidxEspresso = "androidx.test.espresso:espresso-core:${Versions.androidxEspresso}"
}