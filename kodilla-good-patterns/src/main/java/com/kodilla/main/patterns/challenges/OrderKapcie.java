package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderKapcie implements OrderService {

    public boolean orderRequest(User user, String productType, LocalDate transactionDate) {
        ProductTypes productTypes = new ProductTypes();
        return productTypes.validateProductType(productType);
    }
}
