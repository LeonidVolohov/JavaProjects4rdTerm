package com.volohov.Task_2;

import javax.swing.*;

public class BreadButter implements Eat {

    private double price;
    private String value;
    private JTextArea jTextArea;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void eating(JTextArea jTextArea) {
        jTextArea.append("I`m eating " + whoAmI() + "\n");
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

    public BreadButter(double price, String value, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.eating(jTextArea);
        this.setPrice(price);
        this.setValue(value);
        jTextArea.append("Price = " + this.getPrice() + " " + this.getValue() + "\n");
    }
}