package com.volohov.task2;

public class BreadButter implements Eat {

    private double price;
    private String value;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void eating() {
        System.out.println("I`m eating " + whoAmI());
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

    public BreadButter() {
    }

    public BreadButter(double price, String value) {
        this.eating();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + this.getPrice() + " " + this.getValue());
    }
}