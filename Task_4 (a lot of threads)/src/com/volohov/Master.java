package com.volohov;

class Master {

    private int num_of_workers;
    private int num_of_boxes;
    private volatile int num_collected_boxes = 0;

    void incrementNumCollectedBoxes() {
        num_collected_boxes++;
    }

    int getNumCollectedBoxes() {
        return num_collected_boxes;
    }

    synchronized void ckeckBoxes() {
        if (num_collected_boxes == num_of_boxes) {
            System.exit(0);
        }

        if (num_collected_boxes % num_of_workers != 0) {
            try {
                wait();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            System.out.println("The next box is resolved");
            notifyAll();
        }
    }

    Master(int num_of_workers, int numTotalBoxes) {
        this.num_of_workers = num_of_workers;
        this.num_of_boxes = numTotalBoxes;
    }
}