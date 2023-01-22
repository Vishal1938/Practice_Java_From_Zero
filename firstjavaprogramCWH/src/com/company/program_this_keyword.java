package com.company;
class This{
    int a;
    int b;
    static int c =30;
    This(){
        System.out.println("default constuctor in this keyword");
    }
    This(int a){
        System.out.println("1 param construcor in this");
        this.a=a;
    }
    This(int a,int b){
        System.out.println("2 param construvtor in this");
        this.a=a;
        this.b=b;
    }
    This(int a,int b,int c){
        System.out.println("3 param constucor in this");
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void show(){
        int a =101;
        int b=202;
        int c=303;
        System.out.println("show in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }
}

public class program_this_keyword {
    public static void main(String[] args) {
        This t1= new This();
        t1.show();
        This t2=new This(111);
        t2.show();
        This t3=new This(222,333);
        t3.show();
        This t4=new This(444,555,666);
        t4.show();
    }
}
