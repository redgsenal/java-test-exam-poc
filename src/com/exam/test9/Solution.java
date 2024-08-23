package com.exam.test8;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (isByte(x)) System.out.println("* byte");
                if (isShort(x)) System.out.println("* short");
                if (isInt(x)) System.out.println("* int");
                if (isLong(x)) System.out.println("* long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    private static boolean isBetweenRange(long min, long max, long x) {
        return (x >= min && x <= max);
    }

    private static boolean isByte(long x) {
        return isBetweenRange(-128, 127, x);
    }

    private static boolean isShort(long x) {
        return isBetweenRange(-32768, 32767, x);
    }

    private static boolean isInt(long x) {
        return isBetweenRange(-2147483648, 2147483647, x);
    }

    private static boolean isLong(long x) {
        return isBetweenRange(-9223372036854775808L, 9223372036854775807L, x);
    }
}
