package com.volohov.Task_2;

import javax.swing.*;

public class Doll implements Toy {

    private String value;
    private double price;
    private JTextArea jTextArea;

    public String whoAmI() {
        return this.getClass().getSimpleName();
    }

    public void play(JTextArea jTextArea) {
        jTextArea.append("I`m playing with " + whoAmI() + "\n");
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

    public Doll(double price, String value, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.play(jTextArea);
        this.setPrice(price);
        this.setValue(value);
        jTextArea.append("Price = " + this.getPrice() + " " + this.getValue() + "\n");
    }
}