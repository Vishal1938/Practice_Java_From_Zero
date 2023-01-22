package com.InnerClass;

    public class OuterDemo {
        class Inner {
            public static void m1() {
                System.out.println("Inner class method");
            }
        }
        public void m2(){
            Inner i=new Inner();
            i.m1();
        }
        public static void main(String[] args) {
            OuterDemo o = new OuterDemo();
            o.m2();
        }
    }
