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

    public static int getPlayerBet() {
        return playerBet;
    }

    //ставка +25
    public void putTwentyFive(){
        playerBet+=25;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +50
    public void putFifty(){
        playerBet+=50;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +100
    public void putOneHundred(){
        playerBet+=100;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }
    //ставка +500
    public void putFiveHundred(){
        playerBet+=500;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }

}
