package com.rajni.codechef.beginner;

import java.util.Scanner;

public class PackagingCupcakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases != 0) {
            int n = scanner.nextInt();
            System.out.println((n/2) + 1);
            testCases--;
        }
    }
}
