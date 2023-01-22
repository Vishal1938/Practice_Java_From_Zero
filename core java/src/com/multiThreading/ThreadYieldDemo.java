package com.multiThreading;

public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread222 t=new MyThread222();
        t.start();
        Thread.yield();
        for (int i=0;i<5;i++){
            System.out.println("Executed by :"+Thread.currentThread().getName());
        }
    }
}
class MyThread222 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executed by :" + Thread.currentThread().getName());
            Thread.yield();
            }
    }
}//       Done Completely

