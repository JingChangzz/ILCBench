package com.example.zhangjing.dynamicbroadcastreceiveapp;

import android.app.Activity;
import android.os.Bundle;

import com.example.zhangjing.dynamicbroadcastreceivejar.Receiver;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Receiver().registerDynamicBroadcast(getApplicationContext());
    }
}
