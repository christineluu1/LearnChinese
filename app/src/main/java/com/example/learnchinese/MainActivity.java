package com.example.learnchinese;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.os.Bundle;

import com.example.learnchinese.fragments.HomeFragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // injecter le fragment dans notre box (fragment_container)
/*
        FragmentManager fragmentManager = fram;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new HomeFragment());
        transaction.addToBackStack(null);
        fragmentTransaction.commit();*/
        
    }
}