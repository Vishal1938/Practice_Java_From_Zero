package com.InnerClass;
class outer4{
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("m1 in outer");
    }
    static void m2(){
        System.out.println("m2 in outer");
    }
    static class Inner {
        int a11 = 101;
        static int b11 = 202;

        void m11() {
            System.out.println("m11 in inner");
        }

        static void m22() {
            System.out.println("m22 in inner");
        }
    }
        void show() {
            System.out.println("show in outer");
            Inner inr = new Inner();
            inr.m11();
            inr.m22();
            Inner.m22();

    }
}

public class program12_point12 {
    public static void main(String[] args) {
        outer4.Inner oi3=new outer4.Inner();
        oi3.m11();
        new outer4.Inner().m11();
        outer4.Inner.m22();
        System.out.println(outer4.Inner.b11);
        System.out.println(new outer4.Inner().a11);
         new outer4().show();
    }
}
