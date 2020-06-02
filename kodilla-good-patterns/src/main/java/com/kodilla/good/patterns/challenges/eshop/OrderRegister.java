package com.kodilla.good.patterns.challenges.eshop;

public class OrderRegister implements OrderDatabase{
    @Override
    public void writeOrder(BuyRequest buyRequest) {
        System.out.println("Order of " + buyRequest.getProduct().name() + " registered in the database");
    }
}
