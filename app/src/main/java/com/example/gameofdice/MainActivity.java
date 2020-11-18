package com.example.gameofdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button roll =

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test cube
        Dice dice1 = new Dice();
//        dice1.generateRandomNumber();

        Log.d("Create dice", "На кубике выпало: "+ dice1.generateRandomNumber());
    }
}