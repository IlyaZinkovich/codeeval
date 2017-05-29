package com.codeeval.challenges.moderate;

import java.util.Arrays;

public class DetectingCycles {

    public static void main(String[] args) {
        String line = "2 0 6 3 1 6 3 1 6 3 1";
        int[] numbers = Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf).toArray();

        int tortoise = 0;
        int hare = 1;

        while (numbers[hare] != numbers[tortoise] && hare < numbers.length) {
            hare++;
        }
    }
}
