package com.multiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        Printjob[] jobs={new Printjob("PK"),
        new Printjob("Rahul"),
        new Printjob("vishal"),
        new Printjob("Sonu"),
        new Printjob("Rajat"),
        new Printjob("Ravi"),};
        ExecutorService service = Executors.newFixedThreadPool(6);
        for(Printjob job:jobs){
            service.submit(job);
        }
        service.shutdown();
    }
}
class Printjob implements Runnable{
    String name;
    Printjob(String name){
        this.name=name;
    }
    public void run(){
        System.out.println(name+"__job started by Thread:"+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
        }
        System.out.println(name+"__job completed by Thread:"+Thread.currentThread().getName());
    }
}