package com.exam.test23;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test4 {

    // private static final String CONTENT_TAG_REGEX = "<([a-zA-Z][a-zA-Z0-9]*)\\b[^>]*>(.*?)</\\1>";
    private static final String CONTENT_TAG_REGEX = "<\\s*([a-zA-Z0-9]+)([^>]*)>(.*?)<\\/\\1\\s*>";
    private static final Pattern PATTERN = Pattern.compile(CONTENT_TAG_REGEX);

    public static void main(String[] args) {
        // list all contents found
        String html = "<body><h1><a>Hello</a></h1><h1>There!</h1></body>";
        // String html = "<par>So wait for a while</par>";
        //String html = "<a><a>Sanjay has no watch</a></a><par>So wait for a while</par>";
        List<String> contents = contentsFound(html);
        System.out.println(contents);
    }

    private static List<String> contentsFound(String html) {
        List<String> contents = new ArrayList<>();
        Matcher matcher = getMatcher(html);
        if (matcher != null) {
            String content = matcher.group(3);
            if (isContentContainTags(content)) {
                contents.addAll(contentsFound(content));
            } else {
                contents.add(content);
            }
        }
        return contents;
    }

    private static Matcher getMatcher(String html) {
        Matcher matcher = PATTERN.matcher(html);
        String tagName = "";
        while (matcher.find()) {
            tagName = matcher.group(1);
            if (!tagName.isEmpty() && !tagName.isBlank()) {
                return matcher;
            }
        }
        return null;
    }

    private static boolean isContentContainTags(String html) {
        Matcher matcher = PATTERN.matcher(html);
        String tagName = "";
        while (matcher.find()) {
            tagName = matcher.group(1);
        }
        return !tagName.isEmpty() && !tagName.isBlank();
    }
}
