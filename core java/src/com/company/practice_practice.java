package com.company;
class ABC{
}
class XYZ extends ABC{
}
public class practice_practice {
    public static void main(String[] args) {
        ABC a1= new ABC();
        XYZ x1=new XYZ();
        Class c1=a1.getClass();
        Class c2=x1.getClass();
        System.out.println("Class Name ="+c1.getName());
        System.out.println("class Name="+c2.getName());
        System.out.println("package Informatin="+c1.getPackage());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(a1.hashCode());
        System.out.println(x1.hashCode());
        System.out.println("Super class name"+c1.getSuperclass().getName());
        System.out.println();
    }
}
