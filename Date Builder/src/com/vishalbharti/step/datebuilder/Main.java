package com.vishalbharti.step.datebuilder;

public class Main {
    public static void main(String[] args) {
        String date = new SimpleDateBuilder()
                .addDate("18")
                .addMonth("12")
                .addYear("2019")
                .addSeparator("/")
                .build();

        System.out.println(date);

        // different sequence wont work

    }
}
