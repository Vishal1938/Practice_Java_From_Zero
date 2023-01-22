package com.company;
class what {
    {
        System.out.println("IB in what");
    }
    static {
        System.out.println("SB in what");
    }
    void m1(){
        System.out.println("m1 in what");
    }
    static void m2(){
        System.out.println("m2() in what");
    }
}

public class program6_point23 {
    what w1= new what();
    static program6_point23 p1=new program6_point23();
    {
        System.out.println("IB in program");
        w1.m1();
        w1.m2();
    }
    static {
        System.out.println("Sb in program");
    }
    public static void main(String[] arg){
        System.out.println("main in");
        what.m2();
    }
}
