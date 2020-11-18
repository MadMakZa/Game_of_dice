package com.example.gameofdice;

import android.nfc.Tag;
import android.util.Log;

/* *
 * Игральный кубик, умеет генерировать рандомное число
 * */

public class Dice {
    //диапазон разброса
    private final int a = 1;
    private final int b = 6;
    private int random_number;

    public int getRandom_number() {
        return random_number;
    }

    public int generateRandomNumber() {
        random_number = a + (int) (Math.random() * b);
        return random_number;
    }

}
