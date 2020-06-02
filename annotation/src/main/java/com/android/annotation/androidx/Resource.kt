package com.android.annotation.androidx

import android.graphics.Color
import android.os.Build
import androidx.annotation.*

/**
 * https://developer.android.google.cn/studio/write/annotations#res-annotations
 */
interface Resource {

    fun getAnimatorRes(@AnimatorRes res: Int)

    fun getAnimRes(@AnimRes res: Int)

    fun getAnyRes(@AnyRes res: Int)

    fun getArrayRes(@ArrayRes res: Int)

    fun getAttrRes(@AttrRes res: Int)

    fun getBoolRes(@BoolRes res: Int)

    // Color
    fun getColorInt(@ColorInt color: Int = Color.BLACK)

    @RequiresApi(Build.VERSION_CODES.O)
    fun getColorLong(@ColorLong color: Long = Color.pack(Color.BLACK))
    fun getColorRes(@ColorRes res: Int)

    fun getDimenRes(@DimenRes res: Int)
    fun getDimension(@Dimension(unit = Dimension.DP) dimension: Int)

    fun getDrawableRes(@DrawableRes res: Int)

    fun getFontRes(@FontRes res: Int)

    fun getFractionRes(@FractionRes res: Int)

    fun getIdRes(@IdRes res: Int)

    fun getIntegerRes(@IntegerRes res: Int)

    fun getInterpolatorRes(@InterpolatorRes res: Int)

    fun getLayoutRes(@LayoutRes res: Int)

    fun getMenuRes(@MenuRes res: Int)

    fun getNavigationRes(@NavigationRes res: Int)

    fun getPluralsRes(@PluralsRes res: Int)

    fun getRawRes(@RawRes res: Int)

    fun getStringRes(@StringRes res: Int)

    fun getStyleableRes(@StyleableRes res: Int)

    fun getStyleRes(@StyleRes res: Int)

    fun getTransitionRes(@TransitionRes res: Int)

    fun getXmlRes(@XmlRes res: Int)
}
