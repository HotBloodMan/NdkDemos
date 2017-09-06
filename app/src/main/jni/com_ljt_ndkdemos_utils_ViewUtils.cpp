//
// Created by 1 on 2017/9/6.
//

#include "com_ljt_ndkdemos_utils_ViewUtils.h"

JNIEXPORT jstring JNICALL Java_com_ljt_ndkdemos_utils_ViewUtils_getStringFromJni
        (JNIEnv *env, jclass cls){
    return (*env).NewStringUTF("Hello,This is from Jni");
}