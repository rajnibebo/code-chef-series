package com.rajni.codechef.beginner;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] sumArray = new int[testCases];
        for (int i = 0 ; i < testCases; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            sumArray[i] = a + b ;
        }

        for (int i = 0; i < testCases; i++) {
            System.out.println(sumArray[i]);
        }
    }
}
