package com.android.annotation.androidx

import androidx.annotation.CheckResult

/**
 * https://developer.android.google.cn/studio/write/annotations#check-result
 *
 * 可验证是否实际使用了方法的结果或返回值。应添加注释来阐明可能令人困惑的方法的结果，而不是使用 @CheckResult 注释每个非 void 方法。
 */
interface CheckResult {

    @CheckResult(suggest = "#enforcePermission(String,int,int,String)")
    fun checkPermission(permission: String, pid: Int, uid: Int): Int

}
