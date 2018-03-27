package com.example.zhangjing.dynamicbroadcastreceivejar;

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
 * Created by ZhangJing on 18/3/26.
 */
public class DynamicBroadcast extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle b = intent.getExtras();
        String data = (String)b.get("dynamicbroadcast");
        Log.i("dynamicbroadcast", "接收来自send jar的广播");
        saveData(data);
    }

    public void saveData(String str) {
        try {
            FileOutputStream fos = new FileOutputStream("/storage/emulated/0/daynamicbroadcast.txt");
            Writer out = new OutputStreamWriter(fos, "UTF-8");
            out.write(str);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
