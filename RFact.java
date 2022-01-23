package com.company;

import java.util.Scanner;

public class RFact {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int factnm1 = factorial(n - 1);
        int factn = n * factnm1;
        return factn;

    }
}




