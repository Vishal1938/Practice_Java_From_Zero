package com.company;
class Run{
    private Run(){
        System.out.println("default con....");
    }
    static Run r1=null;
    static {
        r1=new Run();
        System.out.println("static block....");
    }
    static Run getmethode(){
        return r1;
    }
    void m1(){
        System.out.println("m1 in Run");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Run r1=Run.getmethode();
        r1.m1();
        Run r2=Run.getmethode();
        r2.m1();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.hashCode());
        System.out.println(r2.hashCode());
    }
}
