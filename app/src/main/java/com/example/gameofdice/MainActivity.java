package com.example.gameofdice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Dice 21 Points game
 */
public class MainActivity extends AppCompatActivity {

    private ImageView cubeImageView1;
    private ImageView cubeImageView2;
    private ImageView cubeImageView3;
    private TextView scoreRound;
    private TextView scorePlayer;
    private TextView scoreComp;
//    private MediaPlayer soundDices;


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
    public TextView getScoreRound() {
        return scoreRound;
    }
    public void setScoreRound(TextView scoreRound) {
        this.scoreRound = scoreRound;
    }
    public TextView getScorePlayer() {
        return scorePlayer;
    }
    public void setScorePlayer(TextView scorePlayer) {
        this.scorePlayer = scorePlayer;
    }
    public TextView getScoreComp() {
        return scoreComp;
    }
    public void setScoreComp(TextView scoreComp) {
        this.scoreComp = scoreComp;
    }


    //для получения доступа к изменению переменных в этом классе
    private static MainActivity instance;
    public static MainActivity getInstance(){
        return instance;
    }

    public void init() {
        //присвоение переменным местоположение на экране
        cubeImageView1 = (ImageView) findViewById(R.id.cube_1);
        cubeImageView2 = (ImageView) findViewById(R.id.cube_2);
        cubeImageView3 = (ImageView) findViewById(R.id.cube_3);
        scoreRound = (TextView) findViewById(R.id.score_round);
        scorePlayer = (TextView) findViewById(R.id.playerPoints);
        scoreComp = (TextView) findViewById(R.id.compPoints);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instance = this;

        init();
        //запуск стартового окна
        startDialog();



//        //кнопка бросить кубики
//        roll.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                StartGame startGame = new StartGame();
//                startGame.CreatePlayer();
////                startGame.CreateComputer();
////                startGame.CompareResults();
//
//
//            }
//        }
//        );


    }
    //бросок кубиков по нажатию на экран
//    public void onClickPlayerField(View view) {
//        StartGame startGame = new StartGame();
//        startGame.CreatePlayer();
//    }
    //диалоговое окно ставок и броска кубиков
    public void startDialog(){
        final Dialog startDialog = new Dialog(this);
        startDialog.setContentView(R.layout.dialog_start);
        startDialog.setTitle("Start Dialog");
        startDialog.show();

        //кнопка бросить кубики
        Button roll = (Button) startDialog.findViewById(R.id.roll);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StartGame startGame = new StartGame();
                startGame.CreatePlayer();
                startDialog.dismiss();

            }
        }
        );

    }
}