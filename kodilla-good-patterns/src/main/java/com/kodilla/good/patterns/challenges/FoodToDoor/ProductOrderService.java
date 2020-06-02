package com.kodilla.good.patterns.challenges.FoodToDoor;

public class ProductOrderService {

    public void order(Shop shop, int quantity, Product product) {

        boolean isOrderAccepted = shop.process(product, quantity);

        if(isOrderAccepted) {
            System.out.println("Than you for choosing Food2Door.");
        } else {
            System.out.println("We are sorry. Your order can't be realize.");
        }
    }
}
