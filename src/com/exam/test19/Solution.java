package com.exam.test19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        displayStringToken("He is a very very good boy, isn't he?");
    }

    private static void displayStringToken(String s) {
        if (s == null || s.isEmpty()) {
            return;
        }
        List<String> tokens = new ArrayList<>();
        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String value = matcher.group();
            tokens.add(value);
        }
        System.out.println(tokens.size());
        tokens.forEach(System.out::println);
    }
}
