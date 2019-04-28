package com.volohov.Task_3;

import javax.swing.*;

public class Consumer extends Thread{

    private WareHouse n;
    private int numberOfProducersConsumers;
    private JTextArea jTextArea;

    @Override
    public void run() {
        for(int i = 0; i < numberOfProducersConsumers; i++) {
            n.second(jTextArea);
        }
    }

    Consumer(WareHouse n, int m, JTextArea jTextArea) {
        super("Consumer");
        this.jTextArea = jTextArea;
        this.n = n;
        numberOfProducersConsumers = m;
        start();
    }
}
