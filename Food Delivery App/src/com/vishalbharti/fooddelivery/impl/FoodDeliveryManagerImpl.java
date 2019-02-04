package com.vishalbharti.fooddelivery.impl;

import com.vishalbharti.fooddelivery.City;
import com.vishalbharti.fooddelivery.impl.model.CartManager;
import com.vishalbharti.fooddelivery.impl.model.Item;
import com.vishalbharti.fooddelivery.impl.model.menu.Menu;
import com.vishalbharti.fooddelivery.impl.model.Restaurant;
import com.vishalbharti.fooddelivery.impl.pay.PayListener;
import com.vishalbharti.fooddelivery.impl.pay.PaymentStrategy;

import java.util.List;

public class FoodDeliveryManagerImpl implements FoodDeliveryManager {
    private static FoodDeliveryManagerImpl mInstance;
    private FoodDeliveryListener mListener;
    private FoodAppServerApiProvider mServerApiProvider;
    private Restaurant mCurrentRestaurant;
    private int mTotalAmount;

    private FoodDeliveryManagerImpl() {
        mTotalAmount = 0;
        mServerApiProvider = FoodAppServerApiProvider.getInstance();
        mCurrentRestaurant = null;
    }

    public synchronized static FoodDeliveryManager getInstance() {
        if (mInstance == null) {
            mInstance = new FoodDeliveryManagerImpl();
        }
        return mInstance;
    }

    public void setFoodDeliveryListener(FoodDeliveryListener listener) {
        this.mListener = listener;
    }

    @Override
    public List<Restaurant> searchRestaurants(City city) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return mServerApiProvider.getAllRestaurants(city);
    }

    @Override
    public boolean selectRestaurant(Restaurant restaurant) {
        if (mServerApiProvider.isEveryThingOk(restaurant)) {
            mCurrentRestaurant = restaurant;
            return true;
        }
        return false;
    }

    @Override
    public List<Menu> getMenuFromTheRestaurant() {
        if (mCurrentRestaurant != null) {
            return mCurrentRestaurant.getMenu();
        } else {
            mListener.onMessageReceived("No restaurants selected");
            return null;
        }
    }

    @Override
    public boolean addItemFromMenu(List<Item> itemList) {
        for (Item it : itemList) {
            CartManager.getInstance().addItem(it);
        }
        return true;
    }

    @Override
    public void orderFood() {
        CartManager.getInstance().order(mPayListener);
    }

    @Override
    public void cancelOrder() {

    }

    @Override
    public void payAmount(PaymentStrategy strategy) {
        if (strategy != null) {
            strategy.pay(mTotalAmount);
        }

    }

    private PayListener mPayListener = new PayListener() {
        @Override
        public void onOrderDone(int amount) {
            mTotalAmount = amount;
            mListener.onMessageReceived("Pay Money");

        }
    };
}
