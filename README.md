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
messagerserver：使用Messager进行通信，服务端

------------------------------------------------------------------------------
#DroidBench -- master 数据集
改自DroidBench 修改成库的形式
① https://github.com/secure-software-engineering/DroidBench/tree/master/eclipse-project/InterAppCommunication
-- Echoer                            ->    droidbench_echoer
-- SendSMS                           ->    droidbench_sendsms
-- StartActivityForResult1           ->    droidbench_startactivityforresult1
</br>
</br>
</br>
DroidBench -- dev 数据集
② https://github.com/secure-software-engineering/DroidBench/tree/develop/eclipse-project/InterAppCommunication
-- Collector
-- Device_id Leakage
	---- DeviceId_Broadcast1
    ---- DeviceId_OrderedIntent1
    ---- DeviceId_Service1
    ---- DeviceId_contentProvider1
-- Echoer
-- Location Leakage
	---- Location1
	---- Location_Broadcast1
	---- Location_Service1
-- SendSMS
-- StartActivityForResult1
