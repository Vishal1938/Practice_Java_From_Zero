package com.company;

public class workbook9_of2 {
    public static void main(String[] args) {
        System.out.println("**MAIN METHODE**");
        person11 s1=new student11();
        System.out.println("student object created--\n");
        person11 e1=new Employee11();
        System.out.println("--Employee object created--\n");
    }
}
class person11 {
    static{
        System.out.println("\n --static of person--");
    }
    person11(){
        System.out.println("---person() cons--");
    }
}
class student11 extends person11{
    static {
        System.out.println("--static of student--");
    }
    student11(){
        System.out.println("student() cons--");
    }
}
class Employee11 extends person11{
    static {
        System.out.println("--static of employee");
    }
}
