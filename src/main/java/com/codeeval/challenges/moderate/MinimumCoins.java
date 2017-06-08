package com.codeeval.challenges.moderate;

public class MinimumCoins {

    public static void main(String[] args) {
        String line = "11";
        final Double sum = Double.valueOf(line);
        double floor = Math.floor(sum / 5);
        final double remainder = sum % 5;
        floor += Math.floor(remainder / 3);
        floor += remainder % 3;
        System.out.println((int) floor);
    }
}
