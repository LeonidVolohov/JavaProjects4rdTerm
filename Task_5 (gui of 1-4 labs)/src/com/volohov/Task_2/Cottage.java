package com.volohov.Task_2;

import javax.swing.*;

public class Cottage implements House {

    private String value;
    private double price;
    private JTextArea jTextArea;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void living(JTextArea jTextArea) {
        jTextArea.append("This " + whoAmI() + " is alive" + "\n");
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

    public Cottage() {}

    public Cottage(double price, String value, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.living(jTextArea);
        this.setPrice(price);
        this.setValue(value);
        jTextArea.append("Price = " + this.getPrice() + " " + this.getValue() + "\n");
    }
}