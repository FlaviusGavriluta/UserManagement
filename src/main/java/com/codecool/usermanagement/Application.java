package com.codecool.usermanagement;

import java.util.Scanner;

import static java.lang.System.*;

public class Application {

    public static void main(String[] args) {
        String[] names = {"John", "Alexa", "Kyle"};
        int[] ages = {20, 25, 40};
        Gender[] genders = {Gender.Male, Gender.Female, Gender.Male};


        String[] summaries = summarize(names, ages, genders);
        displaySummary(summaries);

        if (shouldUpdateAge()) {
            int index = askForIndex(names.length);
            int newAge = askForNewAge();
            ages[index] = newAge;
            summaries[index] = summarize(names[index], ages[index], genders[index]);
            displaySummary(summaries);
        }
    }

    // Summary

    private static String summarize(String name, int age, Gender gender) {
        String result = name + "[" + gender + "]" + "-" + age + " years old";
        return result;
    }

    private static String[] summarize(String[] names, int[] ages, Gender[] genders) {
        String[] summaries = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            summaries[i] = summarize(names[i], ages[i], genders[i]);
        }
        return summaries;
    }

    private static void displaySummary(String summary, int index) {
        out.println((index + 1) + ":" + summary);
    }

    private static void displaySummary(String[] summaries) {
        for (int i = 0; i < summaries.length; i++)
            out.println((i + 1) + ":" + summaries[i]);
    }

    // Update age

    private static int updateAge(int index, int[] ages, int newAge) {
        ages[index] = newAge;
        return ages[index];
    }

    // User input

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }

    private static int parseInput(String input) {
        while (true) {
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                out.println("Invalid input! Please enter a valid number.");
                input = getInput();
            }
        }
    }

    private static int askForIndex(int max) {
        out.println("Please enter an user:");
        int index = parseInput(getInput()) - 1;
        while (index < 0 || index >= max) {
            out.println("Invalid index! Please enter a number between 1 and " + max + ".");
            index = parseInput(getInput()) - 1;
        }
        return index;
    }

    private static boolean shouldUpdateAge() {
        out.println("Do you want to update the age of any user? (yes or no)");
        String input = getInput().toLowerCase();
        while (!input.equals("yes") && !input.equals("no")) {
            out.println("Invalid input! Please enter yes or no.");
            input = getInput().toLowerCase();
        }
        return input.equals("yes");
    }

    private static int askForNewAge() {
        out.println("Please enter a new age:");
        int newAge = parseInput(getInput());
        while (newAge <= 0) {
            out.println("Invalid age! Please enter a positive number.");
            newAge = parseInput(getInput());
        }
        return newAge;
    }
}
