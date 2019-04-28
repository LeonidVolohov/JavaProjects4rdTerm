package com.volohov.Task_3;

import javax.swing.*;

public class WareHouse {

    private static int random;

    synchronized void first(JTextArea jTextArea) {
        random = (int) (Math.random() * 100);
        jTextArea.append("Производитель сгенерировал число: " + random + "\n");

        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            jTextArea.setText("New exception interrupted : Producer");
        }
    }

    synchronized void second(JTextArea jTextArea) {
        jTextArea.append("Потребитель считал число: " + random + "\n");

        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            jTextArea.setText("New exception interrupted : Consumer");
        }
    }
}
