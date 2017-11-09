package food2door;

public class Supplier {

    protected String supplierName;
    protected LocalAddress supplierAddress;
    protected int phoneNumber;

    public Supplier(String supplierName, LocalAddress supplierAddress, int phoneNumber) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.phoneNumber = phoneNumber;
    }
}
