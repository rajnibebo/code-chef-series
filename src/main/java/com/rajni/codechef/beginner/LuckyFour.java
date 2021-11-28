package com.rajni.codechef.beginner;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] frequencyOfFour = new int[testCases];
        if(testCases >=1 && testCases <= 100000) {
            for (int i = 0 ; i < testCases; i++) {
                int a = scanner.nextInt();
                while (a != 0) {
                    int last = a % 10;
                    if(last == 4) {
                        frequencyOfFour[i]++;
                    }
                    a/=10;
                }
            }
        }

        for (int frequency : frequencyOfFour) {
            System.out.println(frequency);
        }
    }
}
