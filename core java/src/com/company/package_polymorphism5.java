package com.company;
class harry{
    int a=10;
    int b=20;
    static int c=30;
    void m1(){
        System.out.println("m1 in hello");
    }
    void m2(){
        System.out.println("m2 in hello");
    }
    void m3(){
        System.out.println("m3 in hello");
    }
}
class carry extends harry{
    int a=22;
    int b=33;
    int c=33;
    void m1(){
        System.out.println("m1 in hai");
    }
    void m2(){
        System.out.println("m2 in hai");
        super.m2();
    }
}
public class package_polymorphism5 {
    int a=c;
    static int c;
    public static void main(String[] args) {
        int a=11;
        int b=44;
        int c=0;
        System.out.println(a);
        System.out.println(c);
        carry c1=new carry();
        c1.m1();
        c1.m2();
        c1.m3();
        harry h1=new carry();
        System.out.println(h1.a);
        System.out.println(h1.b);
        System.out.println(h1.c);
        package_polymorphism5 p1= new package_polymorphism5();
        System.out.println(p1.a);
    /*    carry c2=(carry)new harry();
        System.out.println(c2.a);
        System.out.println(c2.b);
        System.out.println(c2.c);
*/
    }
}
