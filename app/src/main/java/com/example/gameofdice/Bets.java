package com.example.gameofdice;


import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.LinkedList;

/**
 * Делайте ваши ставки
 */

public class Bets {
    //синглтон
    public static final Bets INSTANCE = new Bets();
    private static int playerBet = 0;

    public static int getPlayerBet() {
        return playerBet;
    }

    static LinkedList<Integer> betsList = new LinkedList<>();

    //сумма всех ставок в листе
    public static void sumBetsInList(){
        int sumBets = 0;
        for (Integer i : betsList){
            sumBets += i;
        }
        playerBet = sumBets;
    }

    //убрать последнюю фишку (доработать метод в дальнейшем использовать LinkedList)
    public static void removeBet(){
        if(!betsList.isEmpty()) {
            betsList.removeLast();
            sumBetsInList();
            MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
        } else {
            //диактивировать кнопку назад
        }
    }
    //удвоить ставку
    public static void doubleTheRate(){
        if(!betsList.isEmpty()) {
            betsList.add(playerBet);
            sumBetsInList();
            MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
        }else {
            //если 0, то диактивировать кнопку
        }
    }
    //ставка +5
    public static void putFive(){
        betsList.add(5);
        sumBetsInList();
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +25
    public static void putTwentyFive(){
        betsList.add(25);
        sumBetsInList();
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +50
    public static void putFifty(){
        betsList.add(50);
        sumBetsInList();
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +100
    public static void putOneHundred(){
        betsList.add(100);
        sumBetsInList();
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +500
    public static void putFiveHundred(){
        betsList.add(500);
        sumBetsInList();
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }

}
