package com.company;

public class workbook5_of2 {
    public static void main(String[] args) {
        new Employee1(99).show();
        System.out.println();
        new Employee1("vishal").show();
        System.out.println();
        new Employee1(98,"ravi").show();
        System.out.println();
        new Employee1(45,"vikash",6526668).show();
        System.out.println();
        new Employee1(58,"rahul",9451795213l,85000.0f).show();
        System.out.println();
        new Employee1(6526668,"singh",78562.00f).show();
    }
}
class Employee1{
    int eid;
    String name;
    long phone;
    float salary;
    Employee1(int eid){
        System.out.println("--Employee(int)--\t:"+this);
        this.eid=eid;
    }
    Employee1(String name){
        System.out.println("--Employee(String)--\t:"+this);
        this.name=name;
    }
    Employee1(int eid,String name){
        this(eid);
        System.out.println("--Employee(int,string)--\t:"+this);
        this.name=name;
    }
    Employee1(int eid,String name,long phone){
        this(eid,name);
        System.out.println("--Employee(int,string,long)--\t:"+this);
        this.phone=phone;
    }
    Employee1(int eid,String name,long phone,float salary){
        this(eid,name,phone);
        System.out.println("--Employee(int,string,long,float)--\t:"+this);
        this.salary=salary;
    }
    Employee1(long phone,String name,float salary){
        this(name);
        System.out.println("--Employee(long,string,float)--\t:"+this);
        this.phone=phone;
        this.salary=salary;
    }
    void show(){
        System.out.println(eid+"\t"+name+"\t"+phone+"\t"+salary);
    }
}
