package com.example.gameofdice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button roll;
    public ImageView cubeImageView1;
    public ImageView cubeImageView2;
    public ImageView cubeImageView3;
    public Animation cubeAnim;

    public Animation getCubeAnim() {
        return cubeAnim;
    }

    public void setCubeAnim(Animation cubeAnim) {
        this.cubeAnim = cubeAnim;
    }

    public ImageView getCubeImageView1() {
        return cubeImageView1;
    }
    public void setCubeImageView1(ImageView cubeImageView1) {
        this.cubeImageView1 = cubeImageView1;
    }
    public ImageView getCubeImageView2() {
        return cubeImageView2;
    }
    public void setCubeImageView2(ImageView cubeImageView2) {
        this.cubeImageView2 = cubeImageView2;
    }
    public ImageView getCubeImageView3() {
        return cubeImageView3;
    }
    public void setCubeImageView3(ImageView cubeImageView3) {
        this.cubeImageView3 = cubeImageView3;
    }


    //для получения доступа к изменению переменных в этом классе
    private static MainActivity instance;
    public static MainActivity getInstance(){
        return instance;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;

        //присвоение переменным местоположение кубиков
        cubeImageView1 = (ImageView) findViewById(R.id.cube_1);
        cubeImageView2 = (ImageView) findViewById(R.id.cube_2);
        cubeImageView3 = (ImageView) findViewById(R.id.cube_3);

        //кнопка бросить кубики
        roll = (Button) findViewById(R.id.roll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StartGame startGame = new StartGame();
                startGame.CreatePlayers();
//                startGame.CreateComputer();
                startGame.CompareResults();


            }
        }
        );

    }
}