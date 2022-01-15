package com.arrays;

import java.util.Scanner;

public class Spiral {
    public static void main(String[] args)throws Exception{
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int m = scn.nextInt();
        int[][]arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int minr =0;
        int minc =0;
        int maxr= arr.length-1;
        int maxc=arr[0].length-1;
        int tne=m*n;
        int cnt=0;
        while(cnt<tne){
            //left wall
for(int i=minr,j=minc;i<=maxr&&cnt<tne;i++){
    System.out.println(arr[i][minc]);
    cnt++;
}
minc++;
            //bottom wall
            for(int j=minc,i=maxr;j<=maxc && cnt<tne;j++) {
                System.out.println(arr[maxr][j]);
                cnt++;
            }
            maxr--;
            //right
                for(int i=maxr,j=maxc;i>=minr && cnt<tne;i--) {
                    System.out.println(arr[i][maxc]);
                    cnt++;
                }
                maxc--;
            //top
                    for(int i=minr,j=maxc;j>=minc && cnt<tne;j--){
                        System.out.println(arr[minr][j]);
                        cnt++;
        }
                    minr++;
        }

    }
}
