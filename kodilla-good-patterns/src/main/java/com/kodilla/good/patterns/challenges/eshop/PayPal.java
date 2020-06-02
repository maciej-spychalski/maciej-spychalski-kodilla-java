package com.kodilla.good.patterns.challenges.eshop;

public class PayPal implements PaymentService {
    @Override
    public boolean pay() {
        System.out.println("Payment accepted");
        return true;
    }
}
