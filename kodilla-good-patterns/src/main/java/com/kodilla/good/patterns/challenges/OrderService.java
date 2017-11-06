package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public interface OrderService {

    boolean orderRequest (User user, String productType, LocalDate transactionDate);
}
