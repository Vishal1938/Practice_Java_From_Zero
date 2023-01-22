package com.company;
class methode{
    int a=10;
    final int b=20;
    static final int c=30;
    void m1(){
        int a=11;
        int b=22;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println("--------");
    }
    static void m2(methode m11){
        System.out.println(m11.a);
        System.out.println(c);
        System.out.println(m11.b);
        System.out.println("--------");
    }
        }

public class practice_methode {
    int a=88;
    static int b=77;
    methode m12=new methode();
    static methode m13=new methode();
    public static void main(String[] args) {
        methode m11=new methode();
        m11.m1();
        m11.m2(m11);
        System.out.println("-------");
        System.out.println(m11.a);
        System.out.println(methode.c);
        System.out.println(b);
        System.out.println(m13);
        System.out.println("--------");
        m13.m2(m11);

    }
}
