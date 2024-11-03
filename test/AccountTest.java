package test;

import game.model.Account;

public class AccountTest {
    // test that account balance can never be negative

    public static void main(String[] args) {
        Account account = new Account();
        account.applyConsequence(1001); // default balance is 1000
        if (account.getBalance() < 0) {
            System.out.println("test failed");
        } else {
            System.out.println("test passed");
        }
    }

}
