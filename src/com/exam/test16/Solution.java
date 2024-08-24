package com.exam.test16;

public class Solution {

    public static void main(String[] args) {
        String result = getSmallestAndLargest("welcometojava", 3);
        System.out.println(result);
    }

    private static String chooseSmallest(String smallest, String item) {
        if ("".equals(smallest) || smallest == null) {
            return item;
        }
        return (smallest.compareTo(item) < 1) ? smallest : item;
    }

    private static String chooseLargest(String largest, String item) {
        if ("".equals(largest) || largest == null) {
            return item;
        }
        return (largest.compareTo(item) < 1) ? item : largest;
    }

    public static String getSmallestAndLargest(String s, int k) {
        if (s == null || "".equals(s)) {
            return "";
        }
        String smallest = "";
        String largest = "";

        int start = 0;
        int end = k;
        while (start < s.length()) {
            String item = s.substring(start, end);
            if (item.length() == k) {
                smallest = chooseSmallest(smallest, item);
                largest = chooseLargest(largest, item);
            }
            start++;
            end = (end < s.length()) ? start + k : s.length();
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;
    }
}
