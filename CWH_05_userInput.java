package com.company;
import java.util.Scanner;

public class CWH_05_userInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 number:");
        int a=sc.nextInt();
        System.out.println("Enter 2 number:");
        float b=sc.nextFloat();
        System.out.println(a+b);
        System.out.println("Enter any number");
        boolean c=sc.hasNextBoolean();
        System.out.println(c);
    }
}
