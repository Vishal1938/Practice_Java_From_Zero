package com.JavaEight;
import java.util.function.Function;
import java.util.function.Predicate;

class Student{
    String name;
    int marks;
    Student(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
}
public class FunctionDemo {
    public static void main(String[] args) {
        Predicate <Student> p=s->s.marks>60;
        Function <Student,String> f=s-> {
            int marks = s.marks;
            String grade = "";
            if (marks >= 80) return grade = "A[Dictintion]";
            else if (marks >= 60) return grade = "B[First class]";
            else if (marks >= 50) return grade = "c[Second class]";
            else if (marks >= 35) return grade = "D[Third class]";
            else return grade = "E[Failed]";
        };
        Student[] s={new Student("Vishal",100),
            new Student("Ravi",65),
            new Student("Rahul",55),
            new Student("Suraj",45),
            new Student("Prakash",35)
        };
        for(Student s1:s){
            if(p.test(s1)) {
                System.out.println("Student name:" + s1.name);
                System.out.println("Student marks:" + s1.marks);
                System.out.println("Student Grade:" + f.apply(s1));
            }
        }

    }
}
