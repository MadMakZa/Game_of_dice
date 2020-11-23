package com.example.gameofdice;

import android.nfc.Tag;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/* *
 * Игральный кубик, умеет генерировать рандомное число
 * */

public class Dice {
    private Animation cubeAnim;
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

    enum DiceVisual {

        ONE {
            public Animation cubeAnim;
            private ImageView cubeImage = (ImageView) findViewById(R.id.cube_1);

            public void DiceImageAnimation () {
                cubeAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cube_anim);
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube1);
            }
        },
    }
}
