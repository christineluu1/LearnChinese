package com.example.learnchinese;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button goButton = findViewById(R.id.go);
        //goButton.setOnClickListener(new View.OnClickListener() {
        /*public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });*/
    }


        // injecter le fragment dans notre box (fragment_container)
/*
        FragmentManager fragmentManager = fram;
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, new HomeFragment());
        transaction.addToBackStack(null);
        fragmentTransaction.commit();*/
        

}