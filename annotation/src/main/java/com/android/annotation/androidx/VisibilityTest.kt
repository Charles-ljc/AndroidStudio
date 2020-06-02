package com.android.annotation.androidx

class VisibilityTest {

    private lateinit var visibleForTesting: VisibleForTesting
    private lateinit var restrictTo: RestrictTo

    fun testVisibleForTesting() {
        visibleForTesting.packagePrivateMethodVisibleForTesting()
        visibleForTesting.protectedMethodVisibleForTesting()
        // warning
        visibleForTesting.privateMethodVisibleForTesting()
        // error
        visibleForTesting.noneMethodVisibleForTesting()
    }

    fun testRestrictTo() {
        restrictTo.libraryMethod()
        restrictTo.libraryGroupMethod()
        restrictTo.libraryGroupPrefixMethod()
        // error
        restrictTo.testsMethod()
        // error
        restrictTo.subclassesMethod()
    }
}
