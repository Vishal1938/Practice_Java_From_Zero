package com.company;
class pack1{
}
class Age1{
}
class Age2 extends Age1{
}

public class program14_example1 {
    public static void main(String[] args) {
        pack1 p1=new pack1();
        Class cls =p1.getClass();
        System.out.println(cls);
        String cname= cls.getName();
        System.out.println(cname);
        System.out.println(p1.getClass().getName());
        System.out.println(p1.getClass().getSuperclass().getSimpleName());
        System.out.println(p1.getClass().getPackage());
     //   pack1 p2=null;
        Age1 a1= new Age1();
        Age1 a2=new Age2();
        Object o= new String("abc");
        Object o1=new char['A'];
        Object o2=new Byte[123];
        Object o3=new short[23];
        System.out.println(a1.getClass().getName());
        System.out.println(a1.getClass().getSuperclass());
        System.out.println(a2.getClass().getName());
        System.out.println(a2.getClass().getSuperclass());
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getSuperclass());
        System.out.println(o1.getClass().getName());
        System.out.println(o1.getClass().getSuperclass());
        System.out.println(o2.getClass().getName());
        System.out.println(o2.getClass().getSuperclass());
        System.out.println(o2.getClass().getSuperclass());
        System.out.println(o3.getClass().getName());
        System.out.println(o3.getClass().getSuperclass());
    }
}
