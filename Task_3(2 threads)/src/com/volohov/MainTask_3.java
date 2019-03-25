package com.volohov;

public class MainTask_3 {

    public static void main(String[] args) {
        try {
            WareHeouse n = new WareHeouse();
            int numberOfProducersConsumers = 100;
            new Producer(n, numberOfProducersConsumers);
            new Consumer(n, numberOfProducersConsumers);
        }
        catch (java.lang.OutOfMemoryError e) {
            System.out.println("Error: " + e);
        }
    }
}
