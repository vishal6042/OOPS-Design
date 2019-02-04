package com.vishalbharti.fooddelivery.impl.model;

import com.vishalbharti.fooddelivery.impl.model.menu.Menu;

import java.util.List;

public class Restaurant {
    private List<Menu> mMenuList;
    private String mName;
    private String mAddress;

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public List<Menu> getMenu() {
        return mMenuList;
    }

    public Restaurant() {
    }

    public Restaurant(String mName, String mAddress, List<Menu> menus) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mMenuList = menus;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                '}';
    }
}
