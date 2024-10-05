package com.exam.test27;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        //String[] s = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};
        //int n = s.length;
        //Write your code here
        //Output
        Comparator<String> compareValues = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ((o1 == null || o1.isEmpty()) || (o2 == null || o2.isEmpty())) {
                    return 0;
                }
                BigDecimal bd1 = new BigDecimal(o1);
                BigDecimal bd2 = new BigDecimal(o2);
                return bd2.compareTo(bd1);
            }
        };

        List<String> orderedNumbers = Arrays.asList(s);
        Collections.sort(orderedNumbers, compareValues);
        s = orderedNumbers.toArray(new String[0]);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
