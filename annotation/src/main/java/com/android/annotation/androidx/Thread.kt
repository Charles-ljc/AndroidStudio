package com.android.annotation.androidx

import androidx.annotation.*

/**
 * https://developer.android.google.cn/studio/write/annotations#thread-annotations
 *
 * 构建工具会将 @MainThread 和 @UiThread 注释视为可互换，因此您可以从 @MainThread 方法调用 @UiThread 方法，反之亦然。
 *
 * 应使用 @UiThread 来注释与应用的视图层次结构关联的方法，并使用 @MainThread 仅标注与应用生命周期关联的方法。
 *
 * 如果某个类中的所有方法具有相同的线程要求，可以为该类添加一个线程注释。
 */
interface Thread {

    @MainThread
    fun mainThread()

    @UiThread
    fun uiThread()

    @WorkerThread
    fun workerThread()

    @BinderThread
    fun binderThread()

    @AnyThread
    fun anyThread()
}
