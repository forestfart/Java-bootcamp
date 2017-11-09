package com.kodilla.good.patterns.challenges;

public class ProductType {

    public String productType;

    public ProductType(String productType) {

        ProductTypes productTypes = new ProductTypes();
        if (productTypes.validateProductType(productType)==true) {
            this.productType = productType;
        } else {
            System.out.println("incorrect product type, try again.");
        }
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductType that = (ProductType) o;

        return productType != null ? productType.equals(that.productType) : that.productType == null;
    }

    @Override
    public int hashCode() {
        return productType != null ? productType.hashCode() : 0;
    }
}
