package com.volohov.task2;

public class Ball implements Toy {

    static double price;
    static String value;

    public void play() {
        System.out.println("The ball is jumping");
    }

    public void setValue(String value) {
        this.value = value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ball(double price, String value) {
        this.play();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + price + " " + value);
    }
}