package com.vishalbharti.fooddelivery.impl.model.menu;

import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.foodType.Type;
import com.vishalbharti.fooddelivery.impl.model.foodType.TypeFood;

import java.util.List;

public class Appetizer extends Menu {

    public Appetizer(Type typeOfFood) {
        super(typeOfFood);
    }

    @Override
    public void typeOfFood(TypeFood typeFood) {
        this.mTypeOfFood = typeFood;
    }

    @Override
    public void addItems(List<Item> itemList) {
        this.itemList = itemList;
    }

}
