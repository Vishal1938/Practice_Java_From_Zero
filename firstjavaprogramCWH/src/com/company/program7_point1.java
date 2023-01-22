package com.company;
class con{
    int a;
    int b;
    static int c=30;
    con(){
        System.out.println("default const in con");
    }
    con(int a1){
        System.out.println("1 param cons in con");
        a=a1;
    }
    con(int a1,int b1) {
        System.out.println("2 param con in con");
        a = a1;
        b = b1;
    }
    void m1(){
        System.out.println("m1 in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class program7_point1 {
    public static void main(String[] args) {
        con c1=new con();
        c1.m1();
        con c2=new con(111);
        c2.m1();
        con c3=new con(222,333);
        c3.m1();
    }
}
