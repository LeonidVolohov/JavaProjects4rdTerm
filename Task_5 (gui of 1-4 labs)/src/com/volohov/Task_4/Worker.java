package com.volohov.Task_4;

import javax.swing.*;

class Worker implements Runnable {
    private Master master;
    private JTextArea jTextArea;

    Worker(Master master, JTextArea jTextArea) {
        this.jTextArea = jTextArea;
        this.master = master;
    }

    @Override
    public synchronized void run() {
        while (true) {
            synchronized (master) {
                master.incrementNumCollectedBoxes();
                jTextArea.append(Thread.currentThread().getName() + " picked " + master.getNumCollectedBoxes() + " box" + "\n");
                if(master.checkStopProgram() == true) {
                    break;
                }
                master.checkBoxes();
            }
        }
    }
}