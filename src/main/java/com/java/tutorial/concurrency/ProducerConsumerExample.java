package com.java.tutorial.concurrency;

/**
 * @author qiboo
 * 2019-01-16
 * 23:25
 */
public class ProducerConsumerExample {

    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }
}
