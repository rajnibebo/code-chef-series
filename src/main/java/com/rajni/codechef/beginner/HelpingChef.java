package com.rajni.codechef.beginner;

import java.util.Scanner;

public class HelpingChef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        if(testCases <= 1000 && testCases >= 1) {
            for (int i = 0 ; i < testCases ; i++) {
                int n = scanner.nextInt();
                if(n < 10) {
                    System.out.println("Thanks for helping Chef!");
                } else {
                    System.out.println("-1");
                }
            }
        }
    }
}
