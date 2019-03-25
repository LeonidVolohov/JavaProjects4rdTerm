package com.volohov;

import java.util.ArrayList;

class testingThreads extends Thread {

    private int number[];

    testingThreads(int... number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < number.length; i++) {
                System.out.println("Thread " + number[i]);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}

class arrayList {

    static int random = (int) (Math.random() * 100);

    public void putArray() {
        int numberOfElements = random;
        ArrayList<Integer> warehouse = new ArrayList<Integer>(numberOfElements);
        for(int i = 0; i < numberOfElements; i++) {
            int newRandom = (int) (Math.random() * numberOfElements);
            warehouse.add(newRandom);
        }
        for(int j = 0; j < warehouse.size(); j++) {
            System.out.println(warehouse.get(j));
        }
    }

}

public class SomeTest {

    public static void main(String[] args) {
        System.out.println("===========");
        testingThreads testThread = new testingThreads(1, 3, 5, 7, 9);
        testingThreads newTestTread = new testingThreads(2, 4, 6, 8, 10);

        testThread.start();
        newTestTread.start();

    }
}
