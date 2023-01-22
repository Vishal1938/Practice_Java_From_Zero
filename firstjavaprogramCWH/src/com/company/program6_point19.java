package com.company;
class over1{
    void m1(byte b1){
        System.out.println("m1(byte b1) in hello");
        return;
    }
    void m1(short s){
        System.out.println("m1(shorts s)in hello");
        return;
    }
    void m1(int i){
        System.out.println("m1(int i)in hello");
    }
    void m1(long l){
        System.out.println("m1(long l)in hello");
    }
    void m1(char ch){
        System.out.println("m1(char ch):"+ch);
    }
}

public class program6_point19 {
    public static void main(String[] args) {
        over1 o1=new over1();
        o1.m1(111);
        o1.m1(65);

        o1.m1((byte)111);
        o1.m1((short)111);
        o1.m1('a');
    }
}
