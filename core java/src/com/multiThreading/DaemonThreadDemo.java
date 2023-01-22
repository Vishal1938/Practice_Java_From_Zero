package com.multiThreading;

public class DaemonThreadDemo {
    public static void main(String[] args) {
       YourThread t=new YourThread();
        System.out.println(Thread.currentThread().isDaemon());
       // Thread.currentThread().setDaemon(true);
       t.setDaemon(true);
       t.start();
        System.out.println("End of main thread");
    }
}
class YourThread extends Thread{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("child Thread");
            System.out.println(Thread.currentThread().isDaemon());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
            }
        }
    }
}