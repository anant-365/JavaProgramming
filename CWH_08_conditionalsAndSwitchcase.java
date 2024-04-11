package com.company;
import java.util.Scanner;
public class CWH_08_conditionalsAndSwitchcase {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt(),num2=sc.nextInt();
        if(num1%2==0&&num2%2==0) {
            System.out.println("both are even");
        }
        else {
            System.out.println("one of them is odd");
        }
        switch (num1){
           case 2-> System.out.println("even");
           case 3-> System.out.println("odd");
           default -> System.out.println("unmatched");
        }
    }
}
