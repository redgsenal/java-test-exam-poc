package com.exam.test13;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = getCurrencyValue(payment, Locale.US);
        String india = getCurrencyValue(payment, new Locale("en", "IN"));
        String china = getCurrencyValue(payment, Locale.CHINA);
        String france = getCurrencyValue(payment, Locale.FRANCE);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    private static String getCurrencyValue(double value, Locale locale) {
        NumberFormat nF = NumberFormat.getCurrencyInstance(locale);
        return nF.format(value);
    }
}
