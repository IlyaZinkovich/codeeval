package com.codeeval.challenges.moderate;

public class NumberOfOnes {

    public static void main(String[] args) {
        String line = "22";
        Integer number = Integer.valueOf(line);
        int counter = 0;
        while (number > 0) {
            counter += number % 2;
            number >>= 1;
        }
        System.out.println(counter);
    }
}
