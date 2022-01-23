package com.company;
import java.util.Scanner;
public class PrintSubSeq {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSSeq(str, "");
    }

    public static void printSSeq(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String rq = ques.substring(1);
        printSSeq(rq, ans + ch);
        printSSeq(rq, ans + "");
    }

}
