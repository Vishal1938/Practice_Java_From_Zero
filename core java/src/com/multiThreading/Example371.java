package com.multiThreading;

public class Example371 {
    public static void main(String[] args) {
        Stack st=new Stack();
        A1 obj1=new A1(st,"A");
        B1 obj2=new B1(st,"B");
    }
}
class Stack{
    int x;
    boolean flag=false;
    public synchronized void push(int x){
        if(flag){
            try{
                System.out.println("Thread A1 is going into waiting state and releasing the lock.....");
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        this.x=x;
        System.out.println(x+" is pushed......");
        flag=true;
        notify();
        System.out.println("Notifying the waiting thread-B1");
    }
    synchronized public int pop(){
        if(!flag){
            try{
                System.out.println("Thread B1 is going into waiting state and releasing the lock.....");
                wait();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println(x+" is poped");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        flag=false;
        System.out.println("Notifying the waiting thread-A1");
        notify();
        return x;
    }
}
class A1 implements Runnable{
    Stack st=null;
    A1(Stack st,String name){
        this.st=st;
        Thread t1=new Thread(this,name);
        t1.start();
    }
    public void run(){
        int a=1;
        for(int i=0;i<7;i++) {
            st.push(a++);
        }
    }
}
class B1 implements Runnable {
    Stack st = null;
    B1(Stack st, String name) {
        this.st = st;
        Thread t2 = new Thread(this, name);
        t2.start();
    }
    public void run() {
        for (int i = 0; i < 7; i++) {
            st.pop();
        }
    }
}