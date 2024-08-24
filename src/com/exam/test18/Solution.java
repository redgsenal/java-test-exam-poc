package com.exam.test18;

public class Solution {

    public static void main(String[] args) {
        String result = isAnagram("hello", "Hello") ? "Anagrams" : "Not Anagrams";
        System.out.println(result);
    }

    static int countLetter(String s, char ch) {
        int count = 0;
        String item = s.toLowerCase();
        for (int i = 0; i < item.length(); i++) {
            char itemChar = item.charAt(i);
            if (itemChar == ch) {
                count++;
            }
        }
        return count;
    }

    static boolean isAnagram(String a, String b) {
        if ("".equals(b) || "".equals(a) || a == null || b == null || a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int countLetterA = countLetter(a, ch);
            int countLetterB = countLetter(b, ch);
            if (countLetterA != countLetterB) {
                return false;
            }
        }
        return true;
    }
}
