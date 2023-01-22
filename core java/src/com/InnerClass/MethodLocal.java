package com.InnerClass;

public class MethodLocal {
    public static void main(String[] args) {
      /* Test t=new Test();
       t.m1();*/
        Test.m1();
    }
}
class Test{
    int i=10;
    static int j=20;
    public static void m1(){
        int k=30;
        int m=40;
        class Inner{
            public static void m2(){
             //   System.out.println(i);
                System.out.println(j);
              //  System.out.println(k);
              //  System.out.println(m);
            }
        }
        /*Inner i=new Inner();
        i.m2();*/
        Inner.m2();
    }
}