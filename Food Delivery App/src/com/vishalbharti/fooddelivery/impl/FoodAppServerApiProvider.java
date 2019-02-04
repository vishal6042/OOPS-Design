package com.vishalbharti.fooddelivery.impl;

import com.vishalbharti.fooddelivery.City;
import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.Restaurant;
import com.vishalbharti.fooddelivery.impl.model.foodType.NonVegType;
import com.vishalbharti.fooddelivery.impl.model.foodType.TypeFood;
import com.vishalbharti.fooddelivery.impl.model.foodType.VegType;
import com.vishalbharti.fooddelivery.impl.model.menu.Appetizer;
import com.vishalbharti.fooddelivery.impl.model.menu.Entree;
import com.vishalbharti.fooddelivery.impl.model.menu.Menu;

import java.util.*;

public class FoodAppServerApiProvider {
    private static Map<String, List<Restaurant>> listOfRestaurants;

    static {
        listOfRestaurants = new HashMap<>();
        listOfRestaurants.put("BNG", new ArrayList<>(Arrays.asList(
                new Restaurant("Biryani Zone", "Marathahalli", getMenusForBiryani()),
                new Restaurant("Paradize Restaurant", "WhiteField", getMenusForBiryani()),
                new Restaurant("California Burrito", "Doddanekundi", getMenusForBiryani()),
                new Restaurant("Meghna Biryani", "J P Morgan", getMenusForBiryani()))));

        listOfRestaurants.put("HYD", new ArrayList<Restaurant>(Arrays.asList(
                new Restaurant("Hyderabad Biryani Zone", "xyz", getMenusForBiryani()),
                new Restaurant("Bawarchi restaurant", "Secundrabad", getMenusForBiryani()))));

    }

    private static List<Menu> getMenusForBiryani() {
        List<Menu> menuList = new ArrayList<>();
        Menu vegApetizer = new Appetizer(new VegType());
        vegApetizer.typeOfFood(TypeFood.VEG);
        vegApetizer.addItems(new ArrayList<>(Arrays.asList(
                new Item("Gobi Starter", 250),
                new Item("Paneer Starter", 280)
        )));
        menuList.add(vegApetizer);

        Menu vegEntree = new Entree(new VegType());
        vegEntree.typeOfFood(TypeFood.VEG);
        vegEntree.addItems(new ArrayList<>(Arrays.asList(
                new Item("Gobi Masala", 350),
                new Item("Paneer Masala", 380)
        )));
        menuList.add(vegEntree);

        Menu nonVegApetizer = new Appetizer(new NonVegType());
        nonVegApetizer.typeOfFood(TypeFood.NON_VEG);
        nonVegApetizer.addItems(new ArrayList<>(Arrays.asList(
                new Item("Chicken Garlic", 380),
                new Item("Mutton Garlic", 400)
        )));
        menuList.add(nonVegApetizer);

        Menu nonVegEntree = new Entree(new NonVegType());
        nonVegEntree.typeOfFood(TypeFood.NON_VEG);
        nonVegEntree.addItems(new ArrayList<>(Arrays.asList(
                new Item("Chicken Masala", 450),
                new Item("Mutton Masala", 480)
        )));
        menuList.add(nonVegEntree);

        return menuList;

    }

    private static FoodAppServerApiProvider mInstance;

    public static FoodAppServerApiProvider getInstance() {
        if (mInstance == null) {
            mInstance = new FoodAppServerApiProvider();
        }
        return mInstance;

    }

    public boolean isEveryThingOk(Restaurant restaurant) {
        return true;
    }

    public List<Restaurant> getAllRestaurants(City city) {
        return listOfRestaurants.get(city.getName());
    }
}
