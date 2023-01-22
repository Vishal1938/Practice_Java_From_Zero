package com.multiThreading;

public class ThreadDemo {
    public static void main(String[] args) throws NoClassDefFoundError{
        Mythread t1 =new Mythread();
        Thread t2=new Thread(t1);
        t2.start();
        //t2.run();
       // t1.run();//No new Thread will be Created whole process will bew done by main method.
      //  t1.start();//Start methode of super class(thread) is getting called,new thread created run method is getting called
        for (int i=0;i<5;i++){
            System.out.println("exexcuted by :"+Thread.currentThread().getName());
        }
    }
}
class Mythread extends Thread{
    public void run(){
        for (int i=0 ;i<5;i++){
            System.out.println("executed by :"+Thread.currentThread().getName());
            // in case t.start () a new thread will be created it calls the run methode of
          // child threade
            //in case of t.run () run methode will calls as normal methode and no new thread
           // will be created and both for loop will be executed by main thread
        }
    }
}//Done Comletely