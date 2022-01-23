package com.functions;

import java.util.Scanner;

public class AnyBaseAdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        System.out.println(getAddition(b, n1, n2));
    }


    public static int getAddition(int b, int n1, int n2) {
        int val = 0, multiplier = 1, carry = 0;
        while (n1 > 0 || n2 > 0 || carry > 0) {
            int rem1 = n1 % 10;
            int rem2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int rem=rem1+rem2+carry;
            carry=rem/b;
            rem=rem%b;
            val +=rem*multiplier;
            multiplier*=10;
        }
        return val;
    }
}