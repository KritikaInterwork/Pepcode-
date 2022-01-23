package com.company;

public class Fiboncci {
     static int a=0,b=1,c;
     public static void main(String[] args){
         System.out.println(a);
         System.out.println(b);
         Fiboncci ob=new Fiboncci();
         ob.printFib(11);
     }
      void printFib(int i){
         if(i>=1){
             c=a+b;
             System.out.println(""+c);
             a=b;
             b=c;
             printFib(i-1);
         }
      }
}
