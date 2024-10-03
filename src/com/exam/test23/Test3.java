package com.exam.test23;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {

    private static final String CONTENT_TAG_REGEX = "<([a-zA-Z][a-zA-Z0-9]*)\\b[^>]*>(.*?)</\\1>";

    // Compile the pattern
    private static final Pattern PATTERN = Pattern.compile(CONTENT_TAG_REGEX);

    // Match the pattern with the HTML string
    private static List<String> extractContent(Matcher matcher) {
        List<String> contents = new ArrayList<>();
        while (matcher.find()) {
            String content = matcher.group(2);
            contents.add(content);
        }
        return contents;
    }

    private static boolean isContentContainTags(String html) {
        Matcher matcher = PATTERN.matcher(html);
        String tagName = "";
        while (matcher.find()) {
            // extract the content
            tagName = matcher.group(1);
        }
        return !tagName.isEmpty() && !tagName.isBlank();
    }

    public static void main(String[] args) {
        //String html = "<body><h1><a>Hello</a></h1><h1>There!</h1></body>";
        String html = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        List<String> contents = new ArrayList<>();
        String content = html;
        while (isContentContainTags(content)) {
            Matcher matcher = PATTERN.matcher(content);
            while (matcher.find()) {
                content = matcher.group(2);
                if (!isContentContainTags(content)) {
                    contents.add(content);
                    continue;
                }
                contents.addAll(extractContent(matcher));
            }
        }
        System.out.println(contents);
    }
}


/*public static void main(String[] args) {
        String html = "<body><h1><a>Hello</a></h1><h1>There!</h1></body>";
        Matcher matcher = PATTERN.matcher(html);
        while (matcher.find()) {
            // Group 1 is the tag name, Group 2 is the content
            String tagName = matcher.group(1);
            String content1 = matcher.group(2);

            System.out.println("Tag: <" + tagName + ">");
            System.out.println("Content: " + content1);
        }
    }*/
