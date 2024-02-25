package com.example.freshnessdetection.ui.splash;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.core.splashscreen.SplashScreen;
import com.example.freshnessdetection.MainActivity;
import com.example.freshnessdetection.databinding.ActivityMainBinding;
import com.example.freshnessdetection.databinding.ActivitySplashScreenBinding;

public class SplashsScreenActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState);
    com.example.freshnessdetection.databinding.ActivitySplashScreenBinding binding =
        ActivitySplashScreenBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    //startActivity(new Intent(this, MainActivity.class));
    //finish();
  }
}