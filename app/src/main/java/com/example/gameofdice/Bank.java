package com.example.gameofdice;

/**
 * Счет игрока
 */
public class Bank {

    //депозит игрока
    private static int deposit = 1000;

    public static int getDeposit() {
        return deposit;
    }
    public static void setDeposit(int deposit) {
        Bank.deposit = deposit;
    }
    //показать депозит
    public static void changeDeposit(){
        MainActivity.getInstance().getBankDepo().setText(Integer.toString(deposit));
    }





}
