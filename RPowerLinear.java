package com.company;

import java.util.Scanner;

public class RPowerLinear {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();//number
        int p= scn.nextInt();//power
        System.out.println(power(n,p));

    }
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
        int npm1=power(n,p-1); //n^p-1
        int npp= n*npm1;         //n^p
        return npp;
    }
}
