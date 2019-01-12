package com.java.tutorial.basicio;

import java.io.*;
import java.util.Scanner;

/**
 * @author qiboo
 * 2019-01-12
 * 14:50
 */
public class ScanXan {

    public static void main(String[] args) throws IOException {

        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
