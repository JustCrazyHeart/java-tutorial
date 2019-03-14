package com.java.tutorial.platformenv;

/**
 * @author qiboo
 * 2019-03-14
 * 17:15
 */
public class Env {

    public static void main (String[] args) {
        for (String env: args) {
            String value = System.getenv(env);
            if (value != null) {
                System.out.format("%s=%s%n",
                        env, value);
            } else {
                System.out.format("%s is"
                        + " not assigned.%n", env);
            }
        }
    }
}
