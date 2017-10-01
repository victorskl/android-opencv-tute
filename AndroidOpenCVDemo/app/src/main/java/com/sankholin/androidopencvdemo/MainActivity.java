package com.sankholin.androidopencvdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

/*
    static {
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "static initializer: OpenCV is NOT loaded!");
        } else {
            Log.d(TAG, "static initializer: OpenCV is successfully loaded!");
        }
    }
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String loadMsg = "OpenCV loading failed!";

        if (OpenCVLoader.initDebug()) {
            loadMsg = "OpenCV "+ OpenCVLoader.OPENCV_VERSION + " successfully loaded!";
            Log.i(TAG, loadMsg);
        } else {
            Log.i(TAG, loadMsg);
        }

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(loadMsg);
    }
}
