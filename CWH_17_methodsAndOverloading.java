package com.company;
import java.util.Arrays;
public class CWH_17_methodsAndOverloading {

//    we can also make fn as, static int sum(int a, int b){ fn body code}, then we don't need to create object we can
//    directly call the function sum() as, int c= sum(x,y), [in line 14].

//    static word associates the method with class else without static copy of method is created in
//    all class objects if created , so if we're not using static word we can create object of class
//    and call the fn with that object.

     void sum(int a,int []arr){
        a=1;
        arr[0]=88;
    }
    public static void main(String[] args) {
        int x=30;
        int [] y={1,2,3,4,5};
        CWH_17_methodsAndOverloading obj=new CWH_17_methodsAndOverloading();
         obj.sum(x,y);
        System.out.println("x: "+x+" , Array y: "+Arrays.toString(y));

//        Object's [eg-Arrays] values can be changed by changing value of function parameter inside scope of
//        that function [A reference of object is passed as fn argument].

//        On other side,

//        the values of variable can't be changed by changing the value of function parameter inside
//        scope of that function [A copy of variable is passed as fn argument].

//        NOTE: ARGUMENTS ARE ACTUAL.


//        METHOD OVERLOADING:

//            static void foo(){
//                System.out.println("Good Morning bro!");
//            }
//
//            static void foo(int a){
//                System.out.println("Good morning " + a + " bro!");
//            }
//
//            static void foo(int a, int b){
//                System.out.println("Good morning " + a + " bro!");
//                System.out.println("Good morning " + b + " bro!");
//            }
//
//            static void foo(int a, int b, int c){
//                System.out.println("Good morning " + a + " bro!");
//                System.out.println("Good morning " + b + " bro!");
//            }
//
//            static void change(int a){
//                a = 98;
//            }
//
//            static void change2(int [] arr){
//                arr[0] = 98;
//            }
//            static void tellJoke(){
//                System.out.println("I invented a new word!\n" +
//                        "Plagiarism!");
//            }
//                // tellJoke();
//
//                // Case 1: Changing the Integer
//                //int x = 45;
//                //change(x);
//                //System.out.println("The value of x after running change is: " + x);
//
//                // Case 1: Changing the Array
//                // int [] marks = {52, 73, 77, 89, 98, 94};
//                // change2(marks);
//                // System.out.println("The value of x after running change is: " + marks[0]);
//
//
//                // Method Overloading
//                foo();
//                foo(3000);
//                foo(3000, 4000);
//                // Arguments are actual!

    }
}
