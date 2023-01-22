package com.company;
abstract class hello1{
    int a=10;
    int b=20;
    static int c=30;
    {
        System.out.println("IB in hello");
    }
    static {
        System.out.println("SB in hello");
    }
    hello1(){
        System.out.println("Default constutor in hello");
    }
    hello1(int a,int b){
        System.out.println("2 para.constucor in hello");
        this.a=a;
        this.b=b;
    }
    void m1(){
        System.out.println("m1 in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    abstract void m2();
}
class hai1 extends hello1{
    public void m2(){
        System.out.println("m2 in hai");
    }
    public void m3(){
        System.out.println("m3 in hai");
    }
    void show(){
        System.out.println("show in hai");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


public class program11_point2 {
    public static void main(String[] args) {
        hello1 h2=null;
        h2=new hai1();
        h2.m2();
     //   h2.m3();
        hai1 hai1=(hai1)h2 ;
        hai1.m3();
        hai1.show();
        hai1 h1=new hai1();
        h1.show();

    }
}
