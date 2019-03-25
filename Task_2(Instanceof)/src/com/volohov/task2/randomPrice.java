package com.volohov.task2;

import java.util.Random;

public class randomPrice {

    private double min;
    private double max;

    public double generateRandom() {
        Random random = new Random();
        double randomPrice = min + (max - min) * random.nextDouble();
        //приведение к двум знакам после запятой
        randomPrice = randomPrice * 100;
        int i = (int) Math.round(randomPrice);
        randomPrice = (double)i / 100;
        return randomPrice;
    }

    public randomPrice(double min, double max) {
        this.min = min;
        this.max = max;
        this.generateRandom();
    }
}
