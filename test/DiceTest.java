package test;

import game.model.Die;

public class DiceTest {
    // test that dice rolls are withint range
    public static void main(String[] args) {
        Die die = new Die();
        final int attempts = 1000;
        for (int i = 0; i < attempts; i++) {
            die.roll();
            if (die.getFaceValue() > 6 || die.getFaceValue() < 1) {
                System.out.println("test failed");
                return;
            }
        }
        System.out.println("test passed");
    }
}
