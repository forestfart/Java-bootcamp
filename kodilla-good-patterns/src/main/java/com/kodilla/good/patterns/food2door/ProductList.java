package food2door;

import java.util.ArrayList;

public class ProductList {

    public ArrayList<Product> productList = new ArrayList<>();

    public ProductList() {}

    public void addProduct(Product productToAdd) {
        productList.add(productToAdd);
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
}
