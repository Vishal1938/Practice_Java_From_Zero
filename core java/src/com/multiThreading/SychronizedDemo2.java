package com.multiThreading;

public class SychronizedDemo2 {
    public static void main(String[] args) {
        XX d=new XX();
        MyThread22 t1=new MyThread22(d,"main1");
        MyThread22 t2=new MyThread22(d,"main2");
        t1.start();
        t2.start();
    }
}
class XX{
    static synchronized void m1(){
        System.out.println("Static Sychronized1 ");
    }
    static synchronized void m2(){
        System.out.println("Static Sychronized2");
    }
    static void m3(){
        System.out.println("Static Sychronized");
    }
    synchronized void m4(){
        System.out.println("Sychronized");
    }
    void m5(){
        System.out.println("instance Methode");
    }
}
class MyThread22 extends Thread{
    XX d;
    String st;
    MyThread22(XX d,String st){
        this.d=d;
        this.st=st;
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            d.m1();
            d.m2();
            d.m3();
            d.m4();
            d.m5();
        }
    }
}