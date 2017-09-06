package com.ljt.ndkdemos.utils;

/**
 * Created by 1 on 2017/9/6.
 */

public class ViewUtils {
    static{
        System.loadLibrary("hellojni");
    }

    public static native String getStringFromJni();
}
