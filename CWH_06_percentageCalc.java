package com.company;
import java.util.Scanner;

public class CWH_06_percentageCalc {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ALL MARKS ARE OUT OF HUNDRED");
        System.out.println("Enter marks of first subject:");
        int num1= sc.nextInt();
        System.out.println("Enter marks of second subject:");
        int num2= sc.nextInt();
        System.out.println("Enter marks of third subject:");
        int num3= sc.nextInt();
        System.out.println("Enter marks of fourth subject:");
        int num4= sc.nextInt();
        System.out.println("Enter marks of fifth subject:");
        int num5= sc.nextInt();
        double percent=((double) (num1 + num2 + num3 + num4 + num5) /500)*100;
        System.out.print(percent+"%");
    }
}
