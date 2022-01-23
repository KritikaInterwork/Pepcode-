package com.company;
public class Binary {
    public static void main(String[] args) {
        Binary ob = new Binary();
        ob.fun1(1);
    }
         int fun1(int n){
            if (n == 1)
                return 0;
            else
                return 1 + fun1(n / 2);
        }
    }

