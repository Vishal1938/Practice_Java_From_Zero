package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example403 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        System.out.println("********Hashset********");
        hs.add(new Integer(99));
        System.out.println(hs.add("som"));
        hs.add("vishal@jtc");
        System.out.println(hs.add("vishal"));
        System.out.println(hs);
        System.out.println("*********Treeset********");
        TreeSet ts=new TreeSet();
        //ts.add(new Integer(99));
        System.out.println(ts.add("vishal"));//true
        ts.add("vishal@jtc");
        ts.add("vishal");
        ts.add("aaaa");
        ts.add("bbbb");
        ts.add("cccc");
        ts.add("RRR");
        System.out.println(ts);
        System.out.println("******LinkedHashset******");
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(new Integer(99));
        System.out.println(lhs.add("vishal"));
        lhs.add("vishal@jtc");
        System.out.println(lhs.add("vishal"));
        System.out.println(lhs);
    }
}//              DONE COMLETELY
