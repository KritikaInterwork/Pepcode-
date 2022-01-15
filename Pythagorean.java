package com.company;
import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int h=a;

        if(b>=a);{
            h = b;
        }
        if (c>=a);{
            h=c;
        }
        if(h==a){
            boolean flag=((b*b+c*c)==(a*a));
            System.out.println(flag);
          // if(b*b+c*c==a*a)
            //System.out.println(b*b+c*c==a*a);
        }
        else if (h==b){
            boolean flag=((a*a+c*c)==(b*b));
            System.out.println(flag);
            //if(a*a+c*c==b*b)
              //  System.out.println(a*a+c*c==b*b);
        }
         else{
            boolean flag=((b*b+a*a)==(c*c));
            System.out.println(flag);
            //if(b*b+a*a==c*c)
              //  System.out.println(b*b+a*a==c*c);
         }

    }
}
