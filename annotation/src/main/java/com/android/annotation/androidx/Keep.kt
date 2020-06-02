package com.android.annotation.androidx

import androidx.annotation.Keep

/**
 * https://developer.android.google.cn/studio/write/annotations#keep
 *
 * 如果在构建时缩减代码大小，将不会移除带有该注释的类或方法。
 *
 * 使用 @Keep 注释的类和方法会始终包含在应用的 APK 中，即使您从未在应用逻辑中引用这些类和方法也是如此。
 */
@Keep
class Keep {

    @Keep
    val nameNeedKeep: String = "1"

    @Keep
    fun methodNeedKeep() {

    }

}
