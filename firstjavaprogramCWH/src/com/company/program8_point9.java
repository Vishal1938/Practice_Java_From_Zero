package com.company;
class haha {
    int a;
    int b;
    static int c = 30;

    {
        System.out.println("IB in hello");
        int a = 101;
        int b = 202;
        {
            System.out.println("local block in IB");
            int a1 = 111;
            int b1 = 222;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(this.a);
            System.out.println(this.b);
            System.out.println(a1);
            System.out.println(b1);
            System.out.println("local block in IB");
        }
    }
    static {
        System.out.println("SB in hello");
        int a=101;
        int b=202;
        {
            System.out.println("local block in SB");
            int a1=111;
            int b1=222;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(a1);
            System.out.println(b1);
            System.out.println("local block in SB");
        }
        }
        haha(){
            System.out.println("default constructor in hello");
    }
    haha(int a1,int b1){
    }
    void m1(){
        System.out.println("m1 in haha");
    }
}
public class program8_point9 {
    public static void main(String[] args) {
        haha h1= new haha();
        h1.m1();

    }

}
