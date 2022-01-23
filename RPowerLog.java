package com.company;

import java.util.Scanner;

public class RPowerLog {
    public static void main(String[] args) throws Exception{
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int p= scn.nextInt();
        System.out.println(powerlog(n, p));
    }
    public static int powerlog(int n,int p){
        if (p==0){
            return 1;
        }
        int pon2=powerlog(n,p/2);
        int pon = pon2 * pon2;
        if(p % 2==1){
            pon=pon*n;
        }
        return pon;

    }
}
