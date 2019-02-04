package com.vishalbharti.fooddelivery.impl.model;

import com.vishalbharti.fooddelivery.impl.pay.PayListener;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private List<Item> mAllItems;
    private static CartManager mInstance;

    private CartManager() {
        mAllItems = new ArrayList<>();
    }

    public static CartManager getInstance() {
        if (mInstance == null) {
            mInstance = new CartManager();
        }
        return mInstance;
    }

    public void addItem(Item item) {
        mAllItems.add(item);
    }

    public void removeItem(Item item) {
        mAllItems.remove(item);
    }

    public void order(PayListener payListener) {
        int amount = 0;
        for (Item items : mAllItems) {
            amount += items.getPrice();
        }
        payListener.onOrderDone(amount);
    }
}
