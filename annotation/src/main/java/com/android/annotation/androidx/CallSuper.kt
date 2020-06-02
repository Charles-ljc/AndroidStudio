package com.android.annotation.androidx

import android.app.Activity
import android.os.Bundle
import androidx.annotation.CallSuper

/**
 * https://developer.android.google.cn/studio/write/annotations#call-super
 *
 * 可验证替换方法是否会调用该方法的超类实现。
 */
class CallSuper : Activity() {

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
