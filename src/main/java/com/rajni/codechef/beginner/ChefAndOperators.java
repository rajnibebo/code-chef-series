package com.rajni.codechef.beginner;

import java.util.Scanner;

public class ChefAndOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0 ; i < testCases ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                System.out.println("<");
            } else if (a > b) {
                System.out.println(">");
            } else {
                System.out.println("=");
            }
        }
    }
}
