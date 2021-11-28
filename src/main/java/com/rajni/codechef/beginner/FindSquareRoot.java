package com.rajni.codechef.beginner;

import java.math.BigInteger;
import java.util.Scanner;

public class FindSquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int num = scanner.nextInt();
            double sqrt = Math.sqrt(num);
            System.out.println(Math.round(sqrt));
        }
    }
}
