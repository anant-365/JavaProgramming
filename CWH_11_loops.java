package com.company;

public class CWH_11_loops {
    public static void main(String[] args) {
        int i;
//        for loop:
        for (i=0;i<=10;i++)
            System.out.println(i);
        i=0;
//        while loop:
        while (i<=10)
        {
            System.out.print(i+" ");
            i++;
        }
        i=0;
//         Do while loop:
        do{
            System.out.println("\n"+i);
        }while (i!=0);
    }
}
