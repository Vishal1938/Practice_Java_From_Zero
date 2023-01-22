package com.multiThreading;

public class Workbook_1 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        System.out.println("Length:"+args.length);
        for(int i=0;i< args.length;i++){
            System.out.println("Args:"+i+"\t"+args[i]);
        }
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        new JtcStudent();
        System.gc();
        for(int i=0;i<10;i++){
            System.out.println(i+"\t"+th.getName()+"\t"+tg.getName());
        }
        System.out.println("Main Complted");
    }
}
class JtcStudent{
    public void finalize(){
        Thread th=Thread.currentThread();
        ThreadGroup tg=th.getThreadGroup();
        for(int i=20;i<40;i++){
            System.out.println(i+"\t"+th.getName()+"\t"+tg.getName()+"\t"+th.isDaemon());
        }
    }
}