package com.company;
abstract class Parent29{
    public Parent29(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet29();
    abstract public void greet29_2();
}

class Child29 extends Parent29{
    @Override
    public void greet29(){
        System.out.println("Good morning");
    }
    @Override
    public void greet29_2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent29{
    public void th(){
        System.out.println("I am good");
    }
}
public class CWH_29_abstractClasses_Methods {
    public static void main(String[] args) {
        //Parent2 p = new Parent2(); -- error
        Child29 c = new Child29();
        //Child3 c3 = new Child3(); -- error
    }
//    Abstract in English means existing in through or as an idea without concrete existence.
//
//    Abstract class :
//    An abstract class cannot be instantiated.
//    Java requires us to extend it if we want to access it.
//    It can include abstract and non-abstract methods.
//    If a class includes abstract methods, then the class itself must be declared abstract,
//
//    Abstract class are used when we want to achieve security & abstraction(hide certain
//    details & show only necessary details to the user)

}
