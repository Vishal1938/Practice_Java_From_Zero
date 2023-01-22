package com.multiThreading;

public class ThreadSleepDemo1 {
    public static void main(String[] args) {
       MyThread555 t=new MyThread555();
       t.start();
       t.interrupt();
        System.out.println("End of Main metode");
    }
}
class MyThread555 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("I am lazy Thread");
        }
        System.out.println("I am Entering into sleeping state");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("I got interrupted");
        }
    }
}   /*o/p :End of Main metode
    I am lazy Thread
    I am lazy Thread
    I am lazy Thread
    I am lazy Thread
    I am lazy Thread
    I am Entering into sleeping state
    I got interrupted*/
