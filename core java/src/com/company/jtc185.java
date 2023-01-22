package com.company;
interface XXX{
    void run();
    void start();
}
class yourThread extends Thread implements XXX{
    public yourThread(){
        super();
        run();
    }
    public void start(){
        System.out.println("Run in hello");
        System.out.println(Thread.currentThread().getName());
    }
    void m1(){
        System.out.println("m1 in hello");
        Thread t1=new Thread(this);
        t1.start();
    }
}
public class jtc185 {
    public static void main(String[] args) {
        yourThread y1=new yourThread();
        y1.m1();
        //y1.start();
    }
}
