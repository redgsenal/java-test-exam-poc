package com.exam.test11;

import java.util.Scanner;

public class Solution {

    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        try {
            int value = scan.nextInt();
            String s = String.valueOf(value);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }
    }
}
