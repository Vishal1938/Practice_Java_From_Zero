package com.company;
class y{
     static int a=10;
     int b=30;
    void m1(){
        System.out.println("we cannot");
    }/*
}
class z extends y{
    int a=20;
    void m1(){
        System.out.println("we can");
    }*/
    static void m2(){
        System.out.println("we can");
    }
   {
       System.out.println("instance block in y");
   }
    static {
        System.out.println("static block in y");
    }
}
public class claas {
    public static void main(String[] args) {
        y y1=new y();
        System.out.println(y1.b);
        System.out.println(y.a);
y1.m1();
y1.m2();
        //    System.out.println(y1.a);

    }
}
