package com.multiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo4 {
    public static void main(String[] args) {
        OneThread t1=new OneThread("First Thread");
        OneThread t2=new OneThread("Second Thread");
        t1.start();
        t2.start();
    }
}
class OneThread extends Thread{
    static ReentrantLock l=new ReentrantLock();
    OneThread(String name){
        super(name);
    }
    public void run(){
        do {
            try {
                if (l.tryLock(3, TimeUnit.SECONDS)) {
                    System.out.println(Thread.currentThread().getName() + "____get lock");
                    Thread.sleep(15000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + "___release lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + "___unable to get lock and will" +
                            " try again");
                }
            } catch (Exception e) {

            }
        }while (true);
    }
}