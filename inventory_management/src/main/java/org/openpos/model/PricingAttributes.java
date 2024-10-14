package org.openpos.model;

public abstract class PricingAttributes {
    private double price;
    private double discount;
    private double tax;
    private double quantity;
    private double initialPrice;
    private double discountedPrice;

    public PricingAttributes() {
        this.tax = 0;
        this.discount = 0;
        this.price = 0;
        this.discountedPrice = 0;
        this.quantity = 1;
    }

    public void calculateInitialPrice(){
        this.initialPrice = ((price - discount) * (1 + tax/100)) * quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(double initialPrice) {
        this.initialPrice = initialPrice;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "PriceCalculator{" +
                "price=" + price +
                ", discount=" + discount +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", initialPrice=" + initialPrice +
                '}';
    }
}
