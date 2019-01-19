package com.java.tutorial.collections;

import java.util.*;

/**
 * @author qiboo
 * 2019-01-19
 * 17:39
 */
public class FindDups {

    public static void main(String[] args) {
        Set<String> s = new HashSet<String>();
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
