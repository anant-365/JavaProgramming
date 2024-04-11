package com.company;
class parent
{
    public parent(int a,int b){
        System.out.println("im constructor of parent class"+" "+(a+b));
    }
    public parent(){
        System.out.println("im constructor of parent class");
    }
    public void get2(){
        System.out.println("im parent class and method 1");
    }
    public void get2(int a){
        System.out.println("im parent class and method 1"+a);
    }
}

class child extends parent{
    public child(){
        super(2,3);
        System.out.println("im constructor of child class");
    }
    @Override
     public void get2(){
        System.out.println("im child class method 1");
    }
}

public class CWH_26_inheritance {
    public static void main(String[] args) {
         child obj= new child();
         obj.get2();

    }
}
