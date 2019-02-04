package com.vishalbharti.fooddelivery;

public enum City {
    BANGALORE("BNG"),
    HYDERABAD("HYD");

    private String name;

    City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
