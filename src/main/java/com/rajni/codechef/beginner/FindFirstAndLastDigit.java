package com.rajni.codechef.beginner;

import java.util.Scanner;

public class FindFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCases = scanner.nextInt();
        int[] sumArray = new int[totalCases];
        if(totalCases >=1 && totalCases <= 1000) {
            for (int i = 0 ; i < totalCases; i++) {
                int a = scanner.nextInt();
                if (a >= 1 && a <= 1000000) {
                    int lastDigit = a % 10;
                    int firstDigit = 0;
                    while (a != 0) {
                        firstDigit = a;
                        a/=10;
                    }
                    sumArray[i] = firstDigit + lastDigit;
                }
            }
        }

        for (int sum: sumArray) {
            System.out.println(sum);
        }

    }
}
