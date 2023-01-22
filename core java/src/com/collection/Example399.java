package com.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class Example399 {
    public static void main(String[] args) {
        Vector v1=new Vector();
        ArrayList al=new ArrayList();
        System.out.println(al.size());
        System.out.println(al);
        al.add("aa");
        al.add("bb");
        al.add("cc");
        al.add("dd");
        al.add("ee");
        System.out.println(al.size());
        System.out.println(al);
        System.out.println("************Vector :***************\n");
        v1.add(al);
        System.out.println("vector :"+v1);
        v1.add("xyz");
        v1.add(123);
        v1.addElement("abc");
        v1.addElement(9999);
        System.out.println(v1);
        System.out.println("************Enumerator :***********\n");
        Enumeration en=v1.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        System.out.println("************List Iterator :***********");
        ListIterator li= v1.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        System.out.println("**********previous :*************\n");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}//                DONE COMPLETELY
