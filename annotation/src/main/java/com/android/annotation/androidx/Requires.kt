package com.android.annotation.androidx

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresFeature
import androidx.annotation.RequiresPermission

interface Requires {

    @RequiresApi(Build.VERSION_CODES.Q)
    fun requiresApiValue()

    // 和 value 一样，为了省略 api= ，添加了 value
    @RequiresApi(api = Build.VERSION_CODES.Q)
    fun requiresApi()

    @RequiresFeature(
        name = PackageManager.FEATURE_CAMERA, enforcement = "PackageManager.hasSystemFeature"
    )
    fun requiresFeature()

    // 权限
    /**
     * https://developer.android.google.cn/studio/write/annotations#permissions
     */
    companion object {
        // 对于 intent 的权限，请在用来定义 intent 操作名称的字符串字段上添加权限要求
        @RequiresPermission(Manifest.permission.BLUETOOTH)
        const val ACTION_REQUEST_DISCOVERABLE = "android.bluetooth.action.REQUEST_DISCOVERABLE"

        // 如果您需要对内容提供程序拥有单独的读取和写入访问权限，则需要将每个权限要求封装在 @RequiresPermission.Read 或 @RequiresPermission.Write 注释中：
        @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
        @RequiresPermission.Read(RequiresPermission(Manifest.permission.READ_EXTERNAL_STORAGE))
        @RequiresPermission.Write(RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE))
        private val BOOKMARKS_URI = Uri.parse("content://browser/bookmarks")
    }

    @RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
    fun writeFile()

    // 要检查是否具有某组权限，请使用 allOf 属性。
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresPermission(allOf = [Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE])
    fun writeAndReadFile()

    // 要检查是否具有一系列有效权限中的一项权限，请使用 anyOf 属性。
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresPermission(anyOf = [Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE])
    fun writeOrReadFile()

    // 附带条件的
    @RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, conditional = true)
    fun conditional()

    // 间接权限
    // 如果权限依赖于为某个方法的参数提供的特定值，则应对该参数本身使用 @RequiresPermission，而不必列出具体权限。
    // 对于间接权限，@RequiresPermission 不应与读取或写入权限注释结合使用。

    // @SdkConstant(SdkConstantType.ACTIVITY_INTENT_ACTION)
    // @RequiresPermission(Manifest.permission.CALL_PHONE)
    // const val ACTION_CALL = "android.intent.action.CALL"
    fun startActivity(@RequiresPermission intent: Intent)
}
