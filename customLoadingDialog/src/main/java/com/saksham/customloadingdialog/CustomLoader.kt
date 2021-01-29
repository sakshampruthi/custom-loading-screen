package com.saksham.customloadingdialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewbinding.ViewBinding
import com.airbnb.lottie.LottieAnimationView
import com.saksham.customloadingdialog.databinding.FragmentCutomLoaderBinding

class CustomLoader(context: Context, private val animation: Int) : Dialog(context) {

    lateinit var binding: FragmentCutomLoaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentCutomLoaderBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //setting layout
        window?.setLayout(
            ConstraintLayout.LayoutParams.MATCH_PARENT,
            ConstraintLayout.LayoutParams.MATCH_PARENT
        )
        //making background transparent
        window?.setBackgroundDrawableResource(R.color.transparent)

        binding.loading.setAnimation(animation)
    }
}