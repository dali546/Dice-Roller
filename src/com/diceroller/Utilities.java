package com.diceroller;

import java.util.Scanner;

class Utilities {
    private static Scanner scanner;

    static void print(Object message) {
        System.out.println(message);
    }

    static void initialiseScanner() {
        scanner = new Scanner(System.in);
    }

    static String getScannerInput() {
       return scanner.nextLine();
    }

    static int getValidPositiveInteger(String message, String errMessage, String instruction) {
        while (!message.matches("\\d+")) {
            print(errMessage);
            print(instruction);
            message = getScannerInput();
        }
        return Integer.parseInt(message);
    }
}
