package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class DAA_16_insertionSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int i,key;
        int []arr1=new int[n];
        for(i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=1;j<n;j++){
            key=arr1[j];
            i=j-1;
            while(i>-1 && arr1[i]>key){
                arr1[i+1]=arr1[i];
                i=i-1;
            }
            arr1[i+1]=key;

        }
        System.out.println("Sorted Array:"+Arrays.toString(arr1));
    }
}
