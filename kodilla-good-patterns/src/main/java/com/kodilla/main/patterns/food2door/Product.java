package food2door;

public class Product {
    private String productName;
    private Supplier supplier;

    public Product(String productName, Supplier supplier) {
        this.productName = productName;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierName() {
        return supplier.supplierName;
    }
}
