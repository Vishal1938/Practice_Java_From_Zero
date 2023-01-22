package com.InnerClass;
class outer{
    int a=10;
    int b=20;
    static int c=30;
    void m1(){
        System.out.println("m1 in outer class");
    }
    static void m2(){
        System.out.println("m2 in outer class");
    }
    class inner{
        int a=101;
        static final int c1=303;
         void m11(){
            System.out.println("m11 in inner class");
        }
        void showInner(){
             int a=34;
            System.out.println("showinner in inner");
            System.out.println(a);//34
            System.out.println(b);//20
            System.out.println(c);//30
            System.out.println(this.a);//101
            System.out.println(outer.this.a);//10
            System.out.println(c1);//303
            m1();
            m2();
        }
    }//inner class closed
    void showouter(){
        System.out.println("show in outer");
        System.out.println(a);//10
        System.out.println(b);//20
        System.out.println(c);//30
        inner inr=new inner();
        System.out.println(inr.a);//101
        System.out.println(inner.c1);//303
    }
}
public class program12_point6 {
    public static void main(String[] args) {
        outer otr=new outer();
        otr.m1();
        outer.inner oi4=new outer().new inner();
        oi4.m11();
        oi4.showInner();
        otr.showouter();
    }
}