package com.diceroller;

import java.util.List;
import java.util.Random;

public class CustomDice implements Dice {

    private List<Integer> customFaces;

    CustomDice(List<Integer> customFaces) {
        this.customFaces = customFaces;
    }

    @Override
    public int roll() {
        return customFaces.get(new Random().nextInt(customFaces.size()));
    }


}
