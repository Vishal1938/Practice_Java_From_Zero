package com.multiThreading;

public class Workbook_4 {
    public static void main(String[] args) {
        HelloJtc1 h=new HelloJtc1();
        new AA(h,"A");
        new BB(h,"B");
    }
}
class HelloJtc1{
    synchronized void m1(){
        for(int i=1;i<=5;i++){
            System.out.println("m1-"+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
    synchronized void m2(){
        for (int i=10;i<=15;i++) {
            System.out.println("m2-" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
class AA implements Runnable{
    HelloJtc1 h=null;
    AA(HelloJtc1 h,String name){
        this.h=h;
        Thread t1=new Thread(this,name);
        t1.start();
        }
        public void run(){
        h.m1();
    }
}
class BB implements Runnable{
    HelloJtc1 h=null;
    BB(HelloJtc1 h,String name){
        this.h=h;
        Thread t2=new Thread(this,name);
        t2.start();
    }
    public void run(){
        h.m2();
    }
}