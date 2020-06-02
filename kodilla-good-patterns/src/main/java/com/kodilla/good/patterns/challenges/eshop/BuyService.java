package com.kodilla.good.patterns.challenges.eshop;

public class BuyService {

    boolean buy(BuyRequest buyRequest, PaymentService paymentService) {
        Warehouse warehouse = new Warehouse();
        boolean isAvailable = warehouse.isAvailable(buyRequest.getProduct());
        if(isAvailable) {
            return paymentService.pay();
         }
        return false;
    }
}
