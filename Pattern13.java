package com.pattern;

import java.util.Scanner;

public class Pattern13 {
    //nCr concept
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=1;i<=n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp1=icj*(i-j)/(j+1);
                //nCr+1=[nCr*(n-r)]/(r+1)
                icj=icjp1;
            }
            System.out.println();
        }

    }
}
