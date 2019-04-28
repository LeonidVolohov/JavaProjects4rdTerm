package com.volohov.Task_4;

import javax.swing.*;

public class MainTask_Four {
    public void startFourthLab(int workers, int boxes,  JTextArea jTextArea) {
        try {
            if (workers < 1 || boxes < 1) {
                jTextArea.setText("The number of workers and boxes should be > 0");
                return;
            }

            jTextArea.append("Amount of workers: " + workers + "\n");
            jTextArea.append("Amount of boxes: " + boxes + "\n");
            Master master = new Master(workers, boxes, jTextArea);
            for (int i = 0; i < workers; ++i) {
                Worker worker = new Worker(master, jTextArea);
                new Thread(worker, "Worker " + i).start();
            }
        } catch (NumberFormatException e) {
            jTextArea.setText(e.getMessage() + " : Incorrect type of value" + "\n");
        }
    }
}