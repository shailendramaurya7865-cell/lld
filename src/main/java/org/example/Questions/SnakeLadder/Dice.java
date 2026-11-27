package org.example.Questions.SnakeLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private final int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }


    public int rollDice() {
        int totalSum = 0;
        int diceUsed = 0;
        while (diceUsed<diceCount) {
            int diceNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println("diceNumber = " + diceNumber);
            totalSum = totalSum + diceNumber; ;
            diceUsed++;
        }
        System.out.println("Dice.rollDice = " + totalSum);
        return totalSum;
    }
}
