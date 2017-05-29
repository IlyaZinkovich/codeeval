package com.codeeval.challenges.easy;

public class HiddenDigits {

    public static void main(String[] args) {
        String line = "abcdefghijk";
        char[] chars = line.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]))
                System.out.print(chars[i]);
            if (chars[i] >= 'a' && chars[i] - 'a' <= 9) {
                System.out.print(chars[i] - 'a');
            }
        }
        System.out.println();
    }
}
