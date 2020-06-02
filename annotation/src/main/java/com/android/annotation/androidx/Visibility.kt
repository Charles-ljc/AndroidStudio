package com.android.annotation.androidx

import androidx.annotation.RestrictTo
import androidx.annotation.VisibleForTesting

/**
 * https://developer.android.google.cn/studio/write/annotations#visible
 */
interface VisibleForTesting {

    // Lint 使用 otherwise 参数来强制执行预期的公开范围。
    @VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
    fun privateMethodVisibleForTesting()

    @VisibleForTesting(otherwise = VisibleForTesting.PACKAGE_PRIVATE)
    fun packagePrivateMethodVisibleForTesting()

    @VisibleForTesting(otherwise = VisibleForTesting.PROTECTED)
    fun protectedMethodVisibleForTesting()

    // 指明方法的存在只是为了进行测试。这种形式与使用 @RestrictTo(TESTS) 相同。这两者执行相同的 Lint 检查。
    @VisibleForTesting(otherwise = VisibleForTesting.NONE)
    fun noneMethodVisibleForTesting()

}

/**
 * https://developer.android.google.cn/studio/write/annotations#restrict
 */
interface RestrictTo {

    // group ID 和 artifact ID 相同才可以访问
    @RestrictTo(RestrictTo.Scope.LIBRARY)
    fun libraryMethod()

    // group ID 相同才可以访问
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP)
    fun libraryGroupMethod()

    // group ID 的最后一个点之前相同才可以访问
    @RestrictTo(RestrictTo.Scope.LIBRARY_GROUP_PREFIX)
    fun libraryGroupPrefixMethod()

    // 只有测试代码可以访问被注释的 API。
    @RestrictTo(RestrictTo.Scope.TESTS)
    fun testsMethod()

    // 仅限子类访问 API，只有对被注释的类进行扩展的类可以访问此 API。
    @RestrictTo(RestrictTo.Scope.SUBCLASSES)
    fun subclassesMethod()
}
