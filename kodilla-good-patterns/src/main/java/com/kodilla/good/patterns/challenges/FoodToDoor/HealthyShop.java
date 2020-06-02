package com.kodilla.good.patterns.challenges.FoodToDoor;

public class HealthyShop implements Shop{
    @Override
    public boolean process(Product product, int quantity) {
        System.out.println("Healthy Shop is checking you order.");
        System.out.println("Your order of " + quantity + " " + product + " has been accepted.");
        return true;
    }
}
