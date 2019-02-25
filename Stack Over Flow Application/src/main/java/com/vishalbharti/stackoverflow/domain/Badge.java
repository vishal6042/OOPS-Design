package com.vishalbharti.stackoverflow.domain;

public class Badge {
    private BadgeType badgeType;
    private String description;

    @Override
    public String toString() {
        return "Badge{" +
                "badgeType=" + badgeType +
                ", description='" + description + '\'' +
                '}';
    }

    public BadgeType getBadgeType() {
        return badgeType;
    }

    public void setBadgeType(BadgeType badgeType) {
        this.badgeType = badgeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
