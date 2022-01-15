package com.company;
import java.util.Scanner;
public class CountDig {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int dig=0,n= scn.nextInt();
        while(n!=0){
            n=n/10;
            dig++;
        }
        System.out.println(dig);
    }
}
