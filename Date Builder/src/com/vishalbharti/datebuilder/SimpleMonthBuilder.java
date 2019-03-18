package com.vishalbharti.datebuilder;

public class SimpleMonthBuilder implements DateBuilder {
    private StringBuilder mDate;

    public SimpleMonthBuilder(StringBuilder date) {
        this.mDate = date;
    }

    @Override
    public DateBuilder addDate(String date) {
        throw new UnsupportedOperationException("Expected month input. call addMonth()");
    }

    @Override
    public DateBuilder addMonth(String month) {
        mDate.append(month);
        return new SimpleYearBuilder(mDate);
    }

    @Override
    public DateBuilder addYear(String year) {
        throw new UnsupportedOperationException("Expected month input. call addMonth()");
    }

    @Override
    public DateBuilder addSeparator(String separator) {
        throw new UnsupportedOperationException("Expected month input. call addMonth()");
    }

    @Override
    public String build() {
        throw new UnsupportedOperationException("Nothing to build as of now. call addMonth()");
    }
}
