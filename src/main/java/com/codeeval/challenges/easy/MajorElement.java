package com.codeeval.challenges.easy;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MajorElement {

    public static void main(String[] args) {
        String elements = "92,19,19,76,19,21,19,85,19,19,19,94,19,19,22,67,83,19,19,54,59,1,19,19";
        String[] split = elements.split(",");
        String result = Arrays.stream(split).collect(groupingBy(identity(), counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > split.length / 2).map(Map.Entry::getKey).findAny().orElse("None");
        System.out.println(result);
    }
}
