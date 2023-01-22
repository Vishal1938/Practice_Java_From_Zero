package com.company;
class vishal{
    int a;
     int b;
    static  int c=30;
    vishal(int a, int b, int c){
        System.out.println("three con");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        this.a=a;
        this.b=b;
        this.c=c;
        show();
    }
    vishal(int a,int b){
        this(44,55,66);
        System.out.println("two para con");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        this.a=a;
        this.b=b;
        show();
    }
    vishal(int a){
        this(22,33);
        System.out.println("one para");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       // this.a=a;
        show();
    }
    vishal(){
        this(11);
        System.out.println("default cons");
        show();
    }
    void show(){
        System.out.println("show -----");
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
        System.out.println(c);
    }
}

public class parametrised_constructor {
    public static void main(String[] args) {
        vishal v1 = new vishal();
    }
}
