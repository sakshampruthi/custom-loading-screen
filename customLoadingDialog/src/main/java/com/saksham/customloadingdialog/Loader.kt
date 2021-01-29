package com.saksham.customloadingdialog

import android.content.Context

private var customLoader: CustomLoader? = null

fun showDialog(context: Context?,
               cancellable: Boolean,
               animation: Int
) {
    hideDialog()
    if (context != null) {
        try {
            // Initialize the class
            customLoader = CustomLoader(context, animation)
            //setting dialog properties
            customLoader?.let {
                it.setCanceledOnTouchOutside(true)
                it.setCancelable(cancellable)
                it.show()
            }

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

fun hideDialog() {
    //dismissing the dialog
    if (customLoader != null && customLoader?.isShowing!!) {
        customLoader = try {
            customLoader?.dismiss()
            null
        } catch (e: Exception) {
            null
        }
    }
}