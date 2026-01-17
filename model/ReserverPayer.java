package model;

public class ReserverPayer extends Guest {
    private CreditCard paymentCard;
    private Identity personalId;

    public ReserverPayer(Name name, Address address, CreditCard card, Identity id) {
        super(name, address);
        this.paymentCard = card;
        this.personalId = id;
    }

    @Override
    public void create() {
        String output = String.format("ReserverPayer profile initialized via %s inheritance.", "Guest");
        System.out.println(output);
    }

    public CreditCard getCreditCardDetails() {
        return this.paymentCard;
    }

    public void setCreditCardDetails(CreditCard paymentCard) {
        this.paymentCard = paymentCard;
    }

    public Identity getId() {
        return this.personalId;
    }

    public void setId(Identity personalId) {
        this.personalId = personalId;
    }
}