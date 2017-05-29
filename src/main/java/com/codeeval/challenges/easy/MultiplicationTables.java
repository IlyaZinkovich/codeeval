package com.codeeval.challenges.easy;

/**
 * Created by Ilya_Zinkovich on 26-May-17.
 */
public class MultiplicationTables {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.print(i * j);
                for (int k = 0; k < 4 - String.valueOf(i * (j + 1)).length(); k++){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
