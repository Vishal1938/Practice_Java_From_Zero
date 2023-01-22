package com.JavaEight;

import java.util.ArrayList;
import java.util.function.Predicate;

class Majdoor{
    String name;
    double salary;
    Majdoor(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
}
public class PredicateDemo {
    public static void main(String[] args) {
        ArrayList<Majdoor> l=new ArrayList<Majdoor>();
        l.add(new Majdoor("Vishal",12000000));
        l.add(new Majdoor("Rahul",2000));
        l.add(new Majdoor("Ravi",3000));
        l.add(new Majdoor("suraj",4000));
        l.add(new Majdoor("Rajat",6000));
        Predicate<Majdoor> p=m->m.salary>3000& m.salary%2==0;
        for(Majdoor m1:l){
            if(p.test(m1)){
                System.out.println(m1.name+" :"+m1.salary);
            }
        }
    }
}
