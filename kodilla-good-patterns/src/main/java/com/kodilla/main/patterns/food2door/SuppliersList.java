package food2door;

import java.util.ArrayList;

public class SuppliersList {

    public ArrayList<Supplier> suppliersList = new ArrayList<>();

    public SuppliersList() {}

    public void addSupplier(Supplier supplierToAdd) {
        suppliersList.add(supplierToAdd);
    }

    public ArrayList<Supplier> getSuppliersList() {
        return suppliersList;
    }
}
