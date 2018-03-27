# ILCTestData
自己写的一些测试数据
</br>
jar、app文件及其对应projecet
</br>
***jar ：jar的项目
</br>
***test：引用***jar的app项目

------------------------------------------------------------------------------

devicejar：读取设备device id，并写入文件
</br>
devicetest：使用devicejar的app
</br>
</br>
recdevicejar：接收 devicetest app的数据
</br>
recdevicetest：使用recdevicejar的app
</br>
</br>
</br>
messagerclient：使用Messager进行通信，客户端
</br>messagerserver：使用Messager进行通信，服务端

------------------------------------------------------------------------------
#DroidBench -- master 数据集
改自DroidBench 修改成库的形式
</br>① https://github.com/secure-software-engineering/DroidBench/tree/master/eclipse-project/InterAppCommunication
</br>-- Echoer                            ->    droidbench_echoer
</br>-- SendSMS                           ->    droidbench_sendsms
</br>-- StartActivityForResult1           ->    droidbench_startactivityforresult1
</br>
</br>
</br>DroidBench -- dev 数据集
</br>② https://github.com/secure-software-engineering/DroidBench/tree/develop/eclipse-project/InterAppCommunication
</br>-- Collector
</br>-- Device_id Leakage
</br>	---- DeviceId_Broadcast1
</br>    ---- DeviceId_OrderedIntent1
</br>    ---- DeviceId_Service1
</br>    ---- DeviceId_contentProvider1
</br>-- Echoer
</br>-- Location Leakage
</br>	---- Location1
</br>	---- Location_Broadcast1
</br>	---- Location_Service1
</br>-- SendSMS
</br>-- StartActivityForResult1
