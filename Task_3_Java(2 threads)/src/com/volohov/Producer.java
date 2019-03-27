package com.volohov;

public class Producer extends  Thread {

    private WareHeouse n;
    private int numberOfProducersConsumers;

    @Override
    public void run() {
        for(int i = 0; i < numberOfProducersConsumers; i++){
            n.first();
        }
    }

    Producer(WareHeouse n, int m) {
        this.n = n;
        numberOfProducersConsumers = m;
        this.start();
    }
}