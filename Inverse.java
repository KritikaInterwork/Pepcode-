package com.company;
import java.util.Scanner;
public class Inverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        //p 1 2 3 4 5   inv p 1 2 3 4 5  index value are from last
        //d 3 5 4 1 2   inv d 4 5 1 3 2  (originals place is inverse's digit and vice versa)
        // no 21453%10=3 i.e. 1 on 3pos 1*100,again 2145%10=5 i.e 2 on pos5 2*10000 and so on
        int inv=0;
        int op=1;
        while(n!=0){
            int od=n%10;
            int id=op;
            inv=inv+id*(int)Math.pow(10, od -1);
            n=n/10;
            op++;
        }
        System.out.println(inv);
    }
}
