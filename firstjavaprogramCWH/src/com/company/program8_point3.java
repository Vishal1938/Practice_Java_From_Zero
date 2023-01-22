package com.company;
class hehe{
    int a;
    int b;
    int c=30;
    {
        System.out.println("IB in hehe");
    }
    static {
        System.out.println("SB in hehe");
    }
    hehe(int a,int b,int c){
        System.out.println("3 param construcor in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    hehe(int a,int b){
        this(22,33,44);
        System.out.println("2 param cons in hehe");
        System.out.println(a);
        System.out.println(b);
        this.a=a;
        this.b=b;
    }
    hehe(int a){
        this(888,777);
        System.out.println("1 param cons in hehe");
        System.out.println(a);
        this.a=a;
    }
    hehe(){
        this(999);
        System.out.println("Default cons in he");
    }
    void show(){
        System.out.println("show in hehe");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class program8_point3 {
    public static void main(String[] args) {
        hehe h1= new hehe();
        h1.show();
    }
}
