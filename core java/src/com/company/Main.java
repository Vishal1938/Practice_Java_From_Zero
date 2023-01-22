package com.company;
class A{
    void m1(){
        System.out.println("m1 in A");
    }
}
class B extends A{
    void m2(){
        System.out.println("m2 in B");
    }
}
class c{}
class hello{
    void m11(){
        System.out.println("m11 in hello");
    }
    int m12(){
        System.out.println("m12 in hello");
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
    B m15(){
        System.out.println("m13 in hello");
        return new B();
    }
    B m16(){
        System.out.println("m16 in hello");
        return (B)new A();
    }
    A m19(){
        System.out.println("m19 in hello");
        return(B)m14();
    }


}
public class Main {

    public static void main(String[] args) {
	 hello h1 = new hello();
	 int i= h1.m12();
        System.out.println(i);
        h1.m15();
     //   h1.m16();
        h1.m19();
        A a1= h1.m14();
        B b1=(B)h1.m14();
        b1.m1();
        b1.m2();
    }
}
