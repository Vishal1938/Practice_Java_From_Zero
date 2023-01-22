package com.company;
interface I1{
    int a=10;
    void m1();
    void m2();
    default void m3(){
        System.out.println("m3 in i1");
    }
    static void m4(){
        System.out.println("m4 in i1");
    }
}
class Hello2 implements I1{
    public void m1(){
        System.out.println("m1 in hello");
    }
    public void m2(){
        System.out.println("m2 in hello");
    }
    public void m3(){
        System.out.println("m3 in hello");
    }
    public void m4(){
        System.out.println("m4 in hello");
    }
}
public class program12_point2 {
    public static void main(String[] args) {
        I1 i1=new Hello2();
        i1.m1();
        i1.m2();
        i1.m3();
     //   i1.m4();
     //   I1.m4();
    }
}
