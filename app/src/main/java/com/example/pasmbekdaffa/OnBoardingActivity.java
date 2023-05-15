package com.example.pasmbekdaffa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.FrameLayout;

public class OnBoardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);



        FragmentManager fragment = getSupportFragmentManager();
        Onboarding1 fragment1 = new Onboarding1();
        fragment
                .beginTransaction()
                .add(R.id.frame_layout, fragment1, Onboarding1.class.getSimpleName())
                .commit();



    }
}