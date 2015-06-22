package com.hillel.java.multiTreading.producerConsumer;

/**
 * Created by NewClass9 on 22.06.2015.
 */
public class Producer extends Thread {
    private Bucket bucket;

    public Producer(Bucket bucket) {
        this.bucket = bucket;

    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            bucket.put();
        }


    }
}
