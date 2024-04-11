package com.company;

abstract class telephone{
     abstract void ring();
     abstract void lift();
     abstract void disconnect();
}
class smart_telephone extends telephone implements smartTvRemote{
    @Override
    public void ring() {
        System.out.println("ringing...");
    }

    @Override
    public void lift() {
        System.out.println("lifted");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected...");
    }

    public void android() {
        System.out.println("Im android device");
    }

    @Override
    public void voiceControl() {
        {}
    }

    @Override
    public void signal() {
        {}
    }
}
     interface tvRemote{
        void signal();
    }
    interface smartTvRemote extends tvRemote{
        void voiceControl();
    }


public class CWH_31_Practice_abstractClass_Interface {
    public static void main(String[] args) {
        telephone obj31=new smart_telephone();
        obj31.ring();
//        obj31.android(); polymorphism example
//        obj31.voiceControl();
    }
}
