package com.company;
import java.util.Scanner;
public class Program2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter percentage marks");
        double percentage = scan.nextDouble();

        if(percentage >= 90){
            System.out.println("Excellent: Grade A");
        }else if(percentage < 90 && percentage >= 80){
            System.out.println("Good: Grade B");
        }else if(percentage < 80 && percentage >= 70){
            System.out.println("Fair: Grade C");
        }else if(percentage < 70 && percentage >= 60){
            System.out.println("meets expectations: Grade D");
        }else if(percentage < 60 && percentage >= 50){
            System.out.println("Below par: Grade E");
        }else if(percentage < 50 && percentage >= 40){
            System.out.println("Just Passed: Grade F");
        }else {
            System.out.println("Failed!");
        }


    }
}
