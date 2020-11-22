package com.example.gameofdice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button roll;
    private Animation cubeAnim;
    private ImageView cubeImage1;
    private ImageView cubeImage2;
    private ImageView cubeImage3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //анимация
        cubeAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.cube_anim);
        cubeImage1 = findViewById(R.id.cube_1);
        cubeImage1.setImageResource(R.drawable.cube1);

        //запуск анимации
        cubeImage1.startAnimation(cubeAnim);

        //test cube
        roll = (Button) findViewById(R.id.roll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartGame startGame = new StartGame();
                startGame.CreatePlayers();
                startGame.CreateComputer();
                startGame.CompareResults();

            }
        }
        );

    }
}