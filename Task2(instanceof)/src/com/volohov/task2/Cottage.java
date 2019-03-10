package com.volohov.task2;

public class Cottage implements House {

    static String value;
    static double ageOfLiving;
    static double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setValue(String value) {
        this.value= value;
    }

    public void living() {
        System.out.println("This cottage is alive");
    }

    public Cottage(double price, String value) {
        this.living();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + price + " " + value);
    }
}