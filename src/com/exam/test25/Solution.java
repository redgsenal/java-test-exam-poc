package com.exam.test25;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Solution {

    public static void main(String[] args) {
        Object o;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            o = new Solution.Inner().new Private();
            Method method = o.getClass().getDeclaredMethod("powerof2", new Class[]{int.class});
            method.setAccessible(true);
            String result = (String) method.invoke(o, num);
            System.out.println(num + " is " + result);
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
        } catch (Exception e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }

    static class Inner {

        private class Private {

            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }

            public void abc() {
                System.out.println("hello");
            }
        }
    }
}
