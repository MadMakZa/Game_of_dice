package com.example.gameofdice;

/* *
 * Бросок костей
 * */

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
    private int sumPoints;

    public int getCube1() {
        return cube1;
    }

    public int getCube2() {
        return cube2;
    }

    public int getCube3() {
        return cube3;
    }

    public int getSumPoints() {
        return sumPoints;
    }

    public void setSumPoints(int sumPoints) {
        this.sumPoints = sumPoints;
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
        //бонусы за 2 одинаковых кубика
        if(cube1==cube2||cube2==cube3||cube1==cube3){
            sumPoints += 2;
        //бонусы за 3 одинкаовых кубика
        }
        if(cube1==cube2 && cube1==cube3){
            sumPoints +=1;
        }
        //бонусы за street
        if(cube1+1 == cube2 && cube1+2 == cube3 ||
           cube2+1 == cube1 && cube2+2 == cube3 ||
           cube3+1 == cube1 && cube3+2 == cube2 ||
           cube2-1 == cube1+1 && cube2-1 == cube3 ||
           cube3-1 == cube2 && cube3-2 == cube1 ||
           cube1-1 == cube2 && cube1-2 == cube3){
            sumPoints +=3;
        }
        //сумма выпавших значений кубиков + бонусы, если есть
        sumPoints += getCube1()+getCube2()+getCube3();
    }

    //вывод результата на экран
    public void showPoints(){
        if(cube1 == 1){
            MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube1);
        }
        if(cube1 == 2){
            MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube2);
        }
        if(cube1 == 3){
            MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube3);
        }
        if(cube1 == 4){
            MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube4);
        }
        if(cube1 == 5){
            MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube5);
        }
        if(cube1 == 6){
            MainActivity.getInstance().getCubeImageView1().setImageResource(R.drawable.cube6);
        }
        if(cube2 == 1){
            MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube1);
        }
        if(cube2 == 2){
            MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube2);
        }
        if(cube2 == 3){
            MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube3);
        }
        if(cube2 == 4){
            MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube4);
        }
        if(cube2 == 5){
            MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube5);
        }
        if(cube2 == 6){
            MainActivity.getInstance().getCubeImageView2().setImageResource(R.drawable.cube6);
        }
        if(cube3 == 1){
            MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube1);
        }
        if(cube3 == 2){
            MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube2);
        }
        if(cube3 == 3){
            MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube3);
        }
        if(cube3 == 4){
            MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube4);
        }
        if(cube3 == 5){
            MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube5);
        }
        if(cube3 == 6){
            MainActivity.getInstance().getCubeImageView3().setImageResource(R.drawable.cube6);
        }
        Log.d("Бросок", "[" + getCube1()+ "]" +
                "[" + getCube2() +"]" +
                "[" + getCube3() +"]" +
                "Points: " + getSumPoints());


    }

}
