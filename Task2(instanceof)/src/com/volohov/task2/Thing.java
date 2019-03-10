package com.volohov.task2;

public interface Thing {

    void setPrice(double price);

    default double getPrice(double price) {
        return price;
    }
}
