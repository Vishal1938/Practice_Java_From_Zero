package com.InnerClass;
interface i1{
    void m1();
}
class Out22{
    i1 mm(){
        class Inner implements i1{
            int a=11;
            public void m1() {
                System.out.println("m1 in inner");
            }
        }
        return new Inner();
    }
    void show(){
        System.out.println("show in outer");
        i1 i1=mm();
        i1.m1();
    }
}

public class program12_point15 {
    public static void main(String[] args) {
        Out22 o1=new Out22();
        o1.show();
    }
}
