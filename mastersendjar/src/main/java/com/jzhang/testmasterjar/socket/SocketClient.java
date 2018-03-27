package com.jzhang.testmasterjar.socket;

import android.util.Log;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by zhangrui on 2018/3/22.
 */

public class SocketClient {
    private Socket socket;
    /**
     * 建立服务端连接
     */
    public void conn(final  String ip,final  int port) {
        new Thread() {

            @Override
            public void run() {

                try {
                    socket = new Socket(ip, port);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    /**
     * 发送消息
     */
    public void sendMessage(final  String msg) {
        new Thread() {
            @Override
            public void run() {

                try {
                    // socket.getInputStream()
                    DataOutputStream writer = new DataOutputStream(socket.getOutputStream());
                    writer.writeUTF(msg); // 写一个UTF-8的信息
                    System.out.println("发送消息");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
