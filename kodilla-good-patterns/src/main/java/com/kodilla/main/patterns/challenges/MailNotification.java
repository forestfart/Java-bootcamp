package com.kodilla.good.patterns.challenges;

public class MailNotification implements InformationService {
    public void informUser (User user, OrderRequest orderRequest) {
        System.out.println("e-mail is being sent to: " + user.getUserName() + " " + user.getUserSurname() + ", about his order ID: " + orderRequest.transactionID);
    }
}
