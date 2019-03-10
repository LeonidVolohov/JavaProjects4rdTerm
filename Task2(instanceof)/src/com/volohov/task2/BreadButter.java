package com.volohov.task2;

public class BreadButter implements Eat {

    static double price;
    static String value;

    public void eating() {
        System.out.println("I`m eating bread and butter");
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

    public BreadButter() {}

    public BreadButter(double price, String value) {
        this.eating();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + price + " " + value);
    }
}