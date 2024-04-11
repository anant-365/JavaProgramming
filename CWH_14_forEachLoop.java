package com.company;

public class CWH_14_forEachLoop {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1]=3;
        arr[2]=4;
        arr[3]=4;
        arr[4]=5;
        for(int element:arr){
            System.out.println(element);
        }
    }
}
