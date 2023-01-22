package com.multiThreading;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread111 t=new MyThread111();
        t.start();
        t.join(1000);
        for (int i=0;i<5;i++){
            System.out.println("Parent Thread :"+Thread.currentThread().getName());
        }
    }
}
class MyThread111 extends Thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("child  Thread :"+Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}//         DONE COMPLETELY
  /*  child  Thread :Thread-0
        Parent Thread :main
        Parent Thread :main
        Parent Thread :main
        Parent Thread :main
        Parent Thread :main
        child  Thread :Thread-0
        child  Thread :Thread-0
        child  Thread :Thread-0
        child  Thread :Thread-0*/
