package controller;

import model.Die;

public class DieController{

    private static DieController instance;

    private Die die1; 
    private Die die2;

    DieController () {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public static DieController getInstance() {
        if (instance == null) {
            instance = new DieController();
        }
        return instance;
    }

    public void rollBoth(){
        die1.roll();
        die2.roll();
    }

    public int getSum(){
        int sum = die1.getFaceValue();
        sum += die2.getFaceValue();

        return sum;
    }

}