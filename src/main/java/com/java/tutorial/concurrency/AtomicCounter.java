package com.java.tutorial.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qiboo
 * 2019-01-18
 * 11:01
 */
public class AtomicCounter {

    private AtomicInteger c = new AtomicInteger(0);

    public void increment() {
        c.incrementAndGet();
    }

    public void decrement() {
        c.decrementAndGet();
    }

    public int value() {
        return c.get();
    }
}
