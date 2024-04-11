package com.company;

import java.util.Random;
import java.util.Scanner;

class random_number_game{
    private int comp_num;
    int user_num;
    private int num_guesses=1;
    private int score=20;
    public random_number_game(){
        Random rand= new Random();
        comp_num=rand.nextInt(100);
    }
//    }
    public void input_user_num(){
        Scanner sc= new Scanner(System.in);
        user_num=sc.nextInt();
    }
    public void calc_score(){
        while(comp_num!=user_num){
            System.out.println("Enter the number:");
            input_user_num();
            if(comp_num<user_num){
                System.out.println("Entered number is more");
            }
            else if (user_num>100||user_num<0) {
                System.out.println("Enter number is out of limit [EITHER TOO LARGER THAN 100 OR LESS THAN 0] ");
            }
            else if(comp_num>user_num) {
                System.out.println("Entered number is less");
            }
            else {
                continue;
            }
            num_guesses++;
            score--;
        }
        System.out.println("Computer generated num:"+comp_num+" user entered number:"+user_num);
        System.out.println("Great!! you guessed it correctly in "+num_guesses+" attempts "+" and Score is "+score+" out of 20");
    }
}
public class CWH_24_constructors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        random_number_game obj= new random_number_game();
        System.out.println("For every incorrect guess 1 mark will be deducted out of score of 20 marks\n Guess the number" +
                " correctly between 0 to 100");
        obj.calc_score();
    }

}
