package com.vishalbharti.stackoverflow.domain;

public enum AccountStatus {
    ACTIVE("active"),
    CLOSED("closed"),
    CANCELLED("cancelled"),
    BLOCKED("blocked"),
    BLACKLISTED("blacklisted");

    private String name;

    AccountStatus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
