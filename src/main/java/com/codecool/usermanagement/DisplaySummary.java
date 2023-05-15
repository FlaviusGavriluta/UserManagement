package com.codecool.usermanagement;

import static java.lang.System.out;

public class DisplaySummary {
    public void displaySummary(String summary, int index) {
        out.println((index + 1) + ":" + summary);
    }

    public void displaySummary(String[] summaries) {
        for (int i = 0; i < summaries.length; i++)
            out.println((i + 1) + ":" + summaries[i]);
    }
}
