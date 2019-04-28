package com.volohov.Task_3;

import javax.swing.*;

public class Producer extends  Thread {

    private WareHouse n;
    private int numberOfProducersConsumers;
    private JTextArea jTextArea;

    @Override
    public void run() {
        for(int i = 0; i < numberOfProducersConsumers; i++){
            n.first(jTextArea);
        }
    }

    Producer(WareHouse n, int m, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.n = n;
        numberOfProducersConsumers = m;
        this.start();
    }
}