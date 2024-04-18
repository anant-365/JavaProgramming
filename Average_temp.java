package java_questions;
import java.util.Scanner;
public class Average_temp {
    public static void averageTemperature(int days){
        int [] temp = new int[days];
        int aboveAvg = 0;
        float avg,sum = 0;
        for(int i = 0; i<days; i++){
            System.out.println("Enter day"+" "+(i+1)+" "+" high temperature:");
            Scanner sc = new Scanner(System.in);
            temp[i] = sc.nextInt();
            sum = sum + temp[i];
        }
        avg = sum/days;
        for(int i = 0; i<days; i++){
            if(avg > temp[i]){
                aboveAvg++;
            }
        }
        System.out.println("Average: "+avg);
        System.out.println(aboveAvg+" day(s) above average");
    }
    public static void main(String[] args) {
        int days;
        System.out.println("Enter no. of days:");
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        averageTemperature(days);
    }
}
