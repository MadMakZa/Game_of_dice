package com.example.gameofdice;


import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Делайте ваши ставки
 */

public class Bets {
    //синглтон
    public static final Bets INSTANCE = new Bets();
    private static int playerBet = 0;
    private static int lastBet = 0;

    public static int getPlayerBet() {
        return playerBet;
    }
    //убрать последнюю фишку (доработать метод в дальнейшем)
    public static void removeBet(){
        playerBet -= lastBet;
        lastBet = playerBet;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //удвоить ставку
    public static void doubleTheRate(){
        playerBet *= 2;
        lastBet = playerBet;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +25
    public static void putTwentyFive(){
        playerBet += 25;
        lastBet = 25;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +50
    public static void putFifty(){
        playerBet += 50;
        lastBet = 50;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +100
    public static void putOneHundred(){
        playerBet += 100;
        lastBet = 100;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +500
    public static void putFiveHundred(){
        playerBet += 500;
        lastBet = 500;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }

}