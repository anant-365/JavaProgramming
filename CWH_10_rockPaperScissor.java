package com.company;
import java.util.Random;
import java.util.Scanner;
public class CWH_10_rockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Rock 2 for Paper 3 for scissor");
        int inp=sc.nextInt();
        Random rand = new Random();
        int max=3,min=1;
        int comp=rand.nextInt(max - min + 1) + min;
        System.out.println("Computer's input is:"+comp+" User's input is:"+inp);
        if(comp==1&&inp==1)
            System.out.println("Tie,rock rock");
        else if(comp==1&&inp==2)
            System.out.println("u win,rock paper");
        else if(comp==1&&inp==3)
            System.out.println("comp win,rock scissor");
        else if(comp==2&&inp==1)
            System.out.println("comp win, paper rock");
        else if(comp==2&&inp==2)
            System.out.println("Tie, paper paper");
        else if(comp==2&&inp==3)
            System.out.println("u win,paper scissor");
        else if(comp==3&&inp==1)
            System.out.println("u win, scissor rock");
        else if(comp==3&&inp==2)
            System.out.println("comp win,scissor paper");
        else if(comp==3&&inp==3)
            System.out.println("Tie, scissor scissor");
        else
            System.out.println("invalid input by user");
    }
}
