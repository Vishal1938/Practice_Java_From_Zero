package com.multiThreading;

public class SynchronizedDemo3 {
    public static void main(String[] args) {
        Display333 d=new Display333();
        MyThread777 t1=new MyThread777(d,"Ronaldo");
        MyThread777 t2=new MyThread777(d,"Messi");
        t1.start();
        t2.start();
    }
}
class Display333 {
    public void wish(String name){
        ;;;;;;;//suppose there is 1 lakh lines of code.
        synchronized (this) {
            for(int i=0;i<5; i++) {
                System.out.println("Good Morning :" + name);
            }
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(name);
            }
        }
        ;;;;;;;//suppose there is 1 lakh lines of code.
    }
}
class MyThread777 extends Thread{
    Display333 d;
    String name;
    MyThread777 (Display333 d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}