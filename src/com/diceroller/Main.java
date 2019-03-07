package com.diceroller;

import java.util.ArrayList;
import java.util.List;

import static com.diceroller.Utilities.*;

class Main {

    private static final String GET_FACE_VALUE = "What is the value of this face?";
    private static final String IS_CUSTOM_DICE = "Is your dice a Standard or Custom Dice (S/C)?";
    private static final String HOW_MANY_SIDES = "How Many Sides does the Dice Have?";
    private static final String HOW_MANY_ROLLS = "How many dice do you wish to roll?";

    public static void main(String[] args) {
        printWelcomeMessage();
        Dice dice = isDiceCustom(IS_CUSTOM_DICE) ? getCustomDice() : getStandardDice();

        int rollCount = askUserGetIntegerResponse(HOW_MANY_ROLLS);
        int sum = calculateSumOfRolls(dice, rollCount);
        printSum(sum);
    }

    private static void printWelcomeMessage() {
        print("Welcome To Dice Roller");
        print("######################");
        print("");
        print(IS_CUSTOM_DICE);
    }

    private static Dice getStandardDice() {
        int numberOfDiceSides = askUserGetIntegerResponse(HOW_MANY_SIDES);
        return new StandardDice(numberOfDiceSides);
    }

    private static Dice getCustomDice() {
        int numberOfDiceSides = askUserGetIntegerResponse(HOW_MANY_SIDES);

        List<Integer> customFaces = new ArrayList<>();
        for (int i = 0; i < numberOfDiceSides; i++) {
            customFaces.add(askUserGetIntegerResponse(GET_FACE_VALUE));
        }

        return new CustomDice(customFaces);
    }

    private static int calculateSumOfRolls(Dice dice, int rollCount) {
        int sum = 0;

        for (int i = 0; i < rollCount; i++) {
            sum += dice.roll();
        }
        return sum;
    }

    private static void printSum(int sum) {
        print("The Sum of all your dice is " + sum);
    }


}
