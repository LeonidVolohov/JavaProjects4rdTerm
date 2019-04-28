package com.volohov.Task_3;

import javax.swing.*;

public class MainTask_Three {
    public void startThirdLab(String[] args, JTextArea jTextArea) {
        try {
            WareHouse n = new WareHouse();
            int numberOfProducersConsumers = Integer.parseInt(args[0]);
            new Producer(n, numberOfProducersConsumers, jTextArea);
            new Consumer(n, numberOfProducersConsumers, jTextArea);
        }
        catch (java.lang.OutOfMemoryError e) {
            jTextArea.setText("Error: " + e);
        }
    }
}
