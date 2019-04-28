package com.volohov;

public class Main_Task_4 {

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.err.println("Incorrect number of arguments!");
                System.exit(1);
            }

            int num_of_workers = Integer.parseInt(args[0]);
            int num_of_boxes = Integer.parseInt(args[1]);
            if (num_of_workers < 1 || num_of_boxes < 1) {
                System.out.println("The number of workers and boxes should be > 0");
                System.exit(1);
            }

            System.out.println("-------------------");
            System.out.println("Amount of workers: " + num_of_workers);
            System.out.println("Amount of boxes: " + num_of_boxes + "\n");

            Master master = new Master(num_of_workers, num_of_boxes);
            for (int i = 0; i < num_of_workers; ++i) {
                Worker worker = new Worker(master);
                new Thread(worker, "Worker " + i).start();
            }

        } catch (NumberFormatException err) {
            System.err.println(err.getMessage() + " : Incorrect type of value");
        }
    }
}