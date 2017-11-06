package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderRepository {

    boolean createOrder (User user, String productType, LocalDate transactionDate);
}
