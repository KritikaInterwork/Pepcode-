package com.arrays;

import java.util.Scanner;

public class MatrixMul {
    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        int r1 = scn.nextInt();
        int c1 = scn.nextInt();
        int[][] M1 = new int[r1][c1];
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[0].length; j++) {
                M1[i][j] = scn.nextInt();
            }
        }
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int[][] M2 = new int[r2][c2];
        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2[0].length; j++) {
                M2[i][j] = scn.nextInt();
            }
        }
        if (c1 != r2) {
            System.out.println("Invalid");
            return;
        }
        int[][] MP = new int[r1][c2];
        for (int i = 0; i < MP.length; i++) {
            for (int j = 0; j < MP[0].length; j++) {
                for (int k = 0; k < c1 || k < r2; k++) {
                    MP[i][j] += M1[i][k] * M2[k][j];
                }
            }
        }
        for (int i = 0; i < MP.length; i++) {
            for (int j = 0; j < MP[0].length; j++) {
                System.out.print(MP[i][j] + " ");
            }
            System.out.println();
        }
    }

    }

