package com.kodilla.good.patterns.challenges.eshop;


public class ProductOrderService {
    private InformationService informationService;
    private PaymentService paymentService;
    private DeliveryService deliveryService;
    private OrderDatabase orderDatabase;


    public ProductOrderService(InformationService informationService,
                               PaymentService paymentService,
                               DeliveryService deliveryService,
                               OrderDatabase orderDatabase) {
        this.informationService = informationService;
        this.paymentService = paymentService;
        this.deliveryService = deliveryService;
        this.orderDatabase = orderDatabase;
    }

    public void process(BuyRequest buyRequest) {
        BuyService buyService = new BuyService();
        boolean isBought = buyService.buy(buyRequest, new PayPal());

        if(isBought) {
            informationService.inform(buyRequest.getUser());
            deliveryService.deliver(buyRequest.getProduct(), buyRequest.getUser());
            orderDatabase.writeOrder(buyRequest);
        }


    }

}
