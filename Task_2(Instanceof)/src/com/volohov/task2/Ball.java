package com.volohov.task2;

public class Ball implements Toy {

    private double price;
    private String value;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void play() {
        System.out.println("The " + whoAmI() + " is jumping");
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ball() {}

    public Ball(double price, String value) {
        this.play();
        this.setPrice(price);
        this.setValue(value);
        System.out.println("Price = " + this.getPrice() + " " + this.getValue());
    }
}