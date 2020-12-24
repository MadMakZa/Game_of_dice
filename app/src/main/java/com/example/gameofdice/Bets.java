package com.example.gameofdice;


import android.app.Dialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Делайте ваши ставки
 */

public final class Bets {

    private int playerBet = 0;


    //ставки
    public void putTwentyFive(){
        playerBet+=25;
        MainActivity.getInstance().getBet().setText(Integer.toString(playerBet));
    }

}
