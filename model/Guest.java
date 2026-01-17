package model;

public class Guest {

    private Name fullName;
    private Address locationInfo;

    public Guest(Name fullName, Address locationInfo) {
        this.fullName = fullName;
        this.locationInfo = locationInfo;
    }

    public Name getName() {
        return this.fullName;
    }

    public void setName(Name fullName) {
        this.fullName = fullName;
    }

    public Address getAddressDetails() {
        return this.locationInfo;
    }

    public void setAddressDetails(Address locationInfo) {
        this.locationInfo = locationInfo;
    }

    public void create() {
        StringBuilder confirmation = new StringBuilder("New Guest profile ");
        confirmation.append("successfully initialized.");
        System.out.println(confirmation.toString());
    }
}