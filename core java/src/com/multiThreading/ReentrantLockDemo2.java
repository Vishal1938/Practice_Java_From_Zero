package com.multiThreading;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo2 {
    public static void main(String[] args) {
        HisThread t1=new HisThread("First Thread");
        HisThread t2=new HisThread("second Thread");
        t1.start();
        t2.start();
    }
}
class HisThread extends Thread{
    static ReentrantLock l=new ReentrantLock();
    HisThread(String name){
        super(name);
    }
    public void run(){
        if(l.tryLock()) {
            System.out.println(Thread.currentThread().getName() + "__got lock and performing safeoperation");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
                l.unlock();

        }
            else{
                System.out.println(Thread.currentThread().getName()+"__unable to get the lock and hence" +
                        " perfoming else operation");
            }
        }
    }//           DONE COMPLETELY
