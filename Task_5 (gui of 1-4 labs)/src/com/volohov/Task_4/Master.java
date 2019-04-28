package com.volohov.Task_4;

import javax.swing.*;

class Master {
    private int num_of_workers;
    private int num_of_boxes;
    private volatile int num_collected_boxes = 0;
    private JTextArea jTextArea;

    void incrementNumCollectedBoxes() {
        num_collected_boxes++;
    }

    int getNumCollectedBoxes() {
        return num_collected_boxes;
    }

    synchronized boolean checkStopProgram() {
        if (num_collected_boxes == num_of_boxes) {
            return true;
        } else return false;
    }

    synchronized void checkBoxes() {
        if (num_collected_boxes % num_of_workers != 0) {
            try {
                wait();
            } catch (Exception e) {
                jTextArea.setText(e.getMessage());
            }
        } else {
            jTextArea.append("The next box is resolved\n");
            notifyAll();
        }
    }

    Master(int num_of_workers, int numTotalBoxes, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.num_of_workers = num_of_workers;
        this.num_of_boxes = numTotalBoxes;
    }
}