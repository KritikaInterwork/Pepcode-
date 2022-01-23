package com.functions;

import java.util.*;

public class FuncBtoD {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(getValueInDecimal(n, b));
    }

    public static int getValueInDecimal(int n, int b) {
        int val = 0, multiplier = 1;
        while (n > 0)
        {
            int remainder = n % 10;
            n = n / 10;
            val = val+ remainder * multiplier;
            multiplier *= b;
        }
        return val;
    }
}