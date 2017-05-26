package com.codeeval.challenges.easy;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;

public class DataRecovery {

    public static void main(String[] args) {
        String line = "2000 and was not However, implemented 1998 it until;9 8 3 4 1 5 7 2";
        System.out.println(line);
        String[] input = line.split(";");
        String[] words = input[0].split(" ");
        String[] sequence = input[1].split(" ");
        String[] output = new String[words.length];
        int sum = 0;
        for (int i = 0; i < sequence.length; i++) {
            output[Integer.valueOf(sequence[i]) - 1] = words[i];
            words[i] = null;
            sum += Integer.valueOf(sequence[i]);
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i] != null) {
                output[((2 + words.length - 1) * words.length )/ 2 - sum - 1] = words[i];
                break;
            }
        }
        String result = Arrays.stream(output).collect(joining(" "));
        System.out.println(result);
    }
}