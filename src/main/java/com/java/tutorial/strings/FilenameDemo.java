package com.java.tutorial.strings;

/**
 * @author qiboo
 * 2019-01-09
 * 21:53
 */
public class FilenameDemo {

    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        Filename myHomePage = new Filename(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}
