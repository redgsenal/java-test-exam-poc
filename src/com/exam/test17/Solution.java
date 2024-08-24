package com.exam.test17;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String palindrome = getPalindrome(A);
        String result = A.equalsIgnoreCase(palindrome) ? "Yes" : "No";
        System.out.println(result);
    }

    private static String getPalindrome(String a) {
        if ("".equals(a) || a == null) {
            return "";
        }
        String result = "";
        int i = a.length() - 1;
        while (result.length() < a.length()) {
            result = result.concat(Character.toString(a.charAt(i)));
            i--;
        }
        return result;
    }
}
