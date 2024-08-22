package com.exam.test4;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Write your code here.
        int i = scan.nextInt();
        double d = scan.nextDouble();
        // this helps the 2nd string input to proceed to the next line input
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
