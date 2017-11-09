package food2door;

public class SuppliersRetriever {

    public SuppliersList retrieve() {

        Supplier supplier0 = new Supplier(
                "ExtraFoodShop",
                new LocalAddress("34 Pacific Hwy",
                        "North Syd",
                        "2060",
                        "Australia"),
                657654200);

        Supplier supplier1 = new Supplier(
                "HealthyShop",
                new LocalAddress("4 Gorgon St",
                        "Wollomollo",
                        "2045",
                        "Australia"),
                657652000);

        Supplier supplier2 = new Supplier(
                "GlutenFreeShop",
                new LocalAddress("45 Martin Pl",
                        "Sydney",
                        "2000",
                        "Australia"),
                651002000);

        SuppliersList suppliersList = new SuppliersList();
        suppliersList.addSupplier(supplier0);
        suppliersList.addSupplier(supplier1);
        suppliersList.addSupplier(supplier2);

        return suppliersList;
    }
}
