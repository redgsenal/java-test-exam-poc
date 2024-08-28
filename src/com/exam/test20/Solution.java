package com.exam.test20;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        int line = 0;
        while (line++ < testCases) {
            String pattern = in.nextLine();
            boolean isValid = true;
            try {
                Pattern patternValidate = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
            } catch (PatternSyntaxException e) {
                isValid = false;
            } finally {
                String result = isValid ? "Valid" : "Invalid";
                System.out.println(result);
            }

        }
    }
}