package com.kodilla.good.patterns.challenges.FoodToDoor;

public class Application {
    public static void main(String[] args) {
        TofuShop tofuShop = new TofuShop();
        int quantity = 1;
        TofuSteak tofuSteak = new TofuSteak();
        System.out.println();

        ProductOrderService productOrderService = new ProductOrderService();
        productOrderService.order(tofuShop, quantity, tofuSteak);

    }

}
