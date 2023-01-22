package com.company;
class red{
    final void m1(){
        System.out.println("m1 in hello");
    }
    static void m2(){
        System.out.println("m2 in hello");
    }
    void m3(){
        System.out.println("m3 in hello");
    }
}
class red1 extends red{
    static void m2(){
        System.out.println("m2 in hai");
    }
    void m3(){
        System.out.println("m4 in hai");
    }
}

public class program10_point3 {
    public static void main(String[] args) {
        red1 red=new red1();
        red.m1();
        red.m2();
        red.m3();


    }
}
