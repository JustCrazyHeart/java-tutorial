package com.java.tutorial.concurrency;

/**
 * @author qiboo
 * 2019-01-14
 * 14:41
 */
public class Counter {

    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
}
