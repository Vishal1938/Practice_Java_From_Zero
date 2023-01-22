package com.company;
class obj{
}
class ect{
    void m1(){
        System.out.println("m1 in hello");
    }
    void m1(obj obj){
        System.out.println("m1(hai hai) in hello");
    }
    void m1(int a[]){
        System.out.println("m1(int a[])in hello");
    }
    void m1(Object O){
        System.out.println("m1(m1(object o) in hello");
    }
    void m1(String str){
        System.out.println("m1(strings) in hello");
    }
}
public class program6_point17 {
    public static void main(String[] args) {
        ect e1=new ect();
        e1.m1();
        e1.m1(new obj());
 //       e1.m1(null);
        e1.m1("abc");
    }
}
