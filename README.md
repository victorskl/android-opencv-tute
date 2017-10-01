# Android OpenCV tute

Tutorial and sample demo of Android and OpenCV

1. First build the [`OpenCVLibrary330`](OpenCVLibrary330)
2. Then import the `OpenCVLibrary330/build/output/aar/OpenCVLibrary330-release.aar` to each of the demo project as **File > New > New Module**.
3. Start with [`AndroidOpenCVDemo`](AndroidOpenCVDemo) project, that only test the simple loading of OpenCV library.
4. Then move on to the rest.

NOTE: camera emulator is not working; have to test directly on the actual phone; this is due to [the OpenCV direct control on camera hardware](http://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/O4A_SDK.html#running-opencv-samples).

>  Please consider that some samples use Android Java Camera API, which is accessible with an AVD. But most of samples use OpenCV Native Camera which may not work with an emulator. 

---

REF:

- https://developer.android.com/studio/projects/add-native-code.html
- https://developer.android.com/studio/projects/android-library.html
- https://developer.android.com/guide/components/aidl.html