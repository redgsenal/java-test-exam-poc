package com.exam.test23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Example {

    private static final String REGEX_TAG = "<\\s*([a-zA-Z0-9]+)([^>]*)>(.*?)<\\/\\1\\s*>";
    //private static final String REGEX_TAG = "<(\\w+)([^<]*?)>(.*?)<\\/\\1>";
    //private static final String REGEX_TAG = "<(?:\"[^\"]\"['\"]|'[^']'['\"]|[^'\">])+>";

    private static final String REGEX_CONTENT = "<(\\w+)([^<]*?)>(?:[^<]*<\\1[^<]*>)*(.*?)<\\/\\1>";

    // private static final Pattern PATTERN = Pattern.compile(TAG_PATTERN, Pattern.UNICODE_CASE);
    private static final Pattern CONTENT_PATTERN = Pattern.compile(REGEX_CONTENT, Pattern.CASE_INSENSITIVE);
    private static final Pattern TAG_PATTERN = Pattern.compile(REGEX_TAG);
    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            displayTagContents(line);
            testCases--;
        }
    }*/

    public static void main(String[] args) {
        // displayTagContents("<par>So wait for a while</par>");
        //displayTagContents("<h1>So wait for a while</h1>");
        //displayTagContents("<a><a>Sanjay has no watch</a></a><par>So wait for a while</par>");
        displayTagContents("<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>");
        // displayTagContents("<h1>Hello</h1><h1>Sanjay has no watch</h1><par>So wait for a while</par>");
        // displayTagContents("<body><p><h1>Sanjay has no watch</h1></p><par>So wait for a while</par></body>");
        displayTagContents("<Amee>safat codes like a ninja</amee>");
    }

    private static boolean hasTags(String line) throws Exception {
        try {
            Matcher matcher = TAG_PATTERN.matcher(line);
            return (matcher.find());
        } catch (PatternSyntaxException |
                 IllegalStateException e) {
            throw new Exception("Mismatch pattern exception");
        }
    }

    private static void displayTagContents(String line) {
        try {
            if (!hasTags(line)) {
                System.out.println("None");
                return;
            }
            Matcher matcher = CONTENT_PATTERN.matcher(line);
            while (matcher.find()) {
                String content = matcher.group(3);
                displayTagContents(content);
            }
        } catch (Exception e) {
            System.out.println("None");
        }
    }
}
