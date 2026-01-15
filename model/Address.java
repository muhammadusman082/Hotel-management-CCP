package model;

public class Address {
    private String streetName;
    private String cityName;
    private String postalCode;

    public Address(String streetName, String cityName, String postalCode) {
        this.streetName = streetName;
        this.cityName = cityName;
        this.postalCode = postalCode;
    }

    public String getCity() {
        return this.cityName;
    }

    public String getZipCode() {
        return this.postalCode;
    }

    public String getStreet() {
        return this.streetName;
    }

    public void setStreet(String streetName) {
        this.streetName = streetName;
    }

    public void setCity(String cityName) {
        this.cityName = cityName;
    }

    public void setZipCode(String postalCode) {
        this.postalCode = postalCode;
    }
}