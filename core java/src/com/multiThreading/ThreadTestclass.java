package com.multiThreading;

public class ThreadTestclass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        CreateThread t1=new CreateThread();
        System.out.println(t1.getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(8);
        Thread.currentThread().setName("Vishal singh");
        System.out.println(Thread.currentThread().getName());
        t1.start();
        System.out.println(Thread.currentThread().getPriority());
        //System.out.println(10/0);
        //t1.start();
        System.out.println("Main thread");
    }
}
class CreateThread extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Executed by :"+Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            Thread.currentThread().setPriority(6);
            Thread.currentThread().setName("Lucky Singh");
            System.out.println(Thread.currentThread().getName());
            //System.out.println(10/0);
        }
    }
}// Done Completely