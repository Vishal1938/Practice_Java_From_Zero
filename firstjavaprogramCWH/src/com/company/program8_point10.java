package com.company;
class hihi{
    int a=10;
    private int b=20;
    void m1(){
        System.out.println("m1 in hello");

            System.out.println("local block in m1");
            System.out.println(a);
           // System.out.println(this.a);
            System.out.println(b);


    }
}

public class program8_point10 {
    public static void main(String[] args) {
        hihi h1=new hihi();
        h1.m1();
        System.out.println(h1.a);
    }
}
