package com.company;
class U{
    void m1(){
        System.out.println("m1 in u");
    }
    void m1(int a){
        System.out.println("m1(int a)in u");
    }
    void m1(int a,String s){
        System.out.println("m1(int ,string)");
    }
    int m1(String s,int a){
        System.out.println("");
        return 2;
    }
}

public class constrctor {
    static constrctor c1=new constrctor();
    public static void main(String[] args) {
        U u1=new U();
        u1.m1();

    }
}
