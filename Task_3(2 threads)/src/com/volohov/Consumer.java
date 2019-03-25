package com.volohov;

public class Consumer extends Thread{

    private WareHeouse n;
    private int numberOfProducersConsumers;

    @Override
    public void run() {
        for(int i = 0; i < numberOfProducersConsumers; i++) {
            n.second();
        }
    }

    Consumer(WareHeouse n, int m) {
        super("Consumer");
        this.n = n;
        numberOfProducersConsumers = m;
        start();
    }
}
