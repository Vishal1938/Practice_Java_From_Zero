package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Example395 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add("abc");
        al1.add(199);
        al1.add(11.11);
        System.out.println(al1);
        System.out.println("al2-********************\n");
        ArrayList al2=new ArrayList();
        al2.add(99999);
        al2.add("vishal");
        System.out.println(al2);
        al1.add(al2);
        System.out.println(al1);
        System.out.println("Iterator-*******************\n");
        Iterator it1= al1.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("**********************\n");
        System.out.println(al2);
        ArrayList al3=new ArrayList();
        al3.add(9999);
        al3.add("som");
        al3.add("abc");
        al3.add(91819);
        System.out.println(al3);
        System.out.println("Return Method");
        System.out.println(al2);
        System.out.println(al3);
        //al3.returnAll(al3);
        System.out.println(al2);
        System.out.println(al3);
        al2.clear();
        al3.clear();
        System.out.println(al2);
        System.out.println(al3);
    }
}//        DONE COMPLETELY
