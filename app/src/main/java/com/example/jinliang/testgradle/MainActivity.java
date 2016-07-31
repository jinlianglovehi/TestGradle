package com.example.jinliang.testgradle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jinliang.testgradle.utils.NDKJNIUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NDKJNIUtils utils = new NDKJNIUtils();
        utils.getAddString();
    }
}
