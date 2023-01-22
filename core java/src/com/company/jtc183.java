package com.company;
class HelloThread extends Thread{
    public HelloThread(){
        super();
        start();
        System.out.println(" DEF CONS IN HELLOTHREAD ");
    }
    public HelloThread(String tname){
        super(tname);
        start();
        System.out.println(" 1 para in Hellothread ");
    }
    HelloThread(ThreadGroup tg,String tname){
        super(tg,tname);
        System.out.println(" 2 para in Hellothread ");
        start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() +" under the threadgroup1 of :"+
                    Thread.currentThread().getThreadGroup().getName());
        }
        try{
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class jtc183 {
    public static void main(String[] args) {
        ThreadGroup tg=Thread.currentThread().getThreadGroup();
        HelloThread th1=new HelloThread();
        HelloThread th2=new HelloThread("Jtc-1");
        HelloThread th3=new HelloThread(tg,"jtc-2");
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" under the thread group of :"+
                    Thread.currentThread().getThreadGroup().getName());
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }
}
