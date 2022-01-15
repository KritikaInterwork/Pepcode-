package com.functions;
import java.util.*;
public class DigFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int n, int d) {
        int counter = 0;
        while (n > 0)
        {
            int temp = n % 10;
            n = n / 10;
            if (temp == d)
                counter++;
        }
        return counter;
    }
}