package com.volohov.task2;

public class Doll implements Toy {

    static String value;
    static double price;

    public void play() {
        System.out.println("I`m playing with doll");
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public Doll() {}

    public Doll(double price, String value) {
        this.play();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + this.getPrice() + " " + this.getValue());
    }
}