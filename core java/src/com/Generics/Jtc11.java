package com.Generics;

import java.util.Comparator;

public class Jtc11 {
    public static void main(String[] args) {
        Student stud=new Student();
        stud.studid="JTC-001";
        stud.studid=1245;
        stud.studid=1245L;
        Student stud2=new Student();
        stud2.studid="JTC-002";
        stud2.studid=1245;
        stud2.studid=1245L;
        Student<String> st3=new Student<String>();
        st3.studid="WB-001";
        //st3.studid=4512;//only String type
        Student<Long> st4=new Student<Long>();
        //st4=new Student<Integer>();//Required type=Long
        st4.studid=4521L;
       /* st4.studid=4521;
        Required type:
        Long
        Provided:
        int*/
        //st4.studid="WB_001";//Required Type=long
        Student<?> st5=new Student<Long>();
        st5=new Student<String>();
        st5=new Student<Integer>();
        Student<? extends Number> st6=new Student<Long>();
        /*st6=new Student<String>();
        Required type:
        Student
              <? extends Number>
        Provided:
        Student
                <String>*/
        st6=new Student<Integer>();
        Employee emp1=new Employee();
        emp1.empid="JTC-001";
        emp1.empid=4512;
        emp1.empName="SomPrakash";
        Employee<Integer,String> emp2=new Employee<Integer,String>();
       /* emp2.empid="JTC-001";
        Required type:
        Integer
        Provided:
        String*/
        emp2.empid=1234;
        /*emp2.empid="";

        Required type:
        Integer
        Provided:
        String*/
        System.out.println();
        System.out.println();
        User<Integer,Long,Address<String,Integer>> ref1=new User<Integer,Long,Address<String,Integer>>();
    }
}
class Student<T>{
    T studid;
}
class Employee<T1,T2> implements Compare<Employee<T1,T2>> {
    T1 empid;
    T2 empName;
   // static T1 val;//cannot  assign static type;
    public boolean compare(Employee<T1,T2> ref){
        return false;
    }
}
interface Compare<T>{
    public boolean compare(T ref);
}
class User<T1,T2,T3>{
    T1 uid;
    T2 phone;
    T3 uad;
}
class Address<T1,T2>{
    T1 aid;
    T2 pin;
}