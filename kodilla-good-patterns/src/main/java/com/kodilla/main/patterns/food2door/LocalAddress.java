package food2door;

public class LocalAddress {
    private String streetAddress;
    private String cityAddress;
    private String postalCode;
    private String country;

    public LocalAddress(String streetAddress, String cityAddress, String postalCode, String country) {
        this.streetAddress = streetAddress;
        this.cityAddress = cityAddress;
        this.postalCode = postalCode;
        this.country = country;
    }

    public String getStreetAddress() {

        return streetAddress;
    }
}