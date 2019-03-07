package com.diceroller;

import java.util.Scanner;

class Utilities {
    private static Scanner scanner = new Scanner(System.in);

    static void print(Object message) {
        System.out.println(message);
    }

    static String getScannerInput() {
       return scanner.nextLine();
    }

    static int getValidPositiveInteger(String message, String instruction) {
        while (!message.matches("\\d+")) {
            print("Invalid Response");
            print(instruction);
            message = getScannerInput();
        }
        return Integer.parseInt(message);
    }
}
