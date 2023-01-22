package com.multiThreading;

public class ThreadJoinDemo1 {
    public static void main(String[] args) throws InterruptedException{
        MyThred222.mt  =Thread.currentThread();
        MyThred222 t =new MyThred222();
        t.start();
        t.join();
        for (int i=0;i<5;i++){
            System.out.println("Executed by :"+Thread.currentThread().getName());
            Thread.sleep(2000);
        }
    }
}
class MyThred222 extends Thread{
    static Thread mt;
    public void run(){
        try{
            mt.join();
        }catch (InterruptedException e){}
            for (int i=0;i<5;i++){
                System.out.println("Executed by :"+Thread.currentThread().getName());
            }
        }
}//Situation like deadlock will be occured.
//                          DONE COMPLETELY