package com.example.pasmbekdaffa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler bebas = new Handler();
            bebas.postDelayed(() -> {
                Intent pindah = new Intent(this, LoginActivity.class);
                startActivity(pindah);
            }, 3000);
    }
}