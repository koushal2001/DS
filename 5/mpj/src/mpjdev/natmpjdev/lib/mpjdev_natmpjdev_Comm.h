/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class mpjdev_natmpjdev_Comm */

#ifndef _Included_mpjdev_natmpjdev_Comm
#define _Included_mpjdev_natmpjdev_Comm
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    loadGlobalLibraries
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_mpjdev_natmpjdev_Comm_loadGlobalLibraries
  (JNIEnv *, jclass);
  
/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    getTagUB
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_mpjdev_natmpjdev_Comm_getTagUB
  (JNIEnv *, jclass);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    getWorld
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_getWorld
  (JNIEnv *, jclass);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    dup
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_dup
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    rank
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_mpjdev_natmpjdev_Comm_rank
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    size
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_mpjdev_natmpjdev_Comm_size
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    create
 * Signature: (J[I)J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_create
  (JNIEnv *, jobject, jlong, jintArray);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeSplit
 * Signature: (JII)J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_nativeSplit
  (JNIEnv *, jobject, jlong, jint, jint);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeCreate
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_nativeCreate
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeCreateIntercomm
 * Signature: (JJIII)J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_nativeCreateIntercomm
  (JNIEnv *, jobject, jlong, jlong, jint, jint, jint);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    free
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_free
  (JNIEnv *, jobject, jlong);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeInit
 * Signature: ([Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeInit
  (JNIEnv *, jclass, jobjectArray);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeFinish
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeFinish
  (JNIEnv *, jclass);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    group
 * Signature: ()J
 */
JNIEXPORT jlong JNICALL Java_mpjdev_natmpjdev_Comm_group
  (JNIEnv *, jobject);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    GetComm
 * Signature: (I)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_GetComm
  (JNIEnv *, jobject, jint);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeSend
 * Signature: (JLmpjbuf/Buffer;IIII)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeSend
  (JNIEnv *, jobject, jlong, jobject, jint, jint, jint, jint);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeRecv
 * Signature: (JLmpjbuf/Buffer;IIILmpjdev/Status;)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeRecv
  (JNIEnv *, jobject, jlong, jobject, jint, jint, jint, jobject);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeSsend
 * Signature: (JLmpjbuf/Buffer;IIII)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeSsend
  (JNIEnv *, jobject, jlong, jobject, jint, jint, jint, jint);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeIssend
 * Signature: (JLmpjbuf/Buffer;IIIILmpjdev/natmpjdev/NativeSendRequest;)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeIssend
  (JNIEnv *, jobject, jlong, jobject, jint, jint, jint, jint, jobject);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeIsend
 * Signature: (JLmpjbuf/Buffer;IIIILmpjdev/natmpjdev/NativeSendRequest;)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeIsend
  (JNIEnv *, jobject, jlong, jobject, jint, jint, jint, jint, jobject);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeIrecv
 * Signature: (JLmpjbuf/Buffer;IILmpjdev/Status;Lmpjdev/natmpjdev/NativeRecvRequest;)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeIrecv
  (JNIEnv *, jobject, jlong, jobject, jint, jint, jobject, jobject);

/*
 * Class:     mpjdev_natmpjdev_Comm
 * Method:    nativeProbe
 * Signature: (JIILmpjdev/Status;)V
 */
JNIEXPORT void JNICALL Java_mpjdev_natmpjdev_Comm_nativeProbe
  (JNIEnv *, jobject, jlong, jint, jint, jobject);

#ifdef __cplusplus
}
#endif
#endif