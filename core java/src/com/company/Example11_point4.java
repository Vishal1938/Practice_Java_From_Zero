package com.company;
abstract class Swarg{
    int a=10;
    int b=20;
    static int c=30;
    {
        System.out.println("IB in swarg");
        System.out.println(this);
    }
    Swarg(){
        System.out.println("Default constructor in Swarg");
    }
    Swarg (int a,int b){
        System.out.println("2 para. constr. swarg");
        this.a=a;
        this.b=b;
    }
    protected abstract void m1();
    void m2(){
        int a=11;
        int b=22;
        int c=33;
        System.out.println("m2 in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
        System.out.println(this);
    }
    static void m3(){
        System.out.println("use of staic methode in abstract class");
    }
}
class Narak extends Swarg{
    int a;
    int b;
    static int c=60;
    {
        System.out.println("ib in In NAraq");
        System.out.println(this);
    }
    Narak (){
        System.out.println("Default constr in hai");
    }
    Narak(int a,int b){
        super(777,888);
        System.out.println("2 para constr. in hai");
        this.a=a;
        this.b= b;
    }
    void show(){
        int a=101;
        int b=202;
        int c=303;
        System.out.println("show in hai");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Hai class level variable");
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
        System.out.println("Hello class level variable");
        System.out.println(super.a);
        System.out.println(super.b);
        System.out.println(super.c);
    }
    public void m1(){
        System.out.println("m1 in hai");
    }
    static void m3(){
        System.out.println("m3 in hai");
    }
    static void m4(){
        System.out.println("m4 in hai");
    }
}

public class Example11_point4 {
    public static void main(String[] args) {
        Swarg s1=null;
        s1 = new Narak();
        s1.m2();
        System.out.println(s1);
        Swarg s2=new Narak();
        Narak n1=new Narak();
        s2.m2();
        Narak n2=new Narak();

    }
}
