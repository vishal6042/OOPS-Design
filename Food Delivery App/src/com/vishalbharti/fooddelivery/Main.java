package com.vishalbharti.fooddelivery;

import com.vishalbharti.fooddelivery.impl.FoodDeliveryListener;
import com.vishalbharti.fooddelivery.impl.FoodDeliveryManager;
import com.vishalbharti.fooddelivery.impl.FoodDeliveryManagerImpl;
import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.Restaurant;
import com.vishalbharti.fooddelivery.impl.model.menu.Menu;
import com.vishalbharti.fooddelivery.impl.pay.CreditCardStrategy;
import com.vishalbharti.fooddelivery.impl.pay.PaytmStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static FoodDeliveryManager mFoodDeliveryManager;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        mFoodDeliveryManager = FoodDeliveryManagerImpl.getInstance();
        mFoodDeliveryManager.setFoodDeliveryListener(mFoodDeliveryListener);

        List<Restaurant> restaurantList = mFoodDeliveryManager.searchRestaurants(City.BANGALORE);
        System.out.println("********************");
        System.out.println(restaurantList);
        System.out.println("********************");
        mFoodDeliveryManager.selectRestaurant(restaurantList.get(0));
        List<Menu> menuList = mFoodDeliveryManager.getMenuFromTheRestaurant();

        System.out.println(menuList);
        System.out.println("********************");
        List<Item> itemList = new ArrayList<>();
        for (Menu menu : menuList) {
            itemList.addAll(menu.getItemList());
        }
        System.out.println("********************");
        System.out.println(itemList);
        mFoodDeliveryManager.addItemFromMenu(itemList);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mFoodDeliveryManager.orderFood();
    }

    private static FoodDeliveryListener mFoodDeliveryListener = new FoodDeliveryListener() {
        @Override
        public void onMessageReceived(String message) {
            switch (message) {
                case "Pay Money":
                    int mode = scanner.nextInt();
                    if (mode == 1) {
                        mFoodDeliveryManager.payAmount(new CreditCardStrategy("2", "#", "4", "5"));
                    } else {
                        mFoodDeliveryManager.payAmount(new PaytmStrategy("23", "32"));
                    }
                    break;
                default:
                    System.out.println(message);
            }
        }
    };
}
