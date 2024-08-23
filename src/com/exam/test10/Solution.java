package com.exam.test10;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int h = scan.nextInt();
        try {
            int area = computeParallelogramArea(b, h);
            System.out.println(area);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int computeParallelogramArea(int b, int h) throws Exception {
        if (b <= 0 || h <= 0) {
            throw new Exception("java.lang.Exception: Breadth and height must be positive");
        }
        return b * h;
    }
}
