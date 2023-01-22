package com.company;
class This2{
    int a;
    int b;
    static int c=30;
    {
        int a=101;
        int b=202;
        int c=303;
        System.out.println("IB in this");
        System.out.println(this);
        System.out.println(this.hashCode());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    static {
        int a=101;
        int b=202;
        int c=303;
        System.out.println("SB in this");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    This2(){
        System.out.println("default constucor in this");
        System.out.println(this);
        System.out.println(this.hashCode());
    }
    This2(int a){
        System.out.println("1 param cons.");
        System.out.println(this);
        System.out.println(this.hashCode());
        this.a=a;
    }
    This2(int a,int b){
        System.out.println("2 param cons.");
        System.out.println(this);
        System.out.println(this.hashCode());
        this.a=a;
        this.b=b;
    }
    void show(){
        int a=100;
        int b=200;
        int c=300;
        System.out.println("show in hello");
        System.out.println(this);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }
    static void show1(){
        int a=999;
        int b=888;
        int c=777;
        System.out.println("show1 in hello");
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


public class program8_point2 {
    public static void main(String[] args) {
        This2 t1= new This2();
        System.out.println(t1);
        System.out.println(t1.hashCode());
        t1.show();
        System.out.println("***2nd object creation***");
        This2 t2=new This2(999);
        t2.show();
        This2 t3= new This2(99,666);
        t3.show();
    }
}
