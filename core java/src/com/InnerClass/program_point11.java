package com.InnerClass;
class Outer3{
    interface c1{
        int a=10;
        void m1();
    }
    interface c2{
        static int b=20;
        public void m2();
    }
    interface c3 extends c1,c2{
        int c=11;
        void m3();
    }
    interface c4{
        int d=30;
        void m4();
    }
    interface c5{
        int e=40;
        void m5();
    }
    interface c6 extends c4,c5{
        int c=33;
        void m3();
    }
    abstract class Inner implements c3,c6{
        public void m1(){
            System.out.println("m1 in inner1");
        }
        public void m2(){
            System.out.println("m2 in inner1");
        }
        public void m4(){
            System.out.println("m4 in inner1 ");
        }
        public void m5(){
            System.out.println("m5 in inner1");
        }
        class Inner2 extends Inner{
            public void m3(){
                System.out.println("m3 in inner");
            }
        }
    }
}
public class program_point11 {
    public static void main(String[] args) {
        Outer3 otr=new Outer3();
        Outer3.Inner oi4=null;
        oi4 = oi4.new Inner2();
        oi4.m1();
        oi4.m2();
        oi4.m3();
        oi4.m4();
        oi4.m5();
    }
}
