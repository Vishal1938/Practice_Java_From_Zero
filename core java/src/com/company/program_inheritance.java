package com.company;
class Super{
    void m1(){
        System.out.println("m1 in super class");
    }
    void m1(int a){
        System.out.println("m1 in (int a) super class");
    }
    void m3(){
        System.out.println("m3 in super");
    }
}
class sub extends Super{
    void m1(){
        System.out.println("m1 in sub class");
    }
    void m11(int a){
        System.out.println("m1 in (int a) sub class");
    }
    void m4(){
        System.out.println("m4 in sub");
    }
        }

public class program_inheritance {
    public static void main(String[] args) {
        sub s1=new sub();
        s1.m1();
        s1.m3();
        s1.m4();
        Super s2=new sub();
        s2.m1();


    }
}
