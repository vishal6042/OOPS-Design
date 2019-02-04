package com.vishalbharti.fooddelivery.impl.pay;

public class PaytmStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PaytmStrategy(String email, String pwd) {
        this.emailId = email;
        this.password = pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount " + amount + " Paid via Paytm");
    }
}
