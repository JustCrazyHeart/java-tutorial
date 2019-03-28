package com.java.tutorial.collections;

import java.util.*;

/**
 * @author qiboo
 * 2019-03-28
 * 15:27
 */
public class NameSort {
    public static void main(String[] args) {
        Name[] nameArray = {
                new Name("John", "Smith"),
                new Name("Karl", "Ng"),
                new Name("Jeff", "Smith"),
                new Name("Tom", "Rich")
        };

        List<Name> names = Arrays.asList(nameArray);
        Collections.sort(names);
        System.out.println(names);
    }
}
