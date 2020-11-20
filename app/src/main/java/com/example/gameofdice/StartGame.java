package com.example.gameofdice;

public class StartGame extends Thread {
    /***Этапы игры ***/

    //Создать player
    public void CreatePlayers(){
        Player player1 = new Player();
        player1.createDices();
        player1.sumOfPoints();
        player1.showPoints();
    }
    //Создать computer
    public void CreateComputer(){
        Computer comp1 = new Computer();
        comp1.createDices();
        comp1.sumOfPoints();
        comp1.showPoints();
    }
    //Сравнить результаты бросков

    //Вывод победителя
    //Завершение и обновление

}
