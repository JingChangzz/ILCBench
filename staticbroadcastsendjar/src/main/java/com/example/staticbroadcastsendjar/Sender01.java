package com.example.staticbroadcastsendjar;

import android.content.Context;
import android.content.Intent;

public class Sender01{

    // 发送静态广播
    public void sendStaticBroadcast(Context context) {
        Intent intent = new Intent();
        intent.setAction("staticbroadcast");
        intent.putExtra("staticbroadcast", new AboutDevice().getDeviceInfo(context));
        context.sendBroadcast(intent);
    }
}
