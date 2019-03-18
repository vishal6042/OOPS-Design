package com.vishalbharti.datebuilder;

public class Main {

    public static void main(String[] args) {
        String date = new SimpleDateBuilder()
                .addDate("18")
                .addMonth("12")
                .addYear("2019")
                .addSeparator("/")
                .build();
        System.out.println(date);

        //will throw exception
        date = new SimpleDateBuilder()
                .addMonth("12")
                .addDate("18")
                .addYear("2019")
                .addSeparator("/")
                .build();

        System.out.println(date);
    }
}
