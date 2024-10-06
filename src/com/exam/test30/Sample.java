package com.exam.test30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int numberOfNodes = Integer.parseInt(br.readLine().trim());
        } catch (NumberFormatException | IOException e) {
            System.out.println("** error");
            e.printStackTrace();
        }
    }

}
