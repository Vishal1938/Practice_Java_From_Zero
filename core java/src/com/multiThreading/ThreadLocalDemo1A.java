package com.multiThreading;

public class ThreadLocalDemo1A {
    public static void main(String[] args) {
        ThreadLocal tl=new ThreadLocal(){
            public Object initialValue(){
                return "XYZ";
            }
        };
        System.out.println(tl.get());//XYZ
        tl.set("Ravi");
        System.out.println(tl.get());//Ravi
        tl.remove();
        System.out.println(tl.get());//XYZ
    }
}//                  //DONE COMPLETELY
