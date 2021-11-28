package com.rajni.codechef.beginner;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0 ; i < testCases; i++) {
            int a = scanner.nextInt();
            int reverseNumber = 0;
            while (a != 0 ) {
                int lastDigit = a % 10;
                reverseNumber = reverseNumber*10 + lastDigit;
                a /= 10;
            }
            System.out.println(reverseNumber);
        }
    }
}
