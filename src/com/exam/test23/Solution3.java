package com.exam.test23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution3 {

    public static void main(String[] args) {
        // Your HTML string with nested tags
        //String html = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        String html = "<Amee>safat codes like a ninja</amee>";
        // Regular expression to extract content between tags
        String regex = "<[^>]+>(.*?)<\\/[^>]+>";

        // Compile the regular expression
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern against the HTML string
        Matcher matcher = pattern.matcher(html);

        // Iterate over all matches and print the captured content
        while (matcher.find()) {
            // Extract the group that contains the content inside the tags
            System.out.println(matcher.group(1));
        }
    }
}
