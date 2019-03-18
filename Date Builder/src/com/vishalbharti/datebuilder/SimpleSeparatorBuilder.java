package com.vishalbharti.datebuilder;

public class SimpleSeparatorBuilder implements DateBuilder {
    private StringBuilder mDate;

    public SimpleSeparatorBuilder(StringBuilder date) {
        this.mDate = date;
    }

    @Override
    public DateBuilder addDate(String date) {
        throw new UnsupportedOperationException("Expected separator input. call addSeparator()");
    }

    @Override
    public DateBuilder addMonth(String month) {
        throw new UnsupportedOperationException("Expected separator input. call addSeparator()");
    }

    @Override
    public DateBuilder addYear(String year) {
        throw new UnsupportedOperationException("Expected separator input. call addSeparator()");
    }

    @Override
    public DateBuilder addSeparator(String separator) {
        mDate.insert(2, separator);
        mDate.insert(5, separator);
        return new CompleteDateBuilder(mDate);
    }

    @Override
    public String build() {
        throw new UnsupportedOperationException("Nothing to build as of now. call addSeparator()");
    }
}
