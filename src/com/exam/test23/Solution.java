package com.exam.test23;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {

    private static final String CONTENT_PATTERN = "<(\\w+)([^<]*?)>(?:[^<]*<\\1[^<]*>)*(.*?)<\\/\\1>";
    private static final Pattern PATTERN = Pattern.compile(CONTENT_PATTERN, Pattern.UNICODE_CASE);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            displayTagContents(line);
            testCases--;
        }
    }

    private static boolean hasTags(String line) throws Exception {
        try {
            Matcher matcher = PATTERN.matcher(line);
            return matcher.find();
        } catch (PatternSyntaxException | IllegalStateException e) {
            throw new Exception("Mismatch pattern exception");
        }
    }

    private static void displayTagContents(String line) {
        try {
            if (!hasTags(line)) {
                System.out.println("None");
                return;
            }
            Matcher matcher = PATTERN.matcher(line);
            while (matcher.find()) {
                String content = matcher.group(3);
                System.out.println(content);
                displayTagContents(content);
            }
        } catch (Exception e) {
            System.out.println("None");
        }
    }
}
