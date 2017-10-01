# OpenCV Library 3.3.0 

Gradle version from `opencv-3.3.0-android-sdk.zip`

http://opencv.org/platforms/android/

Copy the downloaded pre-compiled OpenCV binaries to `OpenCVLibrary330/src/main/jniLibs`. Create `jniLibs` directory if none exist. These binaries can be selective depends on the target phone machine architecture e.g. `x86`.

```
➜  tree -L 1 /Users/victorskl/Downloads/OpenCV-android-sdk/sdk/native/libs/
/Users/victorskl/Downloads/OpenCV-android-sdk/sdk/native/libs/
├── arm64-v8a
├── armeabi
├── armeabi-v7a
├── mips
├── mips64
├── x86
└── x86_64
➜  cp -Rvf /Users/victorskl/Downloads/OpenCV-android-sdk/sdk/native/libs/x86 OpenCVLibrary330/src/main/jniLibs/
```

Build AAR Release

```
➜  ./gradlew clean assembleRelease
➜  tree build/outputs
build/outputs
└── aar
    └── OpenCVLibrary330-release.aar
```
