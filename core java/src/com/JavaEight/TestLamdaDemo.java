package com.JavaEight;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Employee{
    String name;
    int eno;
    Employee(String name,int eno){
        this.eno=eno;
        this.name=name;
    }
    public String toString(){
        return eno+" :"+name;
    }
}
public class TestLamdaDemo {
    public static void main(String[] args) {
        ArrayList<Employee> l=new ArrayList<Employee>();
        l.add(new Employee("Vishal",8765));
        l.add(new Employee("Rahul",8764));
        l.add(new Employee("Ravi",8763));
        l.add(new Employee("Sonu",8762));
        l.add(new Employee("raju",8761));
        l.add(new Employee("Avinash",8760));
        System.out.println(l);
        Collections.sort(l,(e1,e2)->e1.eno< e2.eno?-1:e1.eno>e2.eno?1:0);
        System.out.println(l);
        Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(l);

    }
}
