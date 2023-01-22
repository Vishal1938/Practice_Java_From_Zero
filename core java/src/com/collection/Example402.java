package com.collection;

import java.util.*;

public class Example402 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("aa");
        hs.add("bb");
        hs.add("cc");
        hs.add("dd");
        System.out.println(hs);
        Iterator it=hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("List iterator :************\n");
        List list=new ArrayList(hs);
        ListIterator lt=list.listIterator();
        while (lt.hasNext()){
            System.out.println(lt.next());
        }
        System.out.println("*******Reverse*******");
        while (lt.hasPrevious()){
            System.out.println(lt.previous());
        }
        System.out.println("*********************\n");
        ArrayList al2=new ArrayList();
        al2.add("aa");
        al2.add("bb");
        al2.add("cc");
        System.out.println(al2);
    }
}//                            DONE COMPLETELY
