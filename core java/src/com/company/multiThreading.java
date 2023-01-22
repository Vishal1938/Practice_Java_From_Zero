package com.company;

public class multiThreading {
    public static void main(String[] args) {
        ThreadGroup tg=Thread.currentThread().getThreadGroup();
        System.out.println(tg.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName()+" 'under the threadgroup of' "+
                Thread.currentThread()
        .getThreadGroup().getName());
    }
}
