package com.example.zhangjing.dynamicbroadcastreceivejar;

import android.content.Context;
import android.content.IntentFilter;

/**
 * Created by ZhangJing on 18/3/26.
 */
public class Receiver {
    public void registerDynamicBroadcast(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("dynamicbroadcast");
        context.registerReceiver(new DynamicBroadcast(), intentFilter);
    }
}
