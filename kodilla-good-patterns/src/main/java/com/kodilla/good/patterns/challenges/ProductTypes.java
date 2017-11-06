package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public final class ProductTypes {

    public final static ArrayList<String> productTypes = new ArrayList<>();

    public ProductTypes() {
        productTypes.add("Gry");
        productTypes.add("Kapcie");
        productTypes.add("Szczoteczki do zebow");
        productTypes.add("inne");
    }

    public final boolean validateProductType(String productType) {
        return productTypes.stream().anyMatch(n -> n.equals(productType));
    }

    public final ArrayList<String> getProductTypes() {
        return productTypes;
    }
}
