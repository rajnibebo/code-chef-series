package com.rajni.codechef.contest;

import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n <= 1000 && n >= 2) {
            for (int i = 10 ; i >= 1; i-- ) {
                if(n % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
