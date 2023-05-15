package com.codecool.usermanagement;

import java.util.Scanner;

import static java.lang.System.out;

public class Input {
    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    public int parseInput(String input) {
        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                out.println("Invalid input! Please enter a valid number.");
                input = getInput();
            }
        }
    }

}
