package com.volohov.Task_2;

import javax.swing.*;

public class Ball implements Toy {

    private double price;
    private String value;
    private JTextArea jTextArea;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void play(JTextArea jTextArea) {
        jTextArea.append("The " + whoAmI() + " is jumping\n");
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

    public Ball(double price, String value, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.play(jTextArea);
        this.setPrice(price);
        this.setValue(value);
        jTextArea.append("Price = " + this.getPrice() + " " + this.getValue() + "\n");
    }
}