#include<stdio.h>
#include<jni.h>
#include"com_ljt_ndkdemos_utils_ViewUtils.h"
#include<android/log.h>
#define LOG_TAG "System.out.c"
#define LOGD(...) android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#include<cstdio>

//
// Created by 1 on 2017/12/18.
//



JNIEXPORT void JNICALL Java_com_ljt_ndkdemos_utils_ViewUtils_callMethod1
(JNIEnv * env, jobject obj){


jclass clazz = (*env).FindClass( "com/ljt/ndkdemos/utils/ViewUtils");
    if(clazz==0){
      return;
    }

// 1
//jmethodID method1 = (*env).GetMethodID(clazz,"nullMethod","()V");
//if(method1 == 0){
//return;
//}
//(*env).CallVoidMethod(obj, method1);
//调方法2
jmethodID method2 = (*env).GetMethodID(clazz,"Add","(II)I");
if(method2 == 0){
return;
}
int result=(*env).CallIntMethod(obj,method2,3,5);
cout<<"result= "<<result<<endl;
//(*env).CallVoidMethod(clazz, method2);

//(*env).CallVoidMethod(clazz, callMethod1);

//3.调用方法
//void (*CallVoidMethod)(JNIEnv*, jobject, jmethodID, ...);
//(*env).CallVoidMethod(obj, method1);
}