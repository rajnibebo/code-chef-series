package com.rajni.codechef.beginner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LeadGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = scanner.nextInt();
        int maxLead = -1;
        int leadPlayer = -1;
        int playerOneScore = 0;
        int playerTwoScore = 0;
        for (int i = 0 ; i < rounds ; i++) {
            int siScore = scanner.nextInt();
            int tiScore = scanner.nextInt();

            playerOneScore += siScore;
            playerTwoScore += tiScore;

            int lead = playerOneScore - playerTwoScore;
            if(Math.abs(lead) > maxLead) {
                maxLead = Math.abs(lead);
                leadPlayer = lead > 0 ? 1 : 2;
            }

        }
        System.out.println(leadPlayer +" "+maxLead);
    }
}
