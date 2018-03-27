package com.example.zhangjing.dynamicbroadcastsendapp;

import android.app.Activity;
import android.os.Bundle;

import com.example.zhangjing.dynamicbroadcastsendapp.R;
import com.example.zhangjing.dynamicbroadcastsendjar.Sender02;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Sender02().sendDynamicBroadcast(getApplicationContext());
    }
}
