package com.rajni.codechef.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        int[] sortedArray = new int[testCases];
        for (int i = 0 ; i < testCases ; i++) {
            int n = scanner.nextInt();
            sortedArray[i] = n;

        }
        Arrays.sort(sortedArray);
        for(int n : sortedArray) {
            System.out.println(n);
        }

    }

}
