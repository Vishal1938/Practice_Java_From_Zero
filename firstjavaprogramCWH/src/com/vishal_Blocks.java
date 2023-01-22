package com;
class vishal{
    int a=10;
    int b=20;
    static int c= 30;
    {
        System.out.println("IB in vishal");
    }
    static {
        System.out.println("SB1 in vishal");
    }
    {
        System.out.println("ib2 in vishal");
    }
}
public class vishal_Blocks {
    int aa= 111;
    static int bb=222;
    {
        System.out.println("ib1 in vishal blocks");
        System.out.println(aa);
        System.out.println(bb);
    }
    static {
        System.out.println("Sb in vishal blocks");
        System.out.println(bb);
    }

    public static void main(String[] args) {
        System.out.println("in main");
        System.out.println(vishal.c);
    //    System.out.println();
        vishal v1 = new vishal();
        vishal v2= new vishal();
        vishal_Blocks vb = new vishal_Blocks();

    }
}
