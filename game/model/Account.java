package game.model;

public class Account {

    private int balance;

    public Account() {
        this.balance = 1000;
    }

    public int getBalance() {
        return this.balance;
    }

    public void applyConsequence(int scoreConsequence) {
        this.balance += scoreConsequence;
        if (this.balance < 0) {
            this.balance = 0;
        }
    }
}
