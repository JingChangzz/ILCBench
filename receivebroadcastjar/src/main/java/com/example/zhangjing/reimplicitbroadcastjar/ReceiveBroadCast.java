package com.example.zhangjing.reimplicitbroadcastjar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by zhangrui on 2018/3/14.
 */
public class ReceiveBroadCast extends BroadcastReceiver {

    ReceiveCallBack receiveCallBack;
    public ReceiveBroadCast(ReceiveCallBack receiveCallBack){

        this.receiveCallBack=receiveCallBack;
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        String tag=intent.getAction();
        if (tag.equals("test")){
            receiveCallBack.receiveSuc(true,"");
        }else {
            receiveCallBack.receiveFail(false,tag);
        }
    }

    interface ReceiveCallBack{
        void receiveSuc(boolean result,String extra);
        void receiveFail(boolean result,String extra);

    }
}
