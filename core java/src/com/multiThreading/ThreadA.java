package com.multiThreading;

public class ThreadA {
    public static void main(String[] args) throws InterruptedException{
        ThreadB b=new ThreadB();
        b.start();
        //Thread.sleep(10000);//first run methode will get exexcuted  and then updated the value.
        b.join();//it is better to use join methode instead of sleep because immmediately after execution
        //it updated the value.
        System.out.println(b.total);
        System.out.println("End of main method");
    }
}
class ThreadB extends Thread{
    int total=0;
    public void run(){
        System.out.println("Start of run methode");
        for(int i=1;i<=100;i++){
            total=total+i;
        }
    }
}