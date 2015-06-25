package com.hillel.java.multiTreading.producerConsumer;

/**
 * Created by NewClass9 on 22.06.2015.
 */
public class Bucket {
    private volatile int count;
    private static int maxCount = 50;

    public   void put() {
        synchronized(this) {
            while (count == maxCount) {
                //if (Thread.currentThread().isInterrupted()){return;}
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().isInterrupted();
                    return;
                }
            }
            System.out.println("producer: "+ count);

            count++;
            notify();
        }
    }

    public  synchronized void get() {
        while (count==0) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().isInterrupted();
                return;
            }
        }
        System.out.println("consumer: "+ count);
        count--;
        notify();
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "count=" + count +
                '}';
    }
}
