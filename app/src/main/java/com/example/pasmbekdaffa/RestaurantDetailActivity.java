package com.example.pasmbekdaffa;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class RestaurantDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        BottomSheetBehavior.from(sheet).apply {
            peekHeight=200
            this.state= BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}