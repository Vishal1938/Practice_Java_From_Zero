package com.InnerClass;
class outer3{
    int a=10;
    static int b=20;
    private class Inner{
        int ab=101;
        void m1(){
            System.out.println("m1 in inner");
        }
    }
    void show(){
        System.out.println("show in inner");
        System.out.println(a);
        System.out.println(b);
        Inner inr=new Inner();
        System.out.println(inr.ab);
    }
}
public class program12_point10 {
    public static void main(String[] args) {
outer3 o3=new outer3();
o3.show();
    }
}
