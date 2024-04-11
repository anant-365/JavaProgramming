package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class CWH_15_arrayPractice {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

//        Problem 1: 1-d array input print and sum:

        int sum=0;
        System.out.println("Enter 5 array elements:");
        int []arr1= new int[5];
        for(int i=0;i<5;i++){
            arr1[i]=sc.nextInt();
            sum=sum+arr1[i];
        }
        System.out.println("The array is "+Arrays.toString(arr1)+" and the sum of this array is: "+sum);

//        Problem 2: 2-d array input print and sum.

//          int sum2=0;
//        System.out.println("Enter the elements if 2*3 array:");
//        int[][]arr2=new int[2][3];
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                arr2[i][j]=sc.nextInt();
//                sum2=sum2+arr2[i][j];
//            }
//        }
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(arr2[i][j]);
//            }
//            System.out.print("\n");
//        }
//        2-D array print using for each loop
//        for(int[]ints:arr2) {
//            System.out.println(Arrays.toString(ints));
//        }
//        System.out.println("The sum is "+sum2);

//        Problem3: Array searching:
//        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
//        float num = 45.57f;
//        boolean isInArray = false;
//        for(float element:marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//            System.out.println("The value is not present in the array");
//        }

//        Problem 4: matrices addition:

//        int sum2=0;
//        System.out.println("Enter the 6 elements 0f first 2*3 array:");
//        int[][]arr2=new int[2][3];
//        int[][]arr3=new int[2][3];
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                arr2[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("Enter the 6 elements 0f second 2*3 array:");
//
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++){
//                arr3[i][j]=sc.nextInt();
//            }
//        }
//
//        System.out.println("Addition:");
//        for(int i=0;i<2;i++){
//            for(int j=0;j<3;j++) {
//                arr2[i][j] = arr2[i][j] + arr3[i][j];
//                System.out.print(arr2[i][j]);
//            }
//            System.out.print("\n");
//        }

//        Problem 5: reverse an array
//        System.out.println("Enter the length of string");
//        int num5,n=sc.nextInt();
//        System.out.println("Enter the elements of string (Type element and press enter button of keyboard)");
//        int[]arr5=new int[n];
//        for(int i=0; i<n;i++){
//            arr5[i]=sc.nextInt();
//        }
//          for(int i=0,j=n-1;i<arr5.length/2;i++,j--){
//              num5=arr5[i];
//              arr5[i]=arr5[j];
//              arr5[j]=num5;
//          }
//        System.out.println(Arrays.toString(arr5));

//        Problem 6: To Find Maximum and Minimum element in an array:

//        System.out.println("Enter the length of string");
//        int num5,n=sc.nextInt();
//        System.out.println("Enter the elements of string (Type element and press enter button of keyboard)");
//        int[]arr6=new int[n];
//        for(int i=0; i<n;i++){
//            arr6[i]=sc.nextInt();
//        }
//        for(int i=0; i<n;i++){
//            if(i==5){
//                break;
//            }
//            if(arr6[i]>arr6[i+1]){
//                num5=arr6[i];
//                arr6[i]=arr6[i+1];
//                arr6[i+1]=num5;
//            }
//        }
//        for(int i=n-1;i>0;i--){
//            if(arr6[i]<arr6[i-1]){
//                num5=arr6[i];
//                arr6[i]=arr6[i-1];
//                arr6[i-1]=num5;
//            }
//        }
//        System.out.println("The largest integer in array is: "+arr6[n-1]);
//        System.out.println("The smallest integer in array is: "+arr6[0]);
//        System.out.println(Arrays.toString(arr6));




    }
}
