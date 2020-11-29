package com.example.gameofdice;

import android.util.Log;

public class StartGame {
    /***Этапы игры ***/

    private int playerPoints;
    private int computerPoints;

    //Создать player
    public void CreatePlayer(){
        Player player1 = new Player();
        player1.createDices();
        player1.sumOfPoints();
        player1.showPoints();
        playerPoints = player1.getSumPoints();
    }
    //Создать computer
    public void CreateComputer(){
        Computer comp1 = new Computer();
        comp1.createDices();
        comp1.sumOfPoints();
        comp1.showPoints();
        computerPoints = comp1.getSumPoints();
    }
    //Сравнить результаты бросков
    public void CompareResults(){
        if(playerPoints > computerPoints){
            Log.d("Если победил игрок", "Player is winner!");
        }
        if(playerPoints < computerPoints){
            Log.d("Если победил комп", "Computer is winner!");
        }
        if(playerPoints == computerPoints){
            Log.d("Ничья", "Draw!");
        }
    }
    //Вывод победителя
    //Завершение и обновление

}
