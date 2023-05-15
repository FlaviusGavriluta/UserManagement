package com.codecool.usermanagement;

public class Application {

    public static void main(String[] args) {
        String[] names = {"John", "Alexa", "Kyle"};
        int[] ages = {20, 25, 40};
        Gender[] genders = {Gender.Male, Gender.Female, Gender.Male};

        Summarize summarize = new Summarize();
        AskForIndex askForIndex = new AskForIndex();
        AskForNewAge askForNewAge = new AskForNewAge();
        DisplaySummary displaySummary = new DisplaySummary();

        String[] summaries = summarize.summarize(names, ages, genders);
        displaySummary.displaySummary(summaries);

        ShouldUpdateAge shouldUpdateAge = new ShouldUpdateAge();
        if (shouldUpdateAge.shouldUpdateAge()) {
            int index = askForIndex.askForIndex(names.length);
            int newAge = askForNewAge.askForNewAge();
            ages[index] = newAge;
            summaries[index] = summarize.summarize(names[index], ages[index], genders[index]);
            displaySummary.displaySummary(summaries);
        }
    }
}
