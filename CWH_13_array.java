package com.company;

import java.util.Arrays;

public class CWH_13_array {
    public static void main(String[] args) {
//        declaration and memory allocation
        int []arr=new int [5];
//        initialisation
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(arr[3]);

//        declaration and initialization
        int []arr2= {6,7,8,9,10};
        System.out.println(arr2[3]);

        String []arr3={"anant","pandey","boy"};
        System.out.println(Arrays.toString(arr3));

        // Displaying the Array (for loop)
        
//        System.out.println("Printing using for loop");
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)

//        System.out.println("Printing using for loop in reverse order");
//        for(int i=marks.length -1;i>=0;i--){
//            System.out.println(marks[i]);
//        }

    }
}
