package com.kodilla.good.patterns.challenges.eshop;

import java.time.LocalDateTime;

public class BuyRequestRetriever {

    public BuyRequest retrieve(User user, Product product) {
        LocalDateTime orderDate = LocalDateTime.of(2020,6,2,12,20);
        return new BuyRequest(user, product, orderDate);
    }
}
