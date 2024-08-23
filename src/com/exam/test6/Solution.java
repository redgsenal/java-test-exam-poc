package com.exam.test6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int i = 0;
        while (i++ < 10) {
            System.out.printf("%d x %d = %d\n", N, i, N * i);
        }
        bufferedReader.close();
    }
}
