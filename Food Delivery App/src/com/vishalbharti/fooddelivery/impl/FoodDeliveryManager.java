package com.vishalbharti.fooddelivery.impl;

import com.vishalbharti.fooddelivery.City;
import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.menu.Menu;
import com.vishalbharti.fooddelivery.impl.model.Restaurant;
import com.vishalbharti.fooddelivery.impl.pay.PaymentStrategy;

import java.util.List;

public interface FoodDeliveryManager {

    List<Restaurant> searchRestaurants(City city);

    boolean selectRestaurant(Restaurant restaurant);

    List<Menu> getMenuFromTheRestaurant();

    boolean addItemFromMenu(List<Item> itemList);

    void orderFood();

    void cancelOrder();

    void payAmount(PaymentStrategy strategy);

    void setFoodDeliveryListener(FoodDeliveryListener listener);

}
