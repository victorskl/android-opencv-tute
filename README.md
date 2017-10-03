# Android OpenCV tute

Tutorial and sample demo of Android and OpenCV

## Quickstart

1. First build the [`OpenCVLibrary330`](OpenCVLibrary330)
2. Then import the `OpenCVLibrary330/build/output/aar/OpenCVLibrary330-release.aar` to each of the demo project as **File > New > New Module**.
3. Start with [`AndroidOpenCVDemo`](AndroidOpenCVDemo) project, that only test the simple loading of OpenCV library.
4. Then move on to the rest.

## Camera Permission

- For Camera emulator to work, use `org.opencv.android.JavaCameraView`. 
- Turn on Camera through AVD Manger ([Android Virtual Device Manager](https://www.google.com.au/search?q=Android+Virtual+Device+Manager))
- Then run `app` to install the App. 
- After installed the App into the emulator, go to your App and allow Camera permission as follow:

> Go to your device settings -> apps -> YOUR APP -> Permissions -> turn on camera permission..

- https://stackoverflow.com/questions/20666366/it-seems-that-your-device-does-not-support-cameraor-it-is-locked/21753324
- https://developer.android.com/training/permissions/requesting.html

NOTE: camera emulator is not working on OpenCV Native Camera object e.g. `org.opencv.android.NativeCameraView`; have to test directly on the actual phone; this is due to the OpenCV direct control on camera hardware.

>  [Please consider that some samples use Android Java Camera API, which is accessible with an AVD. But most of samples use OpenCV Native Camera which may not work with an emulator](http://docs.opencv.org/2.4/doc/tutorials/introduction/android_binary_package/O4A_SDK.html#running-opencv-samples). 

## Demo

- https://www.youtube.com/watch?v=ZOqapY6uXIU
- https://www.youtube.com/watch?v=QZo4fjvEh5E

