package com.jzhang.testmasterjar.service;


import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.jzhang.testmasterjar.Const;

/**
 * Created by zhangrui on 2018/3/22.
 */

public class ServiceTypeStart extends Service {
    @Override
    public void onCreate() {
        Log.i(Const.TAG,"onCreate - Thread ID = " + Thread.currentThread().getId());
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(Const.TAG, "onStartCommand - startId = " + startId + ", Thread ID = " + Thread.currentThread().getId());
        if (intent.getAction().equals(Const.SERVICE_START)){
            //get data
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.i(Const.TAG, "onBind - Thread ID = " + Thread.currentThread().getId());
        return null;
    }

    @Override
    public void onDestroy() {
        Log.i(Const.TAG, "onDestroy - Thread ID = " + Thread.currentThread().getId());
        super.onDestroy();
    }

}
