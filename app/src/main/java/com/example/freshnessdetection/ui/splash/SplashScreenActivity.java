package com.example.freshnessdetection.ui.splash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.freshnessdetection.MainActivity;
import com.example.freshnessdetection.R;
import com.example.freshnessdetection.databinding.ActivitySplashScreenBinding;
import com.example.freshnessdetection.util.Typewriter;

@SuppressLint("CustomSplashScreen")
public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        com.example.freshnessdetection.databinding.ActivitySplashScreenBinding binding =
                ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
        }, 6000);

        Typewriter writer = findViewById(R.id.typewriter);
        writer.setCharacterDelay(200);
        writer.animateText(getResources().getString(R.string.app_name));
    }
}