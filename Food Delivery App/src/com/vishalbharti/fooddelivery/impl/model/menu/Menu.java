package com.vishalbharti.fooddelivery.impl.model.menu;

import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.foodType.Type;
import com.vishalbharti.fooddelivery.impl.model.foodType.TypeFood;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

    protected TypeFood mTypeOfFood;
    protected List<Item> itemList;
    protected Type mFoodType;

    public Menu(Type typeOfFood) {
        this.mFoodType = typeOfFood;
        itemList = new ArrayList<>();
    }

    abstract public void typeOfFood(TypeFood typeFood);

    abstract public void addItems(List<Item> itemList);

    public List<Item> getItemList() {
        return itemList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mTypeOfFood=" + mTypeOfFood +
                ", mFoodType=" + mFoodType +
                ", mItemList=" + itemList +
                '}';
    }
}
