package com.jzhang.testmasterjar;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;

import com.jzhang.testmasterjar.contentprovider.Device;
import com.jzhang.testmasterjar.service.ServiceTypeBind;
import com.jzhang.testmasterjar.service.ServiceTypeStart;
import com.jzhang.testmasterjar.socket.SocketClient;

import static android.content.Context.BIND_AUTO_CREATE;

/**
 * Created by zhangrui on 2018/3/22.
 */

public class MasterSendTest {

    public MasterSendTest() {

    }
    //发送动态广播
    public void sendDynamicBroadcast(Context context, BroadcastReceiver dynamicReceiver) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Const.BROADCASET_DYNAMIC);
        context.registerReceiver(dynamicReceiver, intentFilter);
        Intent intent = new Intent();
        intent.setAction("dynamicbroadcast");
        intent.putExtra("dynamicbroadcast", new AboutDevice().getDeviceId(context));
        context.sendBroadcast(intent);
    }

    // 发送静态广播
    public void sendStaticBroadcast(Context context) {
        Intent intent = new Intent();
        intent.setAction("staticbroadcast");
        intent.putExtra("staticbroadcast", new AboutDevice().getDeviceId(context));
        context.sendBroadcast(intent);
    }

    //startservice方式send
    public void startServiceSend(Context context) {
        Intent intent = new Intent(context, ServiceTypeStart.class);
        intent.setAction(Const.SERVICE_START);
        intent.putExtra("startservice", new AboutDevice().getDeviceId(context));
        context.startService(intent);
    }

    public void stopServiceSend(Context context) {

        context.stopService(new Intent(context, ServiceTypeStart.class));
    }

    //bindservice方式send
    public void bindServiceSend(Context context,ServiceConnection conn) {
        Intent intent = new Intent(context, ServiceTypeBind.class);
        intent.putExtra("bindservice", new AboutDevice().getDeviceId(context));
        context.bindService(intent, conn, BIND_AUTO_CREATE);

    }

    public void unbindServiceSend(Context context,ServiceConnection conn){
        context.unbindService(conn);
    }

    /**
     * ServiceConnection  example
     */
    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder binder) {
            ServiceTypeBind.MyBinder myBinder = (ServiceTypeBind.MyBinder) binder;
            ServiceTypeBind service = myBinder.getService();
            int num = service.getRandomNumber();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
        }
    };

    /**
     * socket
     * @param context
     */
    public void sendSocketMessage(Context context){
        SocketClient socketClient= new SocketClient();
        socketClient.conn("100.100.28.26",9999);
        socketClient.sendMessage(new AboutDevice().getDeviceId(context));
    }

    public void startActivityOne(Context context1,Class<?> tClass){
        Intent intent = new Intent(context1,tClass);
        intent.putExtra("startActivityOne", new AboutDevice().getDeviceId(context1));
        context1.startActivity(intent);
    }
//    public void startActivityOne(Context context1,Class<T> tClass,int code){
//        Intent intent = new Intent(context1,tClass);
//        intent.putExtra("", new AboutDevice().getDeviceId(context1));
//        context1.s
//    }

    public void addContentProvider(Context context){
        ContentValues values = new ContentValues();
        values.put(Device.KEY_DEVICEID, new AboutDevice().getDeviceId(context));
        Uri newUri = context.getContentResolver().insert(Device.CONTENT_URI, values);
    }
}

