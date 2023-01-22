package com.multiThreading;

public class TestThread {
    public static void main(String[] args) {
        MyThread999 t1=new MyThread999();
        Thread t3=new Thread();
        Thread t2=new Thread(t1);

       // t1.start();//cannot find the Symbol error Runnable Interface contain only run() method
       // t1.run();//no new thread will be created whole process will be done by main thread
      /* Output- Executed by1 :main
        Executed by1 :main
        Executed by1 :main
        Executed by1 :main
        Executed by1 :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main*/
        //t2.start();//new thread will be created and run methode is getting called.
        /*Output-Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by1 :Thread-1
        Executed by1 :Thread-1
        Executed by1 :Thread-1
        Executed by1 :Thread-1
        Executed by1 :Thread-1*/

       // t2.run();//no new thread will be created whole process wll be done by main thread
       /*Executed by1 :main
        Executed by1 :main
        Executed by1 :main
        Executed by1 :main
        Executed by1 :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main
*/
        //t3.start();//run methode of the Thread class will be called which doesn'thave any implementation
        /*Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main
        Executed by :main*/
        // t3.run();//run methode of the Thread class will be called which doesn't have any implementation
        //same as Above
       for (int i=0;i<5;i++) {
           System.out.println("Executed by :"+Thread.currentThread().getName());
        }
    }
}
class MyThread999 implements Runnable{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Executed by1 :"+Thread.currentThread().getName());
        }
    }
}//      Done Completely