package com.multiThreading;

public class ThreadA1 {
    public static void main(String[] args) throws InterruptedException{
       ThreadB1 b=new ThreadB1();
       b.start();
       synchronized (b){
           System.out.println("Main Thread calling wait method");
           b.wait();
           System.out.println("Main thread got notification");
           System.out.println(b.total);
       }
    }
}
class ThreadB1 extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Child thread starts calculation");
            for (int i = 0; i <= 100; i++) {
                total = total + i;
            }
            System.out.println("Child Thread giving notification");
            this.notify();
        }
    }
}