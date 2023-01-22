package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee implements Comparable{
    String name;
    int  eid;
    Employee(String name,int eid){
        this.name=name;
        this.eid=eid;
    }
    public String toString(){
        return name+"_____"+eid;
    }
    public int compareTo(Object obj){
        int eid1=this.eid;
        Employee e=(Employee) obj;
        int eid2=e.eid;
        if(eid1<eid2){
            return -1;
        }
        else if(eid1>eid2){
            return +1;
        }
        else return 0;
    }
}
public class CompComp {
    public static void main(String[] args) {
        Employee e1=new Employee("Neeraj",100);
        Employee e2=new Employee("Bunti",299);
        Employee e3=new Employee("Vishal",55);
        Employee e4=new Employee("Ravi",115);
        Employee e5=new Employee("Rahul",234);
        Employee e6=new Employee("Raju",333);
        TreeSet t=new TreeSet();
        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);
        t.add(e6);
        System.out.println(t);//Output on the basis of ascending eid
        TreeSet t1=new TreeSet(new MyComParator11());
        t1.add(e1);
        t1.add(e2);
        t1.add(e3);
        t1.add(e4);
        t1.add(e5);
        t1.add(e6);
        System.out.println(t1);
    }
}
class MyComParator11 implements Comparator{
    public int compare(Object Obj1,Object Obj2){
        Employee e1=(Employee) Obj1;
        Employee e2=(Employee) Obj2;
        String s1= e1.name;
        String s2= e2.name;
       // return s1.compareTo(s2);//output on the basis of ascending alphabetical order of name
       // return s2.compareTo(s1);//output on the basis of descending alphabetical order of name
      //  return -s1.compareTo(s2);//output on the basis of descending alphabetical order of name
      //  return -s2.compareTo(s2);//output on the basis of ascending alphabetical order of name
      //  return  +1;//in added order(every element added in right side)
      //  return -1;//in reverse order(every element on the left side
        return 0;//every element is treated as duplicate element e1.equals(e2) that'swhy no new element
        //added
    }
}