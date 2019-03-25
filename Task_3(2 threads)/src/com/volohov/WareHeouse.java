package com.volohov;

public class WareHeouse {

    private static int random;

    synchronized void first() {
        random = (int) (Math.random() * 100);
        System.out.println("Производитель сгенерировал число: " + random);

        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("New exception interrupted : Producer");
        }
    }

    synchronized void second() {
        System.out.println("Потребитель считал число: " + random);

        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("New exception interrupted : Consumer");
        }
    }
}
