package com.company;
class method{
    int m1(){
        System.out.println("m1 in hello");
        return 10;
    }
    int m2(){
        System.out.println("m2 in hello");
        return 20;
    }
    void m3(){
        System.out.println("m3 in hello");
    }
}

public class program6_point15 {
    public static void main(String[] args) {
        method d1=new method();
        int i1= d1.m1();
        System.out.println(i1);
     //   System.out.println(d1.m2());
     //   d1.m3();
    }
}
