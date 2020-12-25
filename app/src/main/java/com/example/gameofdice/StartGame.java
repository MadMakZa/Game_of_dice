package com.example.gameofdice;

import android.util.Log;

/**
 * Этапы игры
 */
public class StartGame {

    private int playerPoints;
    private int computerPoints;

    //Создать player
    public void CreatePlayer(){
        Player player1 = new Player();
        player1.createDices();
        player1.showSideDices();
        player1.animationDices();
        player1.sumOfPoints();
        player1.showPoints();
        player1.showPlayerPoints();
        playerPoints = player1.getPointsAndCombo();
    }
    //Создать computer
    public void CreateComputer(){
        Computer comp = new Computer();
        comp.createDices();
        comp.showSideBlackDices();
        comp.animationBlackDices();
        comp.sumOfPoints();
        comp.showPoints();
        comp.showComputerPoints();
        computerPoints = comp.getPointsAndCombo();
    }
    //Сравнить результаты бросков
    public void CompareResults(){
        if(playerPoints > computerPoints){
            Log.d("Бросок", "Player is winner!");
        }
        if(playerPoints < computerPoints){
            Log.d("Бросок", "Computer is winner!");
        }
        if(playerPoints == computerPoints){
            Log.d("Бросок", "Draw!");
        }
    }
    //Вывод победителя
    //Завершение и обновление

}
