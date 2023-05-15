package com.codecool.usermanagement;

import static java.lang.System.out;

public class AskForIndex {
    public int askForIndex(int max) {
        Input parseInput = new Input();
        Input getInput = new Input();

        out.println("Please enter an user:");

        int index = parseInput.parseInput(getInput.getInput()) - 1;
        while (index < 0 || index >= max) {
            out.println("Invalid index! Please enter a number between 1 and " + max + ".");
            index = parseInput.parseInput(getInput.getInput()) - 1;
        }
        return index;
    }
}
