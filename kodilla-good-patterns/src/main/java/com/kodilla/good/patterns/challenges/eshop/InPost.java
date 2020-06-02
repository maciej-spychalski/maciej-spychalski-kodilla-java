package com.kodilla.good.patterns.challenges.eshop;

public class InPost implements DeliveryService {
    @Override
    public void deliver(Product product, User user) {
        System.out.println("Product " + product.name() + " has been sent to " + user + " at " + user.getAddress());
    }
}
