package com.exam.test23;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution2 {

    private static final String HTML_TAG_REGEX = "<([a-zA-Z][a-zA-Z0-9]*)\\b[^>]*>(.*?)</\\1>";
    private static final String CONTENT_TAG_REGEX = "<[^>]+>(.*?)<\\/[^>]+>";

    // Compile the pattern
    private static final Pattern HTML_PATTERN = Pattern.compile(HTML_TAG_REGEX);
    private static final Pattern CONTENT_PATTERN = Pattern.compile(CONTENT_TAG_REGEX);

    private static final List<String> ContentList = new ArrayList<>();

    public static void main(String[] args) {
        //String html = "<h1>Nayeem loves counseling</h1>";
        String html = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        //String html = "<Amee>safat codes like a ninja</amee>";
        //String html = "<SA premium>Imtiaz has a secret crush</SA premium>";
        extractHTMLContents(html);
        for (String content : ContentList) {
            System.out.println(content);
        }
    }

    private static void extractHTMLContents(String html) {
        Matcher matcher = CONTENT_PATTERN.matcher(html);
        while (matcher.find()) {
            // extract the content
            String tagName = matcher.group(1);
            if (tagName != null && !tagName.isEmpty()) {
                String htmlcontent = matcher.group(1);
                String content = htmlcontent.replace("<" + tagName + ">", "").replace("<\\" + tagName + ">", "").trim();
                if (content != null && !content.isEmpty() && isValidHTMLTags(html)) {
                    ContentList.add(content);
                } else {
                    ContentList.add("None");
                }
            }
        }
    }

    private static boolean isValidHTMLTags(String html) {
        if (html.isEmpty()) {
            return false;
        }
        Matcher matcher = HTML_PATTERN.matcher(html);
        while (matcher.find()) {
            String tagName = matcher.group(1);
            if (!tagName.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
