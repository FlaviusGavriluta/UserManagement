package com.codecool.usermanagement;

public class Summarize {
    public String summarize(String name, int age, Gender gender) {
        String result = name + "[" + gender + "]" + "-" + age + " years old";
        return result;
    }

    public String[] summarize(String[] names, int[] ages, Gender[] genders) {
        String[] summaries = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            summaries[i] = summarize(names[i], ages[i], genders[i]);
        }
        return summaries;
    }
}
