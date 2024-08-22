package com.exam.test5;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // 15 + special characters to trim to make spaces count to 15
            int spaces = 18 - s1.trim().length();
            String value = String.format("%03d", x);
            System.out.printf("%s%" + spaces + "s\n", s1, value);
        }
        System.out.println("================================");
    }
}
