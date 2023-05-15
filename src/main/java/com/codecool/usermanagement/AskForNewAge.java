package com.codecool.usermanagement;

import static java.lang.System.out;

public class AskForNewAge {
    public int askForNewAge() {
        Input parseInput = new Input();
        Input getInput = new Input();

        out.println("Please enter a new age:");

        int newAge = parseInput.parseInput(getInput.getInput());
        while (newAge <= 0) {
            out.println("Invalid age! Please enter a positive number.");
            newAge = parseInput.parseInput(getInput.getInput());
        }
        return newAge;
    }
}
