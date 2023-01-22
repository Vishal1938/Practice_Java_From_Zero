package com.JavaEight;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;

class Worker{
    int eno;
    String name;
    Worker(int eno,String name){
        this.eno=eno;
        this.name=name;
    }
}
public class BiFunctionDemo {
    public static void main(String[] args) {
        ArrayList<Worker> l=new ArrayList<Worker>();
        BiFunction<Integer,String,Worker> f=(eno,name)->new Worker(eno,name);
        l.add(f.apply(100,"Vishal"));
        l.add(f.apply(200,"Ravi"));
        l.add(f.apply(300,"Suraj"));
        l.add(f.apply(400,"Rahul"));
        for(Worker w:l){
            System.out.println("Employee Number :"+w.eno);
            System.out.println("Employee Number :"+w.name);
        }
    }
}
