package com.exam.test23;

import java.util.*;
import java.util.regex.*;

public class Solution{

    private static String TAG_PATTERN = "<h1>(.*?)<\\/h1>";
    /*public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            displayTagContents(line);
            testCases--;
        }
    }*/

    public static void main(String[] args){
        displayTagContents("<h1>Nayeem loves counseling</h1>");
    }

    private static void displayTagContents(String line) {
        try {
            Pattern pattern = Pattern.compile(TAG_PATTERN);
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                String content = matcher.group();
                StisplayTagContents(content);
            }
        }catch (PatternSyntaxException e) {
            System.out.println("None");
        }
    }
}
