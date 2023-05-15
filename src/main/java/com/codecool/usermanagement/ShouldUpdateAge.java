package com.codecool.usermanagement;

import static java.lang.System.out;

public class ShouldUpdateAge {
    public boolean shouldUpdateAge() {
        Input getInput = new Input();

        out.println("Do you want to update the age of any user? (yes or no)");

        String input = getInput.getInput().toLowerCase();
        while (!input.equals("yes") && !input.equals("no")) {
            out.println("Invalid input! Please enter yes or no.");
            input = getInput.getInput().toLowerCase();
        }
        return input.equals("yes");
    }
}
