package com.company;
import java.util.*;
public class GetSubSeq {

    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            String str = scn.next();
            ArrayList<String> res = gss(str);
            System.out.println(res);
        }
        //bc -  --,-c ,b-,bc
        //abc-  ---,--c, -b-, -bc, a--,ab-,abc

        public static ArrayList<String> gss(String str) {
            if (str.length() == 0) {
                ArrayList<String> brs = new ArrayList<>();
                brs.add("");
                return brs;
            }
            char ch = str.charAt(0);
            String ros = str.substring(1);

            ArrayList<String> rrs = gss(ros);
            ArrayList<String> mrs = new ArrayList<>();
            for (String val : rrs) {
                mrs.add("" + val);
            }
            for (String val : rrs) {
                mrs.add(ch + val);
            }

            return mrs;
        }
}
