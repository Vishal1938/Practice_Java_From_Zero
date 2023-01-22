package com.InnerClass;
class out{
    int a=10;
    static int b=20;
    void m1(){
        System.out.println("m1 in outer");
        int aa=101;
        final int bb=202;
        class In{
            int ab=99;
            {
                System.out.println("ib in INNER");
            }
            void m2(){
                System.out.println("m2 in INNer");
                System.out.println(a);
                System.out.println(b);
                System.out.println(aa);
                System.out.println(bb);
                System.out.println(ab);
            }
        }
        In inr =new In();
        System.out.println(inr.ab);
        inr.m2();
    }
}

public class program12_point14 {
    public static void main(String[] args) {
        out otr=new out();
        otr.m1();
    }
}
