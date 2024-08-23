package com.exam.test9;

import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.printf("%d %s\n", ++i, line);
        }
        sc.close();
    }
}
