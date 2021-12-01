package com.rajni.codechef.beginner;

import java.util.Scanner;

public class ValidTriangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        for (int i = 0 ; i < testCases ; i++) {
            int firstSide = scanner.nextInt();
            int secondSide = scanner.nextInt();
            int thirdSide = scanner.nextInt();
            if((firstSide + secondSide + thirdSide) == 180) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
