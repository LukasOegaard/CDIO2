package game.model;

public class Account {

    private int balance;

    public Account() {
        this.balance = 1000;
    }

    public int getBalance() {
        return this.balance;
    }

    public void increaseBalance(int balanceIncrease) {
        this.balance += balanceIncrease;
    }

    public void decreaseBalance(int balanceDecrease) {
        this.balance -= balanceDecrease;
        if (this.balance < 0) {
            this.balance = 0;
        }
    }
}
