package com.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 {
    public static void main(String[] args) {
        Display77 d=new Display77();
        OurThread t1=new OurThread(d,"Ronaldo");
        OurThread t2=new OurThread(d,"messi");
        OurThread t3=new OurThread(d,"Neymar");
        t1.start();
        t2.start();
        t3.start();
    }
}
class Display77 {
    ReentrantLock l=new ReentrantLock();
    public void wish(String name){
        l.lock();
        for (int i=0;i<10;i++){
            System.out.println("good Mornniing");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
            }
            System.out.println(name);
        }
        l.unlock();
    }
}
class OurThread extends Thread{
    Display77 d;
    String name;
    OurThread(Display77 d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}//                          DONE COMPLETELY