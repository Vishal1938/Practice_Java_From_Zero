package com.company;
class Mythread extends Thread implements Runnable{
    void m1(){
        System.out.println("M1 in MyThread");
        String tname="Jtc-ch";
        Thread t1=new Thread(this);
        Thread t2=new Thread(this,tname);
        t1.start();
        t2.start();
    }
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            try{
                sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class jtc184 {
    public static void main(String[] args) {
        Mythread mt=new Mythread();
        mt.m1();
    }
}
