package com.diceroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.diceroller.Utilities.*;

class Main {

    private static final String IS_CUSTOM_DICE = "Is your dice a Standard or Custom Dice (S/C)?";
    private static final String HOW_MANY_SIDES = "How Many Sides does the Dice Have?";
    private static final String HOW_MANY_DICE = "How many dice do you wish to roll?";
    private static final String GET_FACE_VALUE = "What is the value of this face?";
    private static Random RANDOM = new Random();

    public static void main(String[] args) {
        printWelcomeMessage();

        if (isDiceCustom(IS_CUSTOM_DICE)) {
            printCustomDice(getCustomFacesFromUser());
        } else {
            printDice();
        }
    }

    private static void printWelcomeMessage() {
        print("Welcome To Dice Roller");
        print("######################");
        print("");
        print(IS_CUSTOM_DICE);
    }

    private static void printDice() {
        int numberOfDiceSides = askUserGetIntegerResponse(HOW_MANY_SIDES);
        List<Integer> customFaces = new ArrayList<>();
        for (int i = 1; i <= numberOfDiceSides; i++) {
            customFaces.add(i);
        }
        printCustomDice(customFaces);
    }

    private static void printCustomDice(List<Integer> faces) {
        int numberOfDice = askUserGetIntegerResponse(HOW_MANY_DICE);
        int sumOfDice = calculateSumOfDice(numberOfDice, faces);
        print("The Sum of all your dice is " + sumOfDice);
    }

    private static int calculateSumOfDice(int numberOfDice, List<Integer> customFaces) {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += getRollValue(customFaces);
        }
        return sum;
    }

    private static int getRollValue(List<Integer> customFaces) {
        return customFaces.get(RANDOM.nextInt(customFaces.size()));
    }

    private static List<Integer> getCustomFacesFromUser() {
        int numberofDiceSides = askUserGetIntegerResponse(HOW_MANY_SIDES);
        List<Integer> customFaces = new ArrayList<>();
        for (int i = 0; i < numberofDiceSides; i++) {
            customFaces.add(askUserGetIntegerResponse(GET_FACE_VALUE));
        }
        return customFaces;
    }

    private static int askUserGetIntegerResponse(String instruction) {
        print(instruction);
        return getValidPositiveInteger(instruction);
    }

}