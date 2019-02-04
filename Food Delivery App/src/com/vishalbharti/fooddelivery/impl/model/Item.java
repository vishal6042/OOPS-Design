package com.vishalbharti.fooddelivery.impl.model;

public class Item {
    private String mName;
    private int mPrice;

    public Item(String name, int price) {
        this.mName = name;
        this.mPrice = price;
    }

    public String getName() {
        return mName;
    }

    public int getPrice() {
        return mPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "mName='" + mName + '\'' +
                ", mPrice=" + mPrice +
                '}';
    }
}