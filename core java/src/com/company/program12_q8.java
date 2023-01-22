package com.company;
interface E1{
    int a=10;
    void m11();
    class INNER{
        int a1=10;
        void m1(){
            System.out.println("m1 in inner");
        }
    }
}
interface E2{
    static int b=20;
    void m11();
        class INNER2 implements E1,E2{
            public void m11(){
                System.out.println("m11 in inner2");
            }
    }
}
class Hellotest extends E1.INNER {
    public void m1() {
        System.out.println("m1 in hello test");
    }
}
class Hero extends E1.INNER{
    public void m1(){
        System.out.println("m1 in hero class");
    }
}
class zero extends E2.INNER2{
    public void m11(){
        System.out.println("zero in hello class");
    }
        }
        interface E3 extends E1,E2{
    int a1=101;
    static void car(){
        System.out.println("car");
    }
        }
public class program12_q8 {
    public static void main(String[] args) {
        E1 i1=null;
        i1=new E2.INNER2();
        i1.m11();
        E1.INNER ei1=null;
        ei1=new Hellotest();
        ei1.m1();
        E1.INNER ei2=null;
        ei2=new Hero();
        ei2.m1();
        E2.INNER2 ei11=null;
        ei11=new E2.INNER2();
        ei11.m11();
        E3 e3=null;
    }
}
