package com.jzhang.mastersendtest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;

import com.jzhang.testmasterjar.MasterSendTest;

public class MainActivity extends Activity implements View.OnClickListener {

    private MasterSendTest masterSendTest;
    private Button btn_sendBroadcast_dynamic, btn_sendBroadcast_static,
            btn_startService, btn_bindService,
            btn_contentProvider,
            btn_socket,
            btn_startActivityOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        masterSendTest = new MasterSendTest();
        initView();
    }

    private void initView() {
        btn_sendBroadcast_dynamic = (Button) findViewById(R.id.send_broadcast_dynamic);
        btn_sendBroadcast_dynamic.setOnClickListener(this);

        btn_sendBroadcast_static = (Button) findViewById(R.id.send_broadcast_static);
        btn_sendBroadcast_static.setOnClickListener(this);

        btn_startService = (Button) findViewById(R.id.btn_startService);
        btn_startService.setOnClickListener(this);

        btn_bindService = (Button) findViewById(R.id.btn_bindService);
        btn_bindService.setOnClickListener(this);

        btn_contentProvider = (Button) findViewById(R.id.btn_contentProvider);
        btn_contentProvider.setOnClickListener(this);

        btn_socket = (Button) findViewById(R.id.btn_socket);
        btn_socket.setOnClickListener(this);

        btn_startActivityOne = (Button) findViewById(R.id.btn_startActivityOne);
        btn_startActivityOne.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.send_broadcast_dynamic:
                masterSendTest.sendDynamicBroadcast(MainActivity.this, new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {

                    }
                });
                break;

            case R.id.send_broadcast_static:
                masterSendTest.sendStaticBroadcast(getApplicationContext());
                break;
            case R.id.btn_startService:
                masterSendTest.startServiceSend(MainActivity.this);
                break;
            case R.id.btn_bindService:
                masterSendTest.bindServiceSend(MainActivity.this, new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName name, IBinder service) {

                    }
                    @Override
                    public void onServiceDisconnected(ComponentName name) {

                    }
                });
                break;
            case R.id.btn_contentProvider:
               masterSendTest.addContentProvider(MainActivity.this);
                break;
            case R.id.btn_socket:
                masterSendTest.sendSocketMessage(MainActivity.this);
                break;
            case R.id.btn_startActivityOne:

                break;
            default:
                break;

        }
    }
}
