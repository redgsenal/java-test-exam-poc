package com.exam.test12;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Calendar;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String dayName = new DateFormatSymbols().getWeekdays()[dayNumber];
        return dayName.toUpperCase();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        String v = Result.findDay(8, 5, 2015);
        System.out.println(v);
    }
}
