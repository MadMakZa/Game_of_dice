package com.example.gameofdice;

/* *
 * Бросок костей
 * */

import android.util.Log;

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
        sumPoints += getCube1()+getCube2()+getCube3();
    }

    //вывод результата на экран
    public void showPoints(){
        Log.d("Бросок", "[" + getCube1()+ "]" +
                "[" + getCube2() +"]" +
                "[" + getCube3() +"]" +
                "Points: " + getSumPoints());
    }

}
