package com.diceroller;

import java.util.Random;

import static com.diceroller.Utilities.*;

class Main {

    private static final String HOW_MANY_DICE = "How many dice do you wish to roll?";
    private static Random RANDOM = new Random();

    public static void main(String[] args) {
        initialiseScanner();
        printWelcomeMessage();
        int numberOfDice = getValidPositiveInteger(getScannerInput(), "Invalid Response", HOW_MANY_DICE);
        printMultipleDiceValues(numberOfDice);
    }

    private static void printWelcomeMessage() {
        print("Welcome To Dice Roller");
        print("######################");
        print("");
        print(HOW_MANY_DICE);
    }

    private static void printMultipleDiceValues(int numberOfDice) {
        int i = 0;
        while (i < numberOfDice) {
            print(String.format("Dice %d has a value of %d", ++i, getRandomDiceValue()));
        }
    }

    private static int getRandomDiceValue() {
        return RANDOM.nextInt(6) + 1;
    }

}