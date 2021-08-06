package com.saksham.loading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.saksham.customloadingdialog.*;

import com.saksham.loading.databinding.ActivityMainBinding;

public class JavaActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.clickMe.setOnClickListener(v ->
                Loader.showDialog(this,
                true,
                R.raw.paperplane
        ));
        Loader.hideDialog();
    }
}