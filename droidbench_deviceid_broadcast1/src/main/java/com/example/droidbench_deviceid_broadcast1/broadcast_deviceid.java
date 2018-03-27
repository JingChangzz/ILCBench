package com.example.droidbench_deviceid_broadcast1;

/**
 * Created by ZhangJing on 18/3/27.
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.telephony.TelephonyManager;

public class broadcast_deviceid extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent arg1)
    {
        String s = "Device Id : ";
        //Service ser = getSystemService(Context.TELEPHONY_SERVICE);
        // Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        TelephonyManager telephonyManager = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        s = s.concat(telephonyManager.getDeviceId());
        final String androidId = Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID);

        Intent in = new Intent("com.example.collector");
        in.setType("text/plain");
        in.putExtra(Intent.EXTRA_TEXT,s);
        in.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(in);
    }


}