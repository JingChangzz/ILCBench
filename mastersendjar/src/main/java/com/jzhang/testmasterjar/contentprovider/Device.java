package com.jzhang.testmasterjar.contentprovider;

import android.net.Uri;

/**
 * Created by zhangrui on 2018/3/22.
 */

public class Device {
    public static final String MIME_DIR_PREFIX = "vnd.android.cursor.dir";
    public static final String MIME_ITEM_PREFIX = "vnd.android.cursor.item";
    public static final String MIME_ITEM = "vnd.example.device";

    public static final String MIME_TYPE_SINGLE = MIME_ITEM_PREFIX + "/" + MIME_ITEM ;
    public static final String MIME_TYPE_MULTIPLE = MIME_DIR_PREFIX + "/" + MIME_ITEM ;

    public static final String AUTHORITY = "com.example.deviceprovider";
    public static final String PATH_SINGLE = "device/#";
    public static final String PATH_MULTIPLE = "device";
    public static final String CONTENT_URI_STRING = "content://" + AUTHORITY + "/" + PATH_MULTIPLE;
    public static final Uri CONTENT_URI = Uri.parse(CONTENT_URI_STRING);

    public static final String KEY_ID = "_id";
    public static final String KEY_DEVICEID = "deviceid";
}
