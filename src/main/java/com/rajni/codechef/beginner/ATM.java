package com.rajni.codechef.beginner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withdrawalAmount = scanner.nextInt();
        double balanceAmount = scanner.nextDouble();
        BigDecimal output = new BigDecimal(balanceAmount);
        if(withdrawalAmount <= 0 || (withdrawalAmount % 5) != 0 || withdrawalAmount + 0.5 > balanceAmount || (withdrawalAmount > 2000) || balanceAmount > 2000.0) {
            System.out.println(output.setScale(2, RoundingMode.HALF_UP));
            return;
        }

        BigDecimal bankCharges = new BigDecimal("0.5");
        output = output.subtract(new BigDecimal(withdrawalAmount)).subtract(bankCharges);
        System.out.println(output.setScale(2, RoundingMode.HALF_UP));
    }
}
