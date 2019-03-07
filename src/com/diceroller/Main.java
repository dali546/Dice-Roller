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
        int sumOfDice = calculateSumOfDice(numberOfDice, numberOfDiceSides);
        print("The Sum of all your dice is " + sumOfDice);
    }

    private static int calculateSumOfDice(int numberOfDice, int numberOfDiceSides) {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += getRandomDiceValue(numberOfDiceSides);
        }
        return sum;
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

    private static int getRandomDiceValue(int numberOfDiceSides) {
        return RANDOM.nextInt(numberOfDiceSides) + 1;
    }

}