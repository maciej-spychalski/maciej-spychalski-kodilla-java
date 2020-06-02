package com.kodilla.good.patterns.challenges.eshop;

import java.time.LocalDateTime;

public class BuyRequest {
    private User user;
    private LocalDateTime orderDate;
    private Product product;

    public BuyRequest(User user, Product product, LocalDateTime orderDate) {
        this.user = user;
        this.product = product;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public Product getProduct() {
        return product;
    }
}
