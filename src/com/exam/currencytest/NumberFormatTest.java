package com.exam.currencytest;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {
        double a = 0.3d;
        double b = 0.1d;
        double c = a - b;
        System.out.println(c);
        BigDecimal aa = BigDecimal.valueOf(a);
        BigDecimal bb = BigDecimal.valueOf(b);
        BigDecimal cc = aa.subtract(bb);
        System.out.println(cc);
        Locale.setDefault(Locale.UK);
        var money = NumberFormat.getCurrencyInstance().format(cc);
        System.out.println(money);
    }
}
