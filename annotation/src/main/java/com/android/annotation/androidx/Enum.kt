package com.android.annotation.androidx

import androidx.annotation.IntDef
import androidx.annotation.LongDef
import androidx.annotation.StringDef

/**
 * https://developer.android.google.cn/studio/write/annotations#enum-annotations
 */
object Enum {

    // Declare the constants
    const val NAVIGATION_MODE_STANDARD = 0L
    const val NAVIGATION_MODE_LIST = 1L
    const val NAVIGATION_MODE_TABS = 2L

    @Retention(AnnotationRetention.SOURCE)
    @LongDef(
        NAVIGATION_MODE_STANDARD,
        NAVIGATION_MODE_LIST,
        NAVIGATION_MODE_TABS
    )
    annotation class NavigationMode

    fun setMode(@NavigationMode mode: Long) {

    }

    // 用作flag，可使用标记（如 |、&、^ 等）将允许的常量组合
    const val DISPLAY_USE_LOGO = 0
    const val DISPLAY_SHOW_HOME = 1
    const val DISPLAY_HOME_AS_UP = 2

    @IntDef(flag = true, value = [DISPLAY_USE_LOGO, DISPLAY_SHOW_HOME, DISPLAY_HOME_AS_UP])
    @Retention(AnnotationRetention.SOURCE)
    annotation class DisplayOptions

    fun setDisplay(@DisplayOptions option: Int = DISPLAY_USE_LOGO or DISPLAY_SHOW_HOME) {

    }

    // 支持未定义的其他值
    const val COUNTRY_CHINA = "CHINA"

    @StringDef(open = true, value = [COUNTRY_CHINA])
    @Retention(AnnotationRetention.SOURCE)
    annotation class CountryName

    fun setCountry(@CountryName country: String = "Other Country") {

    }

}
