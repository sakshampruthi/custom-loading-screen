package com.saksham.customloadingdialog

import android.content.Context

private var customLoader: CustomLoader? = null
fun showDialog(context: Context?, cancelable: Boolean, animation: Int) {
    hideDialog()
    if (context != null) {
        try {
            customLoader = CustomLoader(context, animation)
            customLoader?.let {
                it.setCanceledOnTouchOutside(true)
                it.setCancelable(cancelable)
                it.show()
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

fun hideDialog() {
    if (customLoader != null && customLoader?.isShowing!!) {
        customLoader = try {
            customLoader?.dismiss()
            null
        } catch (e: Exception) {
            null
        }
    }
}