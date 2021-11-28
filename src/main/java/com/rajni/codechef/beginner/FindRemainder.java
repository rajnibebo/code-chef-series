package com.rajni.codechef.beginner;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        int[] remainderArray = new int[numberOfTests];
        if (numberOfTests >= 1 && numberOfTests <= 1000) {
            for (int i = 0 ; i < numberOfTests; i++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                if(a >=1 && b >= 1 && a <= 10000 && b <= 10000) {
                    remainderArray[i] = a%b;
                }
            }
        }

        for (int remainder: remainderArray) {
            System.out.println(remainder);
        }
    }
}
