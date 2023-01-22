package com.company;
class BLOCKS {
    int a = 22;
    static int b = 11;
    {
        System.out.println("IB");
        System.out.println(a);
        System.out.println(b);
    }

    static {
        System.out.println("SB");
     //   System.out.println(b1.a);
        System.out.println(b);
    }
    void m1(){
        System.out.println("m1 in blocks");
    }
    static void m2(){
        System.out.println("m2 in blocks");
    }
    void m11(){
        System.out.println("m11 in blocks");
    }
    static void m22(BLOCKS b1){
        System.out.println("m22 in blocks");
        m2();
        b1.m1();
    }
}

public class practice_blocks {
  /*  BLOCKS b2=new BLOCKS();
    static {
        System.out.println("IB in practice");
        BLOCKS b2=new BLOCKS();
     //   b1.m1();
      //  b2.m2();
    }
    static BLOCKS b1=new BLOCKS();
     {
        System.out.println("SB in practice");
    }*/

    public static void main(String[] args) {
        System.out.println("main methode");
        BLOCKS.m22(null);
    }
}
