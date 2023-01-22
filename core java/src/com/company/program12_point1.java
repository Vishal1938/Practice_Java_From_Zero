package com.company;
interface I{
    public static final int a=10;
    static final int b=20;
    final int c=30;
    int d=40;
    public abstract void m1();
    abstract void m2();
    void m3();
}
abstract class Hello1 implements I{
    @Override
    public void m1() {
        System.out.println("m1 in hello");
    }

    @Override
    public void m2() {
        System.out.println("m2 in hello");
    }
    public void m3() {
        System.out.println("m3 in hello");
    }
}
class Hai1 extends Hello1{
    public void m3(){
        System.out.println("m3 in hai");
    }
    void m4(){
        System.out.println("m4 in hai");
    }
}
public class program12_point1 {
    public static void main(String[] args) {
        I i1=new Hai1();
        Hello1 h1=new Hai1();
        i1.m1();
        i1.m2();
        i1.m3();
    //    i1.m4();
        System.out.println(i1.a);
        System.out.println(i1.b);
        System.out.println(i1.c);
        System.out.println(i1.d);
    //    new Hai1().m4();
    }
}
