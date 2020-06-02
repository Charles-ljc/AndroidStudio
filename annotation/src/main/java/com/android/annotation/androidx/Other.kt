package com.android.annotation.androidx

import androidx.annotation.GuardedBy
import androidx.annotation.InspectableProperty

class Other {

    // GuardedBy
    private val objectLock = Any()

    @GuardedBy("objectLock")
    @Volatile
    var `object`: Any? = null

    fun guardedBy(): Any? {
        synchronized(objectLock) {
            if (`object` == null) {
                `object` = Any()
            }
        }
        return `object`
    }

    // InspectableProperty
    @InspectableProperty(name = "width", attributeId = android.R.attr.layout_width)
    fun getWidthValue() {
    }
}