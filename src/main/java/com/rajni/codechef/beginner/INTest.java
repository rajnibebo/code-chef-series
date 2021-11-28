package com.rajni.codechef.beginner;

import java.util.Scanner;

public class INTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[numbers];
        int countOfKDivisible = 0;


        if(k <= Math.pow(10, 7)) {
            for (int i = 0 ; i < numbers; i++) {
                int next = scanner.nextInt();
                if(next < Math.pow(10, 9)) {
                    array[i] = next;
                    if(array[i] % k == 0) {
                        countOfKDivisible++;
                    }
                }

            }

        }
        System.out.println(countOfKDivisible);
    }
}
