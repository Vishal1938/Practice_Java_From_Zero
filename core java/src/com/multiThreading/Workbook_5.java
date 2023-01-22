package com.multiThreading;

public class Workbook_5 {
    public static void main(String[] args) {
        HelloJTC2 h=new HelloJTC2();
        new MyThread1(h,"A");
        new MyThread2(h,"B");
    }
}
class HelloJTC2{
    synchronized void m1(){
        for(int i=0;i<=5;i++) {
            System.out.println("m1-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
    synchronized void m2() {
        for (int i = 10; i <= 15; i++) {
            System.out.println("m2-" + i);
        }
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){

        }
    }
}
class MyThread1 implements Runnable {
    HelloJTC2 h = null;

    MyThread1(HelloJTC2 h, String name) {
        this.h = h;
        Thread t1 = new Thread(this, name);
        t1.start();
    }

    public void run() {
        h.m1();
    }
}
class MyThread2 implements Runnable {
    HelloJTC2 h = null;

    MyThread2(HelloJTC2 h, String name) {
        this.h = h;
        Thread t1 = new Thread(this, name);
        t1.start();
    }

    public void run() {
        h.m2();
    }
}