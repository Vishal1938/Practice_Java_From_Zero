package com.company;
interface l1 {
    public static int a = 10;
    public abstract void m1();
}
interface l2{
    int b=20;
    void m2();
}
interface l3 extends l1,l2{
    int c=30;
    void m3();
}
interface l4{
    int d=40;
    void m4();
}
interface l5{
    int e=50;
    void m5();
}
interface l6 extends l4,l5{
    int c=60;
    void m3();
}
class Hello3 implements l3,l6{
    public void m1(){
        System.out.println("m1 in hello");
    }
    public void m2(){
        System.out.println("m2 in hello");
    }
    public void m4(){
        System.out.println("m4 in hello");
    }
    public void m5(){
        System.out.println("m5 in hello");
    }
    public void m3(){
        System.out.println("m3 in hello");
    }
    void show(){
        System.out.println("show in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a);
        System.out.println(l6.c);
        System.out.println(l3.c);
    }
}
public class program12_point3 {
    public static void main(String[] args) {
        l3 i3=null;
        i3=new Hello3();
        i3.m1();
        i3.m2();
        i3.m3();
        l6 h6=null;
        h6=new Hello3();
        h6.m4();
        h6.m5();
        h6.m3();
        Hello3 h1=new Hello3();
        h1.show();
    }
}