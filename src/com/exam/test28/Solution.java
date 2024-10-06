package com.exam.test28;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {

        String n = "8";
        BigInteger bigInteger = new BigInteger(n);
        boolean isPrime = bigInteger.isProbablePrime(1);
        System.out.println(isPrime ? "prime" : "not prime");
    }

}
