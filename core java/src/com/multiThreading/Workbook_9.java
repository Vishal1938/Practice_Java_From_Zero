package com.multiThreading;

public class Workbook_9 {
    public static void main(String[] args) {
        HelloJtc55 h=new HelloJtc55();
        JtcThread23 jth=new JtcThread23(h);
        jth.setDaemon(true);
        jth.start();
        new Employee();
        System.gc();
        Thread th=Thread.currentThread();
        for(int i=0;i<15;i++){
            System.out.println("In Main :"+i+"\t"+th.isDaemon());
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class JtcThread23 extends Thread{
    HelloJtc55 h=null;
    JtcThread23 (HelloJtc55 h){
        this.h=h;
    }
    public void run(){
        for(int i=0;i<152;i++){
            h.val=i;
            System.out.println("Storing the Data\t"+i+"\t"+isDaemon());
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
class HelloJtc55{
    int val;
}
class Employee{
    public void finalize(){
        Thread th=Thread.currentThread();
        for(int i=100;i<900;i++){
            System.out.println(th.getName()+"\t"+th.isDaemon()+"\t"+i);
            try{
                Thread.sleep(100);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }/* After completion of execution of all non-demoen thread and going into dead state all the
    demoan thread are goes to dead state whether they are completed their exexcution or not
    In this code after the complete execution of main thread which is non-demoan thraed all the
    other demon thread are goes to dead state.*/
}