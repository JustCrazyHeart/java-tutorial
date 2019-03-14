package com.java.tutorial.platformenv;

import java.util.Map;

/**
 * @author qiboo
 * 2019-03-14
 * 17:12
 */
public class EnvMap {

    public static void main (String[] args) {
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }
}
