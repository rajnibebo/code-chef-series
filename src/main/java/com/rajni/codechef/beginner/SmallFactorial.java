package com.rajni.codechef.beginner;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        if (testCases >=1 && testCases <= 100) {
            for (int i = 0 ; i < testCases; i++) {
                int n = scanner.nextInt();
                BigInteger factorial =new BigInteger("1");
                if (n >=1 && n <= 100) {
                    for (int j = 1; j <= n ;j++) {
                        factorial = factorial.multiply(new BigInteger(String.valueOf(j)));
                    }
                }
                System.out.println(factorial);
            }
        }
    }

}
