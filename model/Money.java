package model;

public class Money {
    private double totalValue;

    public Money(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getAmount() {
        return this.totalValue;
    }

    public void setAmount(double totalValue) {
        this.totalValue = totalValue;
    }
}