package com.vishalbharti.step.datebuilder;

public class SimpleDateBuilder implements MonthBuilder, DateBuilder, YearBuilder, SeparatorBuilder, CompleteBuilder {
    private StringBuilder mDate = new StringBuilder();

    public DateBuilder builder() {
        return this;
    }

    @Override
    public String build() {
        return mDate.toString();
    }

    @Override
    public MonthBuilder addDate(String date) {
        mDate.append(date);
        return this;
    }

    @Override
    public YearBuilder addMonth(String month) {
        mDate.append(month);
        return this;
    }

    @Override
    public CompleteBuilder addSeparator(String separator) {
        mDate.insert(2, separator);
        mDate.insert(5, separator);
        return this;
    }

    @Override
    public SeparatorBuilder addYear(String year) {
        mDate.append(year);
        return this;
    }
}
