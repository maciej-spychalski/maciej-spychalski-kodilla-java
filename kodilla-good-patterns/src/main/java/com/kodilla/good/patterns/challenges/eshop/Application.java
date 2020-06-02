package com.kodilla.good.patterns.challenges.eshop;

public class Application {
    public static void main(String[] args) {

        User user = new User("John", "Doe", "john.doe@gmail.com", "ISS");
        user.setLogin("john.doe");
        user.setPassword("1234");
        Chess chess = new Chess();
        System.out.println();

        if (user.logIn("john.doe", "1234")) {
            BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
            BuyRequest buyRequest = buyRequestRetriever.retrieve(user, chess);

            ProductOrderService productOrderService = new ProductOrderService(new MailService(), new PayPal(), new InPost(), new OrderRegister());
            productOrderService.process(buyRequest);

        }

    }
}
