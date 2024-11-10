package com.exam.test21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    public String pattern = "((([0-9a-fA-F]){1,4}):){7}([0-9a-fA-F]){1,4}";
    public MyRegex() {
    }
}