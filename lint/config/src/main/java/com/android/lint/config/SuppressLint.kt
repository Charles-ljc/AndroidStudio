package com.android.lint.config

import android.annotation.SuppressLint
import android.content.Context
import android.widget.TextView
import java.text.SimpleDateFormat

//https://developer.android.google.cn/studio/write/lint#configuring-lint-checking-in-java-or-kotlin


/**
 * 不使用
 */
private val formatNoLint = SimpleDateFormat("yyyy-MM-dd")


/**
 * 对类使用
 */
@SuppressLint("SimpleDateFormat")
class SuppressClass {
    private val format = SimpleDateFormat("yyyy-MM-dd")
}


/**
 * 对变量使用
 */
@SuppressLint("SimpleDateFormat")
private val format = SimpleDateFormat("yyyy-MM-dd")


/**
 * 对方法使用
 */
@SuppressLint("SimpleDateFormat")
private fun format() {
    SimpleDateFormat("yyyy-MM-dd")
}


/**
 * 禁止 lint 检查文件中的所有问题
 */
@SuppressLint("all")
class SuppressAll(context: Context) {

    init {
        SimpleDateFormat("yyyy-MM-dd")
        TextView(context).text = "Text"
    }
}
