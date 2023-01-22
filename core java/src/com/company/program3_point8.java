package com.company;
import java.util.ArrayList;
class ARRAY{
    void m1(){
        System.out.println("m1 in ARRAY");
    }
}
class LIST{
    void m2(){
        System.out.println("m2 in LIST");
    }
}
public class program3_point8 {
    public static void main(String[] args) {
        ARRAY a1=new ARRAY();
        LIST l1=new LIST();
        if(a1 instanceof ARRAY){
            System.out.println("if....");
            a1.m1();
        }else if(l1 instanceof LIST){
            System.out.println("Else.....");
            l1.m2();
        }
        System.out.println("ARRAY LIST");

        ArrayList al=new ArrayList();
        System.out.println(al);
        al.add(new ARRAY());
        al.add(new LIST());
        al.add(new Object());
        al.add(new String("jtc"));
        al.add(99);
        System.out.println("for loop");
        for(Object o:al){
            System.out.println(o);
            if(o instanceof ARRAY){
                ARRAY a11=(ARRAY)o ;
                a11.m1();
            }else if(o instanceof LIST){
                LIST l11=(LIST)o;
                l11.m2();
            }else if(o instanceof Integer){
                Integer i=(Integer) o;
                System.out.println(i);
            }
        }
    }
}
