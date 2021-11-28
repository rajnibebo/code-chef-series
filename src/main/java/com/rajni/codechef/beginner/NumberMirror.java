package com.rajni.codechef.beginner;

import java.util.Scanner;

public class NumberMirror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number >= 0 && number <= Math.pow(10, 5))
            System.out.println(number);
        /*StringBuilder output = new StringBuilder();

        for (int i = 0 ; i < numbers; i++) {
            output.append(scanner.nextInt()).append(" ");
        }*/
       // System.out.println(output.substring(0, output.length() - 1));
    }
}
