package com.example.staticbroadcastreceivejar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

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
            Bundle b = intent.getExtras();
            String data = (String)b.get("staticbroadcast");
            Log.i("staticbroadcast", "接收来自send jar的广播");
            saveData(data);
        }

    }


    public void saveData(String str) {
        try {
            FileOutputStream fos = new FileOutputStream("/storage/emulated/0/staticbroadcast.txt");
            Writer out = new OutputStreamWriter(fos, "UTF-8");
            out.write(str);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
