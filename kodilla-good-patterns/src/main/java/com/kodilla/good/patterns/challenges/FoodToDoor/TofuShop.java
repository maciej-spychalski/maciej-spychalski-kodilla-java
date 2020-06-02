package com.kodilla.good.patterns.challenges.FoodToDoor;

public class TofuShop implements Shop{
    @Override
    public boolean process(Product product, int quantity) {
        System.out.println("Tofu Shop is checking you order.");
        System.out.println("Your order of " + quantity + " " + product.name() + " has been accepted.");
        return true;
    }
}
