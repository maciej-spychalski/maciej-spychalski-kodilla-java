package com.kodilla.good.patterns.challenges.eshop;

public class MailService implements InformationService{


    private void sendEmail(User user) {
        System.out.println("Message for " + user);
    }

    @Override
    public void inform(User user) {
        sendEmail(user);
    }
}
