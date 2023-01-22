package com.company;
class HelloThread2 implements Runnable{
    HelloThread2(){
        Thread t1= new Thread(this);
        t1.start();
    }
    HelloThread2(String tname){
        Thread t2=new Thread(this,tname);
        t2.start();
    }
    HelloThread2(String tname,ThreadGroup tg){
        Thread t3=new Thread(tg,this,tname);
        t3.start();
    }
   public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" under the threadgroup of :"
                    +Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
public class jtc103 {
    public static void main(String[] args) {
        ThreadGroup tg1=new ThreadGroup("jtc-pg");
        HelloThread2 t1=new HelloThread2("jtc-tg");
        HelloThread2 t2=new HelloThread2("jtc-1");
        System.out.println(tg1);
        System.out.println(t1);
        System.out.println(t2);

    }
}

