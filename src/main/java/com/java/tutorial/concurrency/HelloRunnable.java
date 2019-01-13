package com.java.tutorial.concurrency;

/**
 * @author qiboo
 * 2019-01-13
 * 23:00
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }
}
