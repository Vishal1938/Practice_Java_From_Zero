package com.company;
class x{
}
class y extends x{
}
class how{
    x m1(){
        System.out.println("m1 in hello");
        return new x();
    }
    y m2(){
        System.out.println("m2 in hello");
        return new y();
    }
    x m3(x a1){
        System.out.println("m3(A a1)in hello");
        return a1;
    }
    x m4(y b1){
        System.out.println("m4(B b1)in hello");
        return b1;
    }
}
class what{
    y m1(){
        System.out.println("m1 in hai");
        return new y();
    }
    x m2(){
        System.out.println("m2 in hai");
        return new y();
    }
    x m3(y b1){
        System.out.println("m3 (B b1) in hai");
        return b1;
    }
    x m4(x a1){
        System.out.println("m3(A a1) in hai");
        return a1;
    }
}
public class program10_point4 {
    public static void main(String[] args) {
        what w1=new what();
        w1.m1();
        w1.m2();
     //   w1.m3();
        how h1= new how();
        h1.m1();
        h1.m2();

    }
}
