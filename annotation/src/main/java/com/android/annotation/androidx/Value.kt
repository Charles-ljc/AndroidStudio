package com.android.annotation.androidx

import androidx.annotation.*
import androidx.annotation.IntRange

/**
 * https://developer.android.google.cn/studio/write/annotations#value-constraint
 */
interface Value {

    fun setAlpha(@IntRange(from = 0, to = 255) alpha: Int)

    // 检查浮点型或双精度型参数值是否在指定的浮点值范围内
    fun setAlpha(@FloatRange(from = 0.0, to = 1.0) alpha: Float)

    // 不包含from和to
    fun setFloatInclusive(@FloatRange(fromInclusive = false, toInclusive = false) float: Float)

    // 最小大小，@Size(min=1) 可以检查某个集合是否不为空
    fun setMinSize(@Size(min = 2) array: IntArray)

    // 最大大小
    fun setMaxSize(@Size(max = 2) array: IntArray)

    // 确切大小，@Size(3) 可以验证某个数组是否正好包含三个值
    fun setValueSize(@Size(2) array: IntArray)

    // 大小必须是指定数字的倍数
    fun setMultipleSize(@Size(multiple = 2) array: IntArray)

    // HalfFloat
    fun setHalfFloat(@HalfFloat short: Short)

    fun setPx(@Px px: Int)
}
