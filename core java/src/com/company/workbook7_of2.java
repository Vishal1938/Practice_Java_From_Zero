package com.company;

public class workbook7_of2 {
    public static void main(String[] args) {
        System.out.println("**MAIN METHOD**");
        TestClass cl=null;
        System.out.println("--Ref Created--\n");
        cl=new TestClass();
        System.out.println(cl);
    }
}
class TestClass{
    static {
        System.out.println("--static of testclass--");
    }
    TestClass(){
        System.out.println("--TestClass() cons--");
    }
}
