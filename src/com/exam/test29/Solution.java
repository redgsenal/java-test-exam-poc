package com.exam.test29;

class Singleton {

    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public String str;

    public static Singleton getSingleInstance() {
        return instance;
    }

}

public class Solution {

}
