package com.functions;

import java.util.*;

public class BtoB{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int base1= scn.nextInt();//given
        int base2= scn.nextInt();//required

        System.out.println(getValue(n,base1,base2));
    }
    public static int getValue(int n, int base1 ,int base2){
        int dec=getValueInDecimal(n,base1);
        int base=getValueInBase(dec,base2);
        return base;

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
    public static int getValueInBase(int n,int b){
        int val=0;
        // 10^0=1
        int power=1;
        while (n>0) {
            int dig = n % b;
            n = n / b;

            val += dig * power;
            power *=10;
        }
        return val;
    }
}