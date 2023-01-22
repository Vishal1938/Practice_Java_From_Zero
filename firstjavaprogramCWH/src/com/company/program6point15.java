package com.company;
class hello8{
   static int m1(){
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

public class program6point15 {
    public static void main(String[] args) {
        hello8 h1=new hello8();
        System.out.println(h1.m1());
        System.out.println(h1.m2());
    //    System.out.println(h1.m3());
        System.out.println(h1.m1()+"" +h1.m2());

    }
}
