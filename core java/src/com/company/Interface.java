package com.company;
interface Fee1{
    byte a=111;
    void m1 ();
    int m2();
    byte m3(byte b);
   // String m4();
}
interface Fee2{
    short a=222;
    //void m11();
    String m12();
    int m3(int a1);
}
interface Fee3{
    long a=333;
  //  void m21();
    char m22(char ch);
}
abstract class A11 implements Fee1,Fee2,Fee3{
    public void m1(){
        System.out.println("m11 in class A");
    }
    public int m2(){
        System.out.println("M2(int) in class A");
        return 11;
    }
    public byte m3(byte b){
        System.out.println("M3(byte b) in class A");
        return 22;
    }
    public String m12(){
        System.out.println("m12 in class A");
        return "123";
    }
    public int m3(int x){
        System.out.println("m3(int) in class A");
        return 454;
    }
    public char m22(char A){
        System.out.println("char in class A");
        return 0;
    }
}
class B11 extends A11{
    void show(){
        System.out.println(Fee1.a);
        System.out.println(Fee2.a);
        System.out.println(Fee3.a);
        System.out.println();
    }
}
public class Interface {
    public static void main(String[] args) {
        B11 b1= new B11();
        b1.m3(456);
        b1.m3(789);
        b1.m2();
        System.out.println(b1.m22('B'));
        System.out.println(b1.m12());
        System.out.println();
        Fee3 f3=null;
        f3 =new B11();
        f3.m22('A');
        Fee1 f1=null;
        f1=new B11();
        f1.m1();
        f1.m2();
        Fee2 f2=null;
        String s1=f2.m12();
        System.out.println(s1);
    }
}
