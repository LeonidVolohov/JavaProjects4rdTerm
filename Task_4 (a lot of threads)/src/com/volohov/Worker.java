package com.volohov;

class Worker implements Runnable {
    private Master master;

    Worker(Master master) {
        this.master = master;
    }

    @Override
    public synchronized void run() {
        while (true) {
            synchronized (master) {
                master.incrementNumCollectedBoxes();
                System.out.println(Thread.currentThread().getName() + " picked " + master.getNumCollectedBoxes() + " box");
                master.ckeckBoxes();
            }
        }
    }
}