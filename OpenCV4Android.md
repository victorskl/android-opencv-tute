## Reading Guide

*Caveat: read chronological order as listed in the following links.*

1. http://opencv.org/platforms/android/

2. http://opencv.org/platforms/android/opencv4android-usage-models.html

3. https://stackoverflow.com/questions/27406303/opencv-in-android-studio - *to work on Android Studio*
    
    3.1 https://stackoverflow.com/questions/17767557/how-to-use-opencv-in-android-studio-using-gradle-build-tool
    
    3.2 https://www.youtube.com/watch?v=JIHfqzTdOcQ
    
    3.3 https://www.learn2crack.com/2016/03/setup-opencv-sdk-android-studio.html

4.  http://opencv.org/platforms/android/opencv4android-samples.html - *run the samples after step 3*

5. http://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/android_dev_intro.html 

6. http://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/O4A_SDK.html

7. http://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/dev_with_OCV_on_Android.html

8. http://docs.opencv.org/2.4/platforms/android/service/doc/index.html - *to understand Android OpenCV Manager*

*Note that: 5, 6, 7 are severely outdated, but still useful for Android NDK  and some part that is not about Eclipse ADT.*

*After 7 and 8, you will understand the Android OpenCV Manager, and realized that you won't need to package OpenCV binaries as it is imported as a module dependency to your Android App. In fact, when your App publish it on Play Store, it will pull OpenCV Manager (aka OpenCV binaries from Play Store). However, packaging togetether with the App might also has the benefit such that it works for a particular version of OpenCV or when Play Store is unavailable for whatever reason!*

## Android Reading

*this is mainly for understanding NDK and native part as OpenCV is C++*

1. https://developer.android.com/ndk/guides/concepts.html

2. https://developer.android.com/studio/projects/add-native-code.html

3. https://developer.android.com/studio/projects/android-library.html

4. https://developer.android.com/guide/components/aidl.html

5. https://developer.android.com/ndk/guides/android_mk.html

6. https://developer.android.com/ndk/guides/application_mk.html

