package com.vishalbharti.datebuilder;

public class SimpleDateBuilder implements DateBuilder {
    private StringBuilder mDate = new StringBuilder();

    @Override
    public DateBuilder addDate(String date) {
        mDate.append(date);
        return new SimpleMonthBuilder(mDate);
    }

    @Override
    public DateBuilder addMonth(String month) {
        throw new UnsupportedOperationException("Expected day input. call addDate()");
    }

    @Override
    public DateBuilder addYear(String year) {
        throw new UnsupportedOperationException("Expected day input. call addDate()");
    }

    @Override
    public DateBuilder addSeparator(String separator) {
        throw new UnsupportedOperationException("Expected day input. call addDate()");
    }

    @Override
    public String build() {
        throw new UnsupportedOperationException("Nothing to build as of now. call addDate()");
    }
}
