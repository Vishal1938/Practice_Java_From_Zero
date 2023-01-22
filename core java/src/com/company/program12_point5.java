package com.company;
interface A1{
    public abstract void m1();
    default void m2(){
        System.out.println("m2 in A1");
    }
    static void m3(){
        System.out.println("m3 in A1");
    }
}
class B1 implements A1{
    public void m1(){
        System.out.println("m1 in hello");
    }
    public void m2(){
        System.out.println("m2 in hello");
    }
    public void m3(){
        System.out.println("m3 in hello");
    }
}
public class program12_point5 {
    public static void main(String[] args) {
        A1 a1=null;
        a1=new B1();
        a1.m1();
        a1.m2();
        A1.m3();
    }
}
