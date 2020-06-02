package com.android.annotation.androidx;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * https://developer.android.google.cn/studio/write/annotations#adding-nullness
 * <p>
 * 对于 Kotlin，我们不需要使用 @NonNull 注释，因为当我们指定了不可为 null 的类型时，该注释会自动添加到生成的字节码。
 * <p>
 * Android Studio Lint 检查工具只会查找 Android null 注释。
 */
public class Nullness {
    // NonNull
    // 变量
    @NonNull
    String nonNullVariable = "NonNull";

    // 返回值
    @NonNull
    String nonNullMethod(/*参数*/@NonNull String string) {
        return "NonNull";
    }

    // Nullable
    // 变量
    @Nullable
    String nullableVariable;

    // 返回值
    @Nullable
    String nullableMethod(/*参数*/@Nullable String string) {
        return null;
    }
}
