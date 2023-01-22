package com;

public class SynchronizedDemo1 {
    public static void main(String[] args) {
        Display11 d=new Display11();
        MyThread1 t1=new MyThread1(d);
        MyThread2 t2=new MyThread2(d);
        t1.start();
        t2.start();
    }
}
class Display11{
    public synchronized void Displayn(){
        for (int i=0;i<=5;i++){
            System.out.print(i);
        }
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }
    public synchronized void Displayc(){
        for(int i=65;i<=75;i++){
            System.out.print((char)i);
        }try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("I got Interrupted");
        }
    }
}
class MyThread1 extends Thread{
    Display11 d;
    MyThread1(Display11 d){
        this.d=d;
    }
    public void run(){
        d.Displayn();
    }
}
class MyThread2 extends Thread{
    Display11 d;
    MyThread2(Display11 d){
        this.d=d;
    }
    public void run(){
        d.Displayc();
    }
}