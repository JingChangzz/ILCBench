package com.jzhang.testmasterjar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by zhangrui on 2018/3/22.
 */

public class StaticBroadcastReceiver extends BroadcastReceiver {

    public StaticBroadcastReceiver(){

    }
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals(Const.BROADCASET_STATIC)){
            //
        }

    }
}
