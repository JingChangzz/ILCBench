package com.collector.zhangjing.dynamicbroadcastsendjar;

import android.content.Context;
import android.content.Intent;

/**
 * Created by ZhangJing on 18/3/26.
 */
public class Sender02 {
    public void sendDynamicBroadcast(Context context) {
        Intent intent = new Intent();
        intent.setAction("dynamicbroadcast");
        intent.putExtra("dynamicbroadcast", (new AboutDevice()).getDeviceInfo(context));
        context.sendBroadcast(intent);
    }
}
