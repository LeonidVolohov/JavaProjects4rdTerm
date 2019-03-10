package com.volohov.task2;

public class Yurta implements House {

    private static String value;
    private static double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void living() {
        System.out.println("This is yurta");
    }

    public void setValue(String value) {
        this.value= value;
    }

    public Yurta(double price, String value) {
        this.living();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + price + " " + value);
    }
}