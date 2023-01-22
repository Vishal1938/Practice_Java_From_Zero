package com.company;
class hello3{
    int a =10;
    int b =20;
    static int c=30;
    {
        System.out.println("IB in hello");
    }
    static {
        System.out.println("SB in hello");

    }
    int m1(){
        System.out.println("m1 in hello");
        return 10;
    }
    void m2(){
        System.out.println("m2 in hello");
    }
    static void m3(){
        System.out.println("m3 in hello");
    }
    static int m4(int a1){
        System.out.println("m4 in hello");
        return a1;
    }

}

public class vishal_mehod2 {
    public static void main(String[] args) {
        hello3 h3= new hello3();
        int i1=h3.m1();
        h3.m2();
        System.out.println(i1);
        int i2=hello3.m4(19090);
        System.out.println(i2);
    }
}
