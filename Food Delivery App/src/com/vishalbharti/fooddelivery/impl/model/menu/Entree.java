package com.vishalbharti.fooddelivery.impl.model.menu;

import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.foodType.Type;
import com.vishalbharti.fooddelivery.impl.model.foodType.TypeFood;

import java.util.List;

public class Entree extends Menu {
    public Entree(Type typeOfFood) {
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
