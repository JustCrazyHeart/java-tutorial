package com.java.tutorial.concurrency;

/**
 * @author qiboo
 * 2019-01-13
 * 23:06
 */
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }
}
