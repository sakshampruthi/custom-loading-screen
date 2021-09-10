# Custom Loading Screen

[![Version](https://jitpack.io/v/sakshampruthi/custom-loading-screen.svg)](https://jitpack.io/#sakshampruthi/custom-loading-screen)
![MinApi](https://img.shields.io/badge/Min%20Api-16-important)

----------------------------------------------------------

A simple library to generate custom loading screens using Lottie Files (till your application fetches data from server)

### Adding dependencies  
if your gradle version is 7.0 or above :  
Add this to your settings.gradle (Project level):
```groovy
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		....
		maven { url 'https://jitpack.io' }
	}
}
```

If your gradle version is below 7.0 : 
Add this to your build.gradle (Project level):
```groovy
allprojects {
	repositories {
		....
		maven { url 'https://jitpack.io' }
	}
}
```
enable view-binding in your app/build.gradle (Module level):
```groovy
android {
    ....
    buildFeatures {
            viewBinding true
        }
}
```

Add the dependencies in your app/build.gradle:
```groovy
dependencies {
    ....
    implementation "com.github.sakshampruthi:custom-loading-screen:1.16"
}
```

### How to use the library

To use the loading screen you need a LottieAnimation file.  
Find one that suits you [here](https://lottiefiles.com/) and download the corresponding lottie json.

Place the json file in ```res->raw```

Next step is to call the ```showDialog()``` :  
For kotlin: 

```kotlin
showDialog(context,           //context or this
    true,                     //dismiss dialog onBackPressed
    R.raw.<lottiejson>        //lottie file json stored in res/raw
)
```

For Java: 
```java
LoaderKt.showDialog(this,
                  true,
                  <lottiejson>
)	
```
To dismiss the view:  
For kotlin:
```kotlin
hideDialog()
```
For Java:
```kotlin
LoaderKt.hideDialog()
```
