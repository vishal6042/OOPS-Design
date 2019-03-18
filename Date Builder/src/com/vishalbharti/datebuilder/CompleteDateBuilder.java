package com.vishalbharti.datebuilder;

public class CompleteDateBuilder implements DateBuilder {
    private StringBuilder mDate;

    public CompleteDateBuilder(StringBuilder date) {
        this.mDate = date;
    }

    @Override
    public DateBuilder addDate(String date) {
        throw new UnsupportedOperationException("call build()");
    }

    @Override
    public DateBuilder addMonth(String month) {
        throw new UnsupportedOperationException("call build()");
    }

    @Override
    public DateBuilder addYear(String year) {
        throw new UnsupportedOperationException("call build()");
    }

    @Override
    public DateBuilder addSeparator(String separator) {
        throw new UnsupportedOperationException("call build()");
    }

    @Override
    public String build() {
        return mDate.toString();
    }
}
