package com.pattern;

import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            //System.out.println(st +","sp + "," + st);
            for (int j = 1; j <= n; j++) {
                if (i == j||i+j==n+1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

