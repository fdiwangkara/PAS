package com.example.pasmbekdaffa;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;

public class Onboarding1 extends Fragment {

    MaterialButton button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onboarding1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        button = view.findViewById(R.id.next);

        button.setOnClickListener(v -> {
            FragmentManager fragment = getParentFragmentManager();
            Onboarding2 fragment1 = new Onboarding2();
            fragment
                    .beginTransaction()
                    .replace(R.id.frame_layout, fragment1, Onboarding2.class.getSimpleName())
                    .addToBackStack(null)
                    .commit();
        });



    }
}