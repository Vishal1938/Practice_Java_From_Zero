package com.company;
class poly{
    void m1(){
        System.out.println("m1 in A");
    }
}
class c extends poly{
    void m2(){
        System.out.println("m2 in B");
    }
}
class D{}
class how{
    void m11(){
        System.out.println("m11 in how");
    }
    int m12(){
        System.out.println("m12 in how");
        return 100;
    }
    A m13(){
        System.out.println("m13 in hello");
        return new A();
    }
    A m14(){
        System.out.println("m14 in hello");
        return new B();
    }
    B m19(){
        System.out.println("m19 in hello");
        return (B)m14();
    }
}
public class program10_point1 {
    public static void main(String[] args) {
        how h1=new how();
        int i= h1.m12();
        System.out.println(i);
        h1.m19();
     /*   poly a1=h1.m14();
        c b1=(c)h1.m14();
        b1.m1();
        b1.m2();*/
    }
}
