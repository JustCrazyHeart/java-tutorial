package com.java.tutorial.basicio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author qiboo
 * 2019-01-12
 * 12:07
 */
public class CopyCharacters {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("xanadu.txt");
            outputStream = new FileWriter("characteroutput.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
