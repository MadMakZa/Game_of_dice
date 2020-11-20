package com.example.gameofdice;

public class Player extends RollOfTheDice {

    public int getPlayerPoints() {
        return playerPoints;
    }

    public void setPlayerPoints(int playerPoints) {
        this.playerPoints = playerPoints;
    }

    private int playerPoints;

    @Override
    public void createDices() {
        super.createDices();
    }

    @Override
    public void sumOfPoints() {
        super.sumOfPoints();
        playerPoints = getSumPoints();
    }

    @Override
    public void showPoints() {
        super.showPoints();
    }
}
