package com.company;
abstract class abs{
    int a=10;
    int b=20;
    static int c=30;
    void m1(){
        System.out.println("m1 in hello");
    }
    abstract void m2();
    public abstract void m3();
}
abstract class pack extends abs{
    void m2(){
        System.out.println("m2 in hai");
    }
}
class core extends pack{
    public void m3(){
        System.out.println("m3 in hai");
    }
}
public class program11_point1 {
    public static void main(String[] args) {
        abs a=null;
        a=new core();
        a.m2();
        a.m3();

    }
}
