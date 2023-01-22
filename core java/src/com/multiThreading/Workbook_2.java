package com.multiThreading;

public class Workbook_2 {
    public static void main(String[] args) {
        JtcThread jt1=new JtcThread();
        jt1.start();
        Thread th=Thread.currentThread();
        Thread.currentThread().setName("vishal");
        for(int i=100;i<110;i++){
            System.out.println("Main :"+i+"\t"+th.getName());
            if(i==105){
                int x=10/0;
            }
        }
    }
}
class JtcThread extends Thread{
    public void run(){
        Hello12 h=new Hello12();
        h.show();
    }
}
class Hello12{
    void show(){
        Thread th=Thread.currentThread();
        for (int i=0;i<10;i++){
            System.out.println("Show\t"+i+"\t"+th.getName());
        }
    }
}