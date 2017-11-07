package food2door;

import java.util.ArrayList;

public class ProductListRetriever {

    public ProductList retrieve() {

        SuppliersRetriever suppliersRetriever = new SuppliersRetriever();
        ArrayList<Supplier> suppliersList = suppliersRetriever.retrieve().getSuppliersList();

        Product product0 = new Product("<< Jajka prosto od kury >>", suppliersList.get(0));
        Product product1 = new Product("<< Mieso prosto od zwierza >>", suppliersList.get(1));
        Product product2 = new Product("<< Maslo prosto z mleka >>", suppliersList.get(2));
        Product product3 = new Product("<< Chleb >>", suppliersList.get(0));
        Product product4 = new Product("<< Maka >>", suppliersList.get(2));
        Product product5 = new Product("<< Miod >>", suppliersList.get(1));
        Product product6 = new Product("<< Ziemniak >>", suppliersList.get(1));

        ProductList productList = new ProductList();
        productList.addProduct(product0);
        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product3);
        productList.addProduct(product4);
        productList.addProduct(product5);
        productList.addProduct(product6);

        return productList;
    }
}
