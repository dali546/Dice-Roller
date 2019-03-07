package com.diceroller;

import java.util.Scanner;

class Utilities {
    private static Scanner scanner = new Scanner(System.in);

    static void print(Object message) {
        System.out.println(message);
    }

    private static String getScannerInput() {
        return scanner.nextLine();
    }

    static int getValidPositiveInteger(String instruction) {
        String message = getScannerInput();
        while (!message.matches("\\d+")) {
            print("Invalid Response");
            print(instruction);
            message = getScannerInput();
        }
        return Integer.parseInt(message);
    }

    static boolean isDiceCustom(String isCustomDice) {
        String message = getScannerInput();
        while (!message.matches("^(?i)[CS]")) {
            print("Invalid Response");
            print(isCustomDice);
            message = getScannerInput();
        }
        return message.equals("C");
    }
}
