package com.example.gameofdice;

/**
 * Счет игрока
 */
public class Bank {

    //депозит игрока
    private static int deposit = 10000;

    public static void setDeposit(){
        MainActivity.getInstance().getBankDepo().setText(Integer.toString(deposit));
    }


}
