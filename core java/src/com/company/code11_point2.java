package com.company;
abstract class hello5{
    int a=11;
    int b=22;
    static int c=33;
    {
        System.out.println("IB in hello");
    }
    static {
        System.out.println("sb in hello");
    }
    hello5(){
        System.out.println("Default con in hello");
    }
    hello5(int a,int b){
        System.out.println("2 para con in hello");
    }
    void m1(){
        System.out.println("m1 in hello");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    abstract void m2();
}
class Hai5 extends hello5{
    public void m2(){
        System.out.println("m2 in hai");
    }
    public void m3(){
        System.out.println("m3 in hai");
    }
    void show(){
        System.out.println("show in hai");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class code11_point2 {
    public static void main(String[] args) {
        hello5 h1=null;
        h1 =new Hai5();
        h1.m2();
        Hai5 hai=(Hai5)h1 ;
        hai.m3();
        hai.show();
    }
}
