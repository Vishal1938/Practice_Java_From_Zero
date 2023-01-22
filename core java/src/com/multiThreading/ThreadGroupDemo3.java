package com.multiThreading;

public class ThreadGroupDemo3 {
    public static void main(String[] args) throws InterruptedException{
     ThreadGroup pg=new ThreadGroup("Parent ThreadGroup");
     ThreadGroup cg=new ThreadGroup(pg,"child threadGroup");
     MyRassi t1=new MyRassi(pg,"childThread1");
     MyRassi t2=new MyRassi(pg,"childThread2");
     t1.start();
     t2.start();
        System.out.println(pg.activeCount());//2
        System.out.println(pg.activeGroupCount());//1
        pg.list();
        Thread.sleep(10000);
        System.out.println(pg.activeCount());//2
        System.out.println(pg.activeGroupCount());//1
        pg.list();
    }
}
class MyRassi extends Thread{
    MyRassi(ThreadGroup g,String name){
        super(g,name);
    }
    public void run(){
        System.out.println("childThread");
        try{
            Thread.sleep(50000);
        }catch (InterruptedException e){
        }
    }
}//      DONE COMPLETELY