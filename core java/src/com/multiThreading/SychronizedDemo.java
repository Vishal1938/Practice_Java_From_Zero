package com.multiThreading;

public class SychronizedDemo {
    public static void main(String[] args) {
       Display d1=new Display();
       Display d2=new Display();
       MyThread666 t1=new MyThread666(d1,"Ronaldo");
       MyThread666 t2=new MyThread666(d2,"Messi");
       t1.start();
       t2.start();
    }
}
class Display{
    public synchronized void wish (String name){
        for(int i=0;i<5;i++){
            System.out.println("Good Morning :"+name);
        }try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(name);
        }
    }
}
class MyThread666 extends Thread {
    Display d;
    String name;
    MyThread666(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}