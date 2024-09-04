package com.exam.test23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlContentExtractor {
    public static void main(String[] args) {
        // Sample HTML string
        String html = "<p>This is <strong>bold</strong> and <em>italic</em>.</p>";

        // Regular expression to match content between tags
        String regex = "<([a-zA-Z][a-zA-Z0-9]*)\\b[^>]*>(.*?)</\\1>";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        // Match the pattern with the HTML string
        Matcher matcher = pattern.matcher(html);

        // Iterate through all matches
        while (matcher.find()) {
            // Group 1 is the tag name, Group 2 is the content
            String tagName = matcher.group(1);
            String content = matcher.group(2);

            System.out.println("Tag: <" + tagName + ">");
            System.out.println("Content: " + content);
        }
    }
}
