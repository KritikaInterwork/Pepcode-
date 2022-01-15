package com.company;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int rem,n= scn.nextInt();
        while(n>0){
            rem=n%10;
            n=n/10;
            System.out.print(rem);

        }
    }
}
