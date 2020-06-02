package com.kodilla.good.patterns.srp;

public class MailService implements InformationService{

    public void sendEmail(User user) {

    }

    @Override
    public void inform(User user) {
        sendEmail(user);
    }
}
