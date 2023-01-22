package com.company;
class hai{
    void m1(){
        System.out.println("M1 in hai");
    }
    static void m2(){
        System.out.println("m2 in hai");
    }

}
class hello5{
    int m11(){
        System.out.println("m11 in hello");
        return 10;
    }
    hai m12(){
        System.out.println("m22 in hello");
        return new hai();
    }
    hai m13(hai na){
        System.out.println("m13(hai na) in hello");
        hai.m2();
        return m12();
    }
    Object m14(){
        System.out.println("m14 in hello");
        return 11;
    }
    Object m15(){
        System.out.println("m15 in hello");
        return new hai();
    }
    static hai m16(){
        System.out.println("m16() in hello");
        return new hai();
    }

}
public class vishal_methode4 {
    public static void main(String[] args) {
        hello5 h5=new hello5();
        int i =h5.m11();
        System.out.println(i);
        hai hai=h5.m12();
        hai.m1();
        hai hai5 = h5.m13(null);
        System.out.println(hai.hashCode());
        System.out.println(hai5.hashCode());
        hai hai2=hello5.m16();
        hai hai3=hello5.m16();
        System.out.println(hai2.hashCode());
        System.out.println(hai3.hashCode());

    }
}
