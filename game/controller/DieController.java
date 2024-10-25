package game.controller;

import model.Die;

puplic class DieController(){

    Die die1; 
    Die die2;

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