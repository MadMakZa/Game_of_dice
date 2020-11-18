package com.example.gameofdice;

import android.nfc.Tag;
import android.util.Log;

public class Dice {
    //диапазон разброса
    private static final int A = 1;
    private static final int B = 6;

    int random_number = A + (int) (Math.random() * B);
    Log.d("Dice","Кубик выпал на: " );

}
