package com.company;
import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i, div, t = scn.nextInt();
        for ( i = 0; i < t; i++) {
            int n = scn.nextInt();
            for(div =2;div * div<=n;div++) {
                if (n % div == 0) {
                    break;
                }
            }
            if (div * div > n) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }

    }
}


