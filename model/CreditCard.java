package model;

public class CreditCard {
    private String cardNo;
    private String validUntil;

    public CreditCard(String cardNo, String validUntil) {
        this.cardNo = cardNo;
        this.validUntil = validUntil;
    }

    public String getNumber() {
        return this.cardNo;
    }

    public String getExpiryDate() {
        return this.validUntil;
    }

    public void setNumber(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setExpiryDate(String validUntil) {
        this.validUntil = validUntil;
    }
}