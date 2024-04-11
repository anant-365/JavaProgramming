package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
    }
}
public class CWH_34_ThreadConstructor {
        public static void main(String[] args) {
            MyThr t2 = new MyThr("anant");
            t2.start();
            System.out.println("The id of the thread t is " + t2.getId());
            System.out.println("The name of the thread t is " + t2.getName());

        }
    }

