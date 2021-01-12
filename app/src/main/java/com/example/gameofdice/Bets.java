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
//    public static final Bets INSTANCE = new Bets();
//    private static int playerBet = 0;
//    private static int lastBet = 0;
//
//    public static int getPlayerBet() {
//        return playerBet;
//    }

    static LinkedList<Integer> betsList = new LinkedList<>();

    public static int sumBetsInList(){
        int sumBets = 0;
        for (Integer i : betsList){
            sumBets += i;
        }
        return sumBets;
    }

    //убрать последнюю фишку (доработать метод в дальнейшем использовать LinkedList)
    public static void removeBet(){
//        playerBet -= lastBet;
//        lastBet = playerBet;
//        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
//    //удвоить ставку
    public static void doubleTheRate(){
//        int doubleBet = sumBetsInList() * 2;
//        MainActivity.getInstance().getBet().setText(Integer.toString(doubleBet));
    }
    //ставка +25
    public static void putTwentyFive(){
        betsList.add(25);
        MainActivity.getInstance().getBet().setText(Integer.toString(betsList.get(0)));
    }
    //ставка +50
    public static void putFifty(){
        betsList.add(50);
        MainActivity.getInstance().getBet().setText(Integer.toString(betsList.get(sumBetsInList())));
    }
    //ставка +100
    public static void putOneHundred(){
        betsList.add(100);
        MainActivity.getInstance().getBet().setText(Integer.toString(betsList.get(sumBetsInList())));
    }
    //ставка +500
    public static void putFiveHundred(){
        betsList.add(500);
        MainActivity.getInstance().getBet().setText(Integer.toString(betsList.get(sumBetsInList())));
    }

}
