package com.kodilla.good.patterns.challenges.FoodToDoor;

public class GlutenFreeShop implements Shop{
    @Override
    public boolean process(Product product, int quantity) {
        System.out.println("Gluten Free Shop is checking you order.");
        System.out.println("Your order of " + quantity + " " + product + " has been accepted.");
        return true;
    }
}
