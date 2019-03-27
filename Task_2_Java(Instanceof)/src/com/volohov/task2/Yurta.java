package com.volohov.task2;

public class Yurta implements House {

    private String value;
    private double price;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void living() {
        System.out.println("This is " + whoAmI());
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setValue(String value) {
        this.value= value;
    }

    public String getValue() {
        return value;
    }

    public Yurta() {}

    public Yurta(double price, String value) {
        this.living();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + this.getPrice() + " " + this.getValue());
    }
}