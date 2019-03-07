package com.diceroller;

import java.util.Random;

import static com.diceroller.Utilities.*;

class Main {

    private static final String HOW_MANY_SIDES = "How Many Sides does the Dice Have?";
    private static final String HOW_MANY_DICE = "How many dice do you wish to roll?";
    private static Random RANDOM = new Random();

    public static void main(String[] args) {
        printWelcomeMessage();
        int numberOfDiceSides = askUserGetIntegerResponse(HOW_MANY_SIDES);
        int numberOfDice = askUserGetIntegerResponse(HOW_MANY_DICE);
        printMultipleDiceValues(numberOfDice,numberOfDiceSides);
    }

    private static void printWelcomeMessage() {
        print("Welcome To Dice Roller");
        print("######################");
        print("");
    }

    private static int askUserGetIntegerResponse(String instruction) {
        print(instruction);
        return getValidPositiveInteger(getScannerInput(), instruction);
    }

    private static void printMultipleDiceValues(int numberOfDice, int numberOfDiceSides) {
        int i = 0;
        while (i < numberOfDice) {
            print(String.format("Dice %d has a value of %d", ++i, getRandomDiceValue(numberOfDiceSides)));
        }
    }

    private static int getRandomDiceValue(int numberOfDiceSides) {
        return RANDOM.nextInt(numberOfDiceSides) + 1;
    }

}