package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public boolean orderToBeProcessed;

    public OrderDto(User user, boolean orderToBeProcessed) {
        this.user = user;
        this.orderToBeProcessed = orderToBeProcessed;
    }

    public User getUser() {
        return user;
    }

    public boolean isOrderToBeProcessed() {
        return orderToBeProcessed;
    }
}
