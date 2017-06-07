package com.codeeval.challenges.moderate;

import java.util.Arrays;

public class DecodeNumbers {

    public static void main(String[] args) {
        String line = "12";
        final int[] ints = Arrays.stream(line.split("")).mapToInt(Integer::valueOf).toArray();
        int counter = 0;
        boolean cool = true;
        for (int i = 0; i < line.length() - 1; i++) {
            if (ints[i] * 10 + ints[i + 1] < 27) {
                counter++;
            } else if (i % 2 == 0) {
                cool = false;
            }
        }
        if (ints.length > 2 && ints.length % 2 == 0 && cool) {
            System.out.println(counter + 2);
        } else {
            System.out.println(counter + 1);
        }
    }
}
