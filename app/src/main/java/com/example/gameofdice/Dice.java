package com.example.gameofdice;

import android.nfc.Tag;
import android.util.Log;

public class Dice {
    //диапазон разброса
    private final int a = 1;
    private final int b = 6;

    public int generateRandomNumber() {
        int random_number = a + (int) (Math.random() * b);
        return random_number;
    }

}
