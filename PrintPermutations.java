package com.company;
import java.util.Scanner;
public class PrintPermutations {


    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        printPermutations(str, "");

    }

    public static void printPermutations(String str, String asf) {

        if (str.length() == 0)
        {
            System.out.println(asf);
            return ;
        }
        //Extract each chr
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String leftPart = str.substring(0, i); // 0 to i-1 (left to ch)
            String rightPart = str.substring(i + 1);// i+1 to end String (right to ch)
            String roq = leftPart + rightPart; //Remaining string
            printPermutations(roq, asf + ch);
        }

    }

}
