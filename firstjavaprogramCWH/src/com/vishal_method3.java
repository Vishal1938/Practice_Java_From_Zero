package com;
class hello4{
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("m1 in hello");
    }
    static void m2(){
        System.out.println("m2 in hello");
    }
    void m11(){
        System.out.println("m11 in hello");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
    static void m22(hello4 h1){
        System.out.println("m22 in hello");
        System.out.println(h1.a);
        System.out.println(b);
        m2();
        h1.m1();
    }
}

public class vishal_method3 {
    public static void main(String[] args) {
        hello4.m22(new hello4());
        hello4.m22(null);
    }
}
