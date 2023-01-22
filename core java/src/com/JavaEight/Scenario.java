package com.JavaEight;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    public static void main(String[] args) {
        List<Emplyooo> list=new ArrayList<Emplyooo>();
        Emplyooo e1=new Emplyooo(1,10000,"Vishal");
        Emplyooo e2=new Emplyooo(2,50000,"Wishal");
        Emplyooo e3=new Emplyooo(3,120000,"Rishal");
        Emplyooo e4=new Emplyooo(4,70000,"Pishal");
        Emplyooo e5=new Emplyooo(5,40000,"Eishal");
        Emplyooo e6=new Emplyooo(6,230000,"Bishal");
        list.add(e1);list.add(e2);list.add(e3);list.add(e4);list.add(e5);list.add(e6);
        list.stream().sorted((o1,o2)->e1.getId()- e2.getId()).forEach(System.out::println);
        list.stream().sorted((o1,o2)->e2.getId()- e1.getId()).forEach(System.out::println);
        list.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
        list.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);
        list.stream().sorted((o1,o2)->(o1.getName().compareTo(o2.getName()))).forEach(System.out::println);
        list.stream().sorted((o1,o2)->(o2.getName().compareTo(o1.getName()))).forEach(System.out::println);
    }
}
class Emplyooo{
    private int id;
    private long salary;
    private String name;

    public Emplyooo(int id,long salary,String name){
        this.id=id;
        this.salary=salary;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emplyooo{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}