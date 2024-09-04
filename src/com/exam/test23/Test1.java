package com.exam.test23;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    private static final String REGEX_TAG = "<[^<>]+>";
    private static final Pattern TAG_PATTERN = Pattern.compile(REGEX_TAG);

    private static final String CONTENT_TAG = "<(\\w+)([^<]*?)>(?:[^<]*<\\1[^<]*>)*(.*?)<\\/\\1>";
    private static final Pattern CONTENT_PATTERN = Pattern.compile(CONTENT_TAG);

    public static void main(String[] args) {
        String content = "<body><h1><a>Hello</a></h1><h1>There!</h1></body>";
        List<String> tags = contentTags(content);
        isTagsValid(tags);
        //System.out.println(tags);
    }

    /**
     * generate of tags from the content
     *
     * @param content string to examine for tags
     * @return array of tags
     */
    private static List<String> contentTags(String content) {
        List<String> tags = new ArrayList<>();
        Matcher matcher = TAG_PATTERN.matcher(content);
        while (matcher.find()) {
            String groupContent = matcher.group();
            tags.add(groupContent);
        }
        return tags;
    }

    private static boolean isTagsValid(List<String> tags) {
        if (!isTagSizeValid(tags)) {
            return false;
        }
        List<String> endTags = tags.subList((tags.size() / 2), tags.size());
        for (String endTag : endTags) {
            int indexStart = tags.indexOf(endTag);
            System.out.println(indexStart);
            /*int indexEnd = ((tags.size() / 2) - 1) - indexStart;
            String endTag = tags.get(indexEnd);
            System.out.println(endTag);
            System.out.println(endTag);*/
        }
        return true;
    }

    private static boolean isTagSizeValid(List<String> tags) {
        if (tags.isEmpty()) {
            return false;
        }
        return ((tags.size() % 2 == 0));
    }

    /*public static void main(String[] args) {
        String content = "<Body><h1>Hello</h1></body>";
        Matcher matcher = CONTENT_PATTERN.matcher(content);
        while (matcher.find()) {
            String groupContent = matcher.group();
            System.out.println(groupContent);
        }
    }*/
}
