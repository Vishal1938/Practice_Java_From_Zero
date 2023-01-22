package com.JavaEight;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;

class Student11{
    String name;
    int marks;
    Student11(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class ConsumerDemo {
    public static void main(String[] args) {
        Function<Student11,String> f=s->{
            int marks=s.marks;
            String grade="";
            if(marks>=80) return grade="A[Dictinction]";
            else if(marks>=60) return grade="B[First class]";
            else if(marks>=50) return grade="A[Second class]";
            else if(marks>=35) return grade="A[Third class]";
            else  return grade="E[Dictinction]";
        };
        Predicate<Student11> p=s->s.marks>=60;
        Consumer<Student11> c=s1->{
            System.out.println("Student Name:"+s1.name);
            System.out.println("Student Name:"+s1.marks);
            System.out.println("Student Name:"+f.apply(s1));
        };
        Student11[] s={new Student11("Vishal",100),
                new Student11("Ravi",80),
                new Student11("Rahul",65),
                new Student11("Suraj",55),
                new Student11("Neeraj",45),
                new Student11("Vijay",25),};
        for(Student11 s1:s)
        {
            if(p.test(s1)){
                c.accept(s1);
            }
        }
    }
}
