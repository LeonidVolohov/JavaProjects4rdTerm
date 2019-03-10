package com.volohov.task2;

public class Sandwich implements Eat{

    private static double price;
    private static String value;

    public void eating(){
        System.out.println("I`m eating sandwidch");
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

    public Sandwich() {}

    public Sandwich(double price, String value) {
        this.eating();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + price + " " + value);
    }
}