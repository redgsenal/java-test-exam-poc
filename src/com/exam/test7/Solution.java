package com.exam.test7;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void displaySeries(int a, int b, int n) {
        for (int series = 0; series < n; series++) {
            showPerItem(a, b, series);
        }
    }

    private static void showPerItem(int a, int b, int n) {
        double x = 0;
        int series = 0;
        while (series < n + 1) {
            x = x + computeItem(b, series);
            series++;
        }
        double r = a + x;
        System.out.printf("%.0f ", r);
    }

    private static double computeItem(int b, int n) {
        return (Math.pow(2, n) * b);
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            displaySeries(a, b, n);
            System.out.println();
        }
        in.close();
    }
}
