package com.company;
interface x1{
    int a=11;
    default void m1(){
        System.out.println(" default in m1 in x1");
    }
}
interface x2{
    int a=22;
    static void m2(){
        System.out.println("static void in m2 in x2");
    }
}
class W implements x1,x2{
    static int  b=55;
    static {
        System.out.println("IB in class w");
    }
}
public class practice_package {
    public static void main(String[] args) {
    /*    W w1 = new W();
        W w2=new W();
        Class c1 = w1.getClass();
        System.out.println("class name"+c1.getName());
        System.out.println("super class name"+c1.getSuperclass().getName());
        System.out.println("package Information="+c1.getPackage());
        System.out.println(w1.hashCode());
          System.out.println(w2.hashCode());
        System.out.println(w1==w2);
        System.out.println(w1.equals(w2));*/
        System.out.println(W.b);
        System.out.println(x1.a);
        System.out.println(x2.a);

    }
}
