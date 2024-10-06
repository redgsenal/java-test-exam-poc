package com.exam.test31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String a = br.readLine();
            String b = br.readLine();
            BigInteger ba = new BigInteger(a);
            BigInteger bb = new BigInteger(b);
            BigInteger sum = ba.add(bb);
            BigInteger prod = ba.multiply(bb);
            System.out.println(sum);
            System.out.println(prod);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
