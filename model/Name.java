package model;

public class Name {
    private String givenName;
    private String familyName;

    public Name(String givenName, String familyName) {
        this.givenName = givenName;
        this.familyName = familyName;
    }

    public String getFirstName() {
        return this.givenName;
    }

    public void setFirstName(String givenName) {
        this.givenName = givenName;
    }

    public String getLastName() {
        return this.familyName;
    }

    public void setLastName(String familyName) {
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return String.format("%s %s", givenName, familyName);
    }
}