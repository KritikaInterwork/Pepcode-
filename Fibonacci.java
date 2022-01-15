package com.company;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int x=0,y=1,z;
        for(int i=0;i<15;i++){
            z=x+y;
            System.out.println(+z);
            x=y;
            y=z;
        }
    }
}
