package com.company;
class hello3{
    int a;
    int b;
    static int c=30;
    hello3(){
        System.out.println("Default construcor in hello");
    }
    hello3(int a1){
        System.out.println("1 para cons in hello");
        a=a1;
    }
    hello3(int a1,int b1,int c1){
        System.out.println("3 para cons in hello");
        a=a1;
        b=b1;
        c=c1;
    }
    hello3(int a1,int b1){
        System.out.println("2 para cons in hello");
        a=a1;
        b=b1;
    }
    void show1(){
        int a=101;
        int b=202;
        int c=303;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }
}

public class program8_point3 {
    public static void main(String[] args) {
        hello3 h3=new hello3(11,22,33);
        h3.show1();
        hello3 h4=new hello3(44,55);
        h4.show1();
        hello3 h2=new hello3(111);
        h2.show1();
        hello3 h1=new hello3();
        h1.show1();
    }
}
