package com.company;
class hiii{
    {
        System.out.println("ib in haiii");
    }
    static {
        System.out.println("SB in hiii");
    }
    void m1(){
        System.out.println("m1 in hello");
    }
    static void m2(){
        System.out.println("m2() in hello");
}

public class program16_point23 {

}
    hiii h1 = new hiii();
     program16_point23 program6_point23 = new program16_point23();
    {
        System.out.println("IB in public class");
        hiii h2 = new hiii();
        h1.m1();
        h2.m1();
    }
    static  {
        System.out.println("SB in public class");
    }

    public static void main(String[] args) {
        System.out.println("main in public class");
        hiii.m2();
    }
}
