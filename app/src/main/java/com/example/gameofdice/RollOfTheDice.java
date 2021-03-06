package com.example.gameofdice;

/* *
 * Бросок костей
 * */

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
//    ObjectAnimator animationX, animationY, rotateAnimation;


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
           cube3-2 == cube2 && cube3-1 == cube1 ||
           cube1-1 == cube2 && cube1-2 == cube3 ||
           cube1-2 == cube2 && cube1-1 == cube3 ){
            pointsAndCombo +=3;
            comboPoints = 3;
        }
        //сумма выпавших значений кубиков + бонусы, если есть
        pointsAndCombo += getCube1()+getCube2()+getCube3();
    }

    //показать картинки красных кубиков на экране
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
        //показать черные кубики
        public void showSideBlackDices() {

            switch (cube1) {
                case 1:
                    MainActivity.getInstance().getCubeImageView4().setImageResource(R.drawable.black_dice1);
                    break;
                case 2:
                    MainActivity.getInstance().getCubeImageView4().setImageResource(R.drawable.black_dice2);
                    break;
                case 3:
                    MainActivity.getInstance().getCubeImageView4().setImageResource(R.drawable.black_dice3);
                    break;
                case 4:
                    MainActivity.getInstance().getCubeImageView4().setImageResource(R.drawable.black_dice4);
                    break;
                case 5:
                    MainActivity.getInstance().getCubeImageView4().setImageResource(R.drawable.black_dice5);
                    break;
                case 6:
                    MainActivity.getInstance().getCubeImageView4().setImageResource(R.drawable.black_dice6);
                    break;
            }
            switch (cube2) {
                case 1:
                    MainActivity.getInstance().getCubeImageView5().setImageResource(R.drawable.black_dice1);
                    break;
                case 2:
                    MainActivity.getInstance().getCubeImageView5().setImageResource(R.drawable.black_dice2);
                    break;
                case 3:
                    MainActivity.getInstance().getCubeImageView5().setImageResource(R.drawable.black_dice3);
                    break;
                case 4:
                    MainActivity.getInstance().getCubeImageView5().setImageResource(R.drawable.black_dice4);
                    break;
                case 5:
                    MainActivity.getInstance().getCubeImageView5().setImageResource(R.drawable.black_dice5);
                    break;
                case 6:
                    MainActivity.getInstance().getCubeImageView5().setImageResource(R.drawable.black_dice6);
                    break;
            }
            switch (cube3) {
                case 1:
                    MainActivity.getInstance().getCubeImageView6().setImageResource(R.drawable.black_dice1);
                    break;
                case 2:
                    MainActivity.getInstance().getCubeImageView6().setImageResource(R.drawable.black_dice2);
                    break;
                case 3:
                    MainActivity.getInstance().getCubeImageView6().setImageResource(R.drawable.black_dice3);
                    break;
                case 4:
                    MainActivity.getInstance().getCubeImageView6().setImageResource(R.drawable.black_dice4);
                    break;
                case 5:
                    MainActivity.getInstance().getCubeImageView6().setImageResource(R.drawable.black_dice5);
                    break;
                case 6:
                    MainActivity.getInstance().getCubeImageView6().setImageResource(R.drawable.black_dice6);
                    break;
            }

    }
    //анимация красных кубиков
    public void animationDices(){
        AnimationCube animCube1 = new AnimationCube();
        AnimationCube animCube2 = new AnimationCube();
        AnimationCube animCube3 = new AnimationCube();
        animCube1.animationFirstObject();
        animCube2.animationTwoObject();
        animCube3.animationThreeObject();

    }
    //анимация черных кубиков
    public void animationBlackDices(){
        AnimationCube animCube4 = new AnimationCube();
        AnimationCube animCube5 = new AnimationCube();
        AnimationCube animCube6 = new AnimationCube();
        animCube4.animationBlackFirstObject();
        animCube5.animationBlackTwoObject();
        animCube6.animationBlackThreeObject();

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
    public void showPlayerPoints() {

        MainActivity.getInstance().getScorePlayer().setText(Integer.toString(pointsAndCombo));
    }
    public void showComputerPoints() {

        MainActivity.getInstance().getScoreComp().setText(Integer.toString(pointsAndCombo));
    }
}



