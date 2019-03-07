package com.diceroller;

import java.util.Random;

class Main {

    private static Random RANDOM = new Random();

    public static void main(String[] args) {
        System.out.println("Welcome To Dice Roller");
        System.out.println("######################");
        System.out.println();
        System.out.println("Your Random Dice Value is " + getRandomDiceValue());
    }

    private static int getRandomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }

}