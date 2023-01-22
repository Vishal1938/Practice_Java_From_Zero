package com.JavaEight;
interface Left{
    default void m1(){
        System.out.println("Left Interface m1 method");
    }
}
interface Right{
    default void m1(){
        System.out.println("Right Interface m1 method");
    }
}
public class Demo_default implements Left,Right{
    public void m1(){
        System.out.println("our own m1 method");
        Left.super.m1();
        Right.super.m1();
    }
    public static void main(String[] args) {
        Demo_default d=new Demo_default();
        d.m1();
    }
}
