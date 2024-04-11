package com.company;
class parent2
{
    public parent2(int a,int b){
        System.out.println("im constructor of parent class"+" "+(a+b));
    }
    public parent2(){
        System.out.println("im constructor of parent class");
    }
    public void get2(){
        System.out.println("im parent class and method 1");
    }
    public void get2(int a){
        System.out.println("im parent class and method 1"+a);
    }
    public void parent3(){
        System.out.println("im parent3 method of parent2 class");
    }
}

class child2 extends parent2{
    public child2(){
        super(2,3);
        System.out.println("im constructor of child class");
    }
    @Override
    public void get2(){
        System.out.println("im child class method 1");
    }
}
public class CWH_27_dynamicMethodDispatch {
    public static void main(String[] args) {
        parent2 obj27= new child2(); /* PARENT2 TYPE OBJECT OF CHILD2 CLASS.*/
        obj27.get2();  /*ALLOWED*/
//        obj27.child2();  NOT ALLOWED
        obj27.parent3(); /*ALLOWED*/

    }
}
