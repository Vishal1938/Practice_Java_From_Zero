package com.company;
class con2{
    int a;
    int b;
    static int c=30;
    {
        System.out.println("IB in con1");
    }
    static {
        System.out.println("sb in con1");
    }
    con2(){
        System.out.println("Default con in con2");
    }
    void con2(){
        System.out.println("con2() in hello");
    }
    con2(int a1){
        System.out.println("1 param cons in hello");
        a=a1;
    }
    con2(int a1,int b1){
        a=a1;
        b=b1;
    }
    {
        System.out.println("iB in hello");
    }
    static {
        System.out.println("SB in hello");
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class program7_point2 {
    public static void main(String[] args) {
        con2 c1=new con2();
        c1.show();
        c1.con2();
    }
}
