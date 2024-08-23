package com.exam.test14;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        int l = a.length() + b.length();
        String isAbeforeB = (a.compareTo(b) < 1) ? "No" : "Yes";
        String aCapitalize = capitalizeFirstLetter(a);
        String bCapitalize = capitalizeFirstLetter(b);
        System.out.println(l);
        System.out.println(isAbeforeB);
        System.out.printf("%s %s", aCapitalize, bCapitalize);
    }

    private static String capitalizeFirstLetter(String item) {
        if (item == null || "".equals(item.trim())) {
            return "";
        }
        String firstLetter = item.substring(0, 1).toUpperCase();
        String remainingLetters = item.substring(1, item.length());
        return firstLetter.concat(remainingLetters);
    }
}
