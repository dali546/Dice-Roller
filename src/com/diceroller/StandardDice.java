package com.diceroller;

import java.util.Random;

public class StandardDice implements Dice {

    private final int numberOfSides;

    StandardDice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public int roll() {
        return new Random().nextInt(numberOfSides) + 1;
    }

}
