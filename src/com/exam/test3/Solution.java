package com.exam.test3;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String results = "Weird";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (isOdd(N)) {
            results = "Weird";
        }
        if (isEven(N)) {
            if (N > 20 || isBetween2and5(N)) {
                results = "Not Weird";
            }
            if (isBetween6and20(N)) {
                results = "Weird";
            }
        }
        System.out.println(results);
        scanner.close();
    }

    private static boolean isBetween6and20(int value) {
        return (value >= 6) && (value <= 20);
    }

    private static boolean isBetween2and5(int value) {
        return (value >= 2) && (value <= 5);
    }

    private static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    private static boolean isOdd(int value) {
        return (value % 3 == 0);
    }
}
