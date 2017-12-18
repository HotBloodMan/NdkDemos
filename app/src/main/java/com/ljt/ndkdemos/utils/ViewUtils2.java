package com.ljt.ndkdemos.utils;

/**
 * Created by 1 on 2017/9/6.
 * 参考1 http://blog.csdn.net/allen315410/article/details/41862479
 * 参考2 http://blog.csdn.net/yanbober/article/details/45309049
 */

public class ViewUtils2 {
    public ViewUtils2(){

    }
    static{
        System.loadLibrary("hellojni");
    }
//    public static native String getString_FromJni();

    public void nullMethod() {
        System.out.println("hello from java");
    }
    /**
     * C调用java中的带两个int参数的方法
     *
     * @param x
     * @param y
     * @return
     */
    public int Add(int x, int y) {
        System.out.println("hello from java 1213131");
        int result = x + y;
        System.out.println("result in java " + result);
        return result;
    }
    /**
     * C调用java中参数为String的方法
     *
     * @param s
     */
    public void printString(String s) {
        System.out.println("java " + s);
    }

    // 本地方法
    public native void callMethod1();
//    public native void callMethod2();
//    public native void callMethod3();
//
//}

}
