package com.example.gameofdice;

public class Computer extends RollOfTheDice {

    public int getComputerPoints() {
        return computerPoints;
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }

    private int computerPoints;

    @Override
    public void createDices() {
        super.createDices();
    }

    @Override
    public void sumOfPoints() {
        super.sumOfPoints();
        computerPoints = getSumPoints();
    }

    @Override
    public void showPoints() {
        super.showPoints();
    }
}
