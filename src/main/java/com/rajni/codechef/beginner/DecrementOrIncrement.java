package com.rajni.codechef.beginner;

import java.util.Scanner;

public class DecrementOrIncrement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0) {
            System.out.println(++n);
        } else {
            System.out.println(--n);
        }
    }
}
