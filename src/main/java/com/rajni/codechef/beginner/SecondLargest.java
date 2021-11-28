package com.rajni.codechef.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0 ; i < testCases ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int[] sortedArray = {a, b, c};
            Arrays.sort(sortedArray);
            System.out.println(sortedArray[1]);
        }
    }
}
