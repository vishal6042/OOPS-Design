package com.vishalbharti.datebuilder;

public class SimpleYearBuilder implements DateBuilder {
    private StringBuilder mDate;

    public SimpleYearBuilder(StringBuilder date) {
        this.mDate = date;
    }

    @Override
    public DateBuilder addDate(String date) {
        throw new UnsupportedOperationException("Expected year input. call addYear()");
    }

    @Override
    public DateBuilder addMonth(String month) {
        throw new UnsupportedOperationException("Expected year input. call addYear()");
    }

    @Override
    public DateBuilder addYear(String year) {
        mDate.append(year);
        return new SimpleSeparatorBuilder(mDate);
    }

    @Override
    public DateBuilder addSeparator(String separator) {
        throw new UnsupportedOperationException("Expected year input. call addYear()");
    }

    @Override
    public String build() {
        throw new UnsupportedOperationException("Nothing to build as of now. call addYear()");
    }
}
