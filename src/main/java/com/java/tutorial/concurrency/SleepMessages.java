package com.java.tutorial.concurrency;

/**
 * @author qiboo
 * 2019-01-14
 * 00:19
 */
public class SleepMessages {

    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(importantInfo[i]);
        }
    }
}
