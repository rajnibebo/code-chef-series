package com.rajni.codechef.beginner;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0 ; i < testCases ; i++) {
            int n = scanner.nextInt();
            boolean isPrime = true;
            if(n == 1) {
                System.out.println("no");
                continue;
            }
            if(n <= 3) {
                System.out.println("yes");
                continue;
            }

            if(n % 2 ==0 || n%3 == 0) {
                System.out.println("no");
                continue;
            }

            for (int j = 5; j <= Math.sqrt(n) ; j++) {
                if(n % j == 0 || n %(i +2) == 0) {
                    isPrime = false;
                    System.out.println("no");
                    break;
                }
            }
            if(isPrime) {
                System.out.println("yes");
            }
        }
    }
}
