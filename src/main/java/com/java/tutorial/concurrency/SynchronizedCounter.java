package com.java.tutorial.concurrency;

/**
 * @author qiboo
 * 2019-01-18
 * 10:57
 */
public class SynchronizedCounter {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
