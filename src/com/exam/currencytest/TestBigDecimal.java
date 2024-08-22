package com.exam.currencytest;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {
        double a = 0.3d;
        double b = 0.1d;
        double c = a - b;
        System.out.println(c);

        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal cc = aa.subtract(bb);
        System.out.println(cc);

        // conclusion: do not use double and float for getting exact results with decimal values
        // use BigDecimal.valueOf instead
    }
}
