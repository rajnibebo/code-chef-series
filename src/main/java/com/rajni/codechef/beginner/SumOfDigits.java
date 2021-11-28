package com.rajni.codechef.beginner;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] sumOfDigitsArray = new int[number];
        if(number >= 1 && number <= 1000) {
            for (int i = 0; i < number; i++) {
                int a = scanner.nextInt();
                if(a >= 1 && a <= 1000000) {
                    int sum = 0;
                    while (a != 0) {
                        sum += a % 10;
                        a = a/10;
                    }
                    sumOfDigitsArray[i] = sum;
                }
            }
        }

        for (int j : sumOfDigitsArray) {
            System.out.println(j);
        }

    }
}
