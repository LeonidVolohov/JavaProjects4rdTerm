package com.volohov.task2;

public class Cottage implements House {

    private String value;
    private double price;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void living() {
        System.out.println("This " + whoAmI() + " is alive");
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Cottage() {}

    public Cottage(double price, String value) {
        this.living();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + this.getPrice() + " " + this.getValue());
    }
}