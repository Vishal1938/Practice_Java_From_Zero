package com.multiThreading;

public class Deadlock extends Thread{
 /*   A1 a=new A1();
    B1 b=new B1();
    public void m1(){
        this.start();
        a.d1(b);//this line is executed by main thread and main thread has lock of object a
    }
    public void run(){
        b.d2(a);//this line is executed by child thread abd child thread has lock of
        // object b
    }
    public static void main(String[] args){
        Deadlock d=new Deadlock();
        d.m1();
    }
}
class A1{
    public synchronized void d1(B1 b){
        System.out.println("Thread 1 starts execution of d1() method");
        try{
            Thread.sleep(6000);
        }catch (InterruptedException e){
        }
        System.out.println("Thread 1 is trying to call B's last method");
        b.last();
    }
    public  synchronized void last(){
        System.out.println("Inside A, this is last() method");
    }
}
class B1{
    public synchronized void d2(A1 a){
        System.out.println("Thread 2 starts execution of d2() method");
        try {
            Thread.sleep(6000);
    }catch (InterruptedException e){
        }
        System.out.println("Thread2 trying to call A's last()");
        a.last();
    }
    public synchronized void last(){
        System.out.println("Inside B, this is last() method");
    }*/
}