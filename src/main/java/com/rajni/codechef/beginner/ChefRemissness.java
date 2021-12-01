package com.rajni.codechef.beginner;

import java.util.Scanner;

public class ChefRemissness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0 ; i < testCases; i++) {
            int guardACount = scanner.nextInt();
            int guardBCount = scanner.nextInt();

            System.out.println(Math.max(guardACount, guardBCount) + " "+ (guardACount + guardBCount) );
            System.out.println();
        }
    }
}
