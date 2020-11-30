package com.example.gameofdice;

/* *
 * Бросок костей
 * */

import android.media.MediaPlayer;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public abstract class RollOfTheDice {
    //локальные переменные для работы со значениями
    private int cube1;
    private int cube2;
    private int cube3;
    private int points;
    private int comboPoints;
    private int pointsAndCombo;


    public int getCube1() {
        return cube1;
    }
    public int getCube2() {
        return cube2;
    }
    public int getCube3() {
        return cube3;
    }
    public int getComboPoints() {
        return comboPoints;
    }
    public int getPointsAndCombo() {
        return pointsAndCombo;
    }
    public int getPoints() {
        return points;
    }

    public void setPointsAndCombo(int pointsAndCombo) {
        this.pointsAndCombo = pointsAndCombo;
    }


    //создание экземпляров кубиков
    public void createDices(){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();
        cube1 = dice1.generateRandomNumber();
        cube2 = dice2.generateRandomNumber();
        cube3 = dice3.generateRandomNumber();

    }

    //логика подсчета очков
    public void sumOfPoints(){
        //просто сумма кубиков
        points = cube1+cube2+cube3;
        //бонусы за 2 одинаковых кубика
        if(cube1==cube2||cube2==cube3||cube1==cube3){
            pointsAndCombo += 2;
            comboPoints = 2;
        //бонусы за 3 одинкаовых кубика
        }
        if(cube1==cube2 && cube1==cube3){
            pointsAndCombo +=1;
            comboPoints = 3;
        }
        //бонусы за street
        if(cube1+1 == cube2 && cube1+2 == cube3 ||
           cube2+1 == cube1 && cube2+2 == cube3 ||
           cube3+1 == cube1 && cube3+2 == cube2 ||
           cube2-1 == cube1+1 && cube2-1 == cube3 ||
           cube3-1 == cube2 && cube3-2 == cube1 ||
           cube1-1 == cube2 && cube1-2 == cube3){
            pointsAndCombo +=3;
            comboPoints = 3;
        }
        //сумма выпавших значений кубиков + бонусы, если есть
        pointsAndCombo += getCube1()+getCube2()+getCube3();
    }

    //показать картинки кубиков на экране
    public void showSideDices() {

        switch (cube1) {
            case 1:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube1);
                break;
            case 2:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube2);
                break;
            case 3:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube3);
                break;
            case 4:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube4);
                break;
            case 5:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube5);
                break;
            case 6:
                MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube6);
                break;
        }
        switch (cube2) {
            case 1:
                MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube1);
                break;
            case 2:
                MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube2);
                break;
            case 3:
                MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube3);
                break;
            case 4:
                MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube4);
                break;
            case 5:
                MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube5);
                break;
            case 6:
                MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube6);
                break;
        }
        switch (cube3) {
            case 1:
                MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube1);
                break;
            case 2:
                MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube2);
                break;
            case 3:
                MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube3);
                break;
            case 4:
                MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube4);
                break;
            case 5:
                MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube5);
                break;
            case 6:
                MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube6);
                break;
        }



    }
        //вывод суммы очков на экран
        public void showPoints() {

            MainActivity.getInstance().getScoreRound().setText(Integer.toString(pointsAndCombo));

            //для разработчика
            Log.d("Бросок", "[" + getCube1() + "]" +
                    "[" + getCube2() + "]" +
                    "[" + getCube3() + "]" +
                    "  Points:" + getPoints() +
                    "  Combo + " + getComboPoints() +
                    "  All Points:" + getPointsAndCombo());

        }
    }
//    public void playSoundDices (MediaPlayer sound){
//        sound.start();
//    }


