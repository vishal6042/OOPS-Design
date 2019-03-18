package com.vishalbharti.datebuilder;

public interface DateBuilder {

    DateBuilder addDate(String date);

    DateBuilder addMonth(String month);

    DateBuilder addYear(String year);

    DateBuilder addSeparator(String separator);

    String build();
}
