package com.company;
import java.util.*;
public class GetStairPath {
    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            ArrayList< String> paths = getStairPaths(n);
            System.out.println(paths);
        }

        public static ArrayList< String> getStairPaths(int n) {
            if (n == 0) {
                ArrayList< String> brs = new ArrayList< >();
                brs.add("");
                return brs;
            } else if (n < 0) {
                ArrayList< String> brs = new ArrayList< >();
                return brs;
            }

            ArrayList< String> path1 = getStairPaths(n - 1);
            ArrayList< String> path2 = getStairPaths(n - 2);
            ArrayList< String> path3 = getStairPaths(n - 3);

            ArrayList< String> paths = new ArrayList< >();

            for (String path : path1) {
                paths.add("1" + path);
            }
            for (String path : path2) {
                paths.add("2" + path);
            }
            for (String path : path3) {
                paths.add("3" + path);
            }
            return paths;                                           //5

        }

    }

