package com.multiThreading;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal t1=new ThreadLocal();
        System.out.println(t1.get());//null
        t1.set("ravi");
        System.out.println(t1.get());//ravi
        t1.remove();
        System.out.println(t1.get());//null
    }
}//                    DONE COMPLETELY
