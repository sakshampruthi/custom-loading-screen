package com.saksham.loading

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.saksham.customloadingdialog.*
import com.saksham.loading.databinding.ActivityMainBinding
import com.sample.viewbinding.activity.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.clickMe.setOnClickListener {
            showDialog(this, true, R.raw.paperplane)
        }

    }
}