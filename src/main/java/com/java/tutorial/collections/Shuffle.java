package com.java.tutorial.collections;

import java.util.*;

/**
 * @author qiboo
 * 2019-01-23
 * 10:07
 */
public class Shuffle {

    public static void main(String[] args) {
        List<String> list = Arrays.asList(args);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
