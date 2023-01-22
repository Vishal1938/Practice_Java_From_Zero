package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example404 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(new Integer(99));
        System.out.println(hs.add("vishal"));
        hs.add("vishal@jtc");
        System.out.println(hs.add("vishal"));
        System.out.println(hs);
        TreeSet ts=new TreeSet();
       // ts.add(new Integer(99));
        System.out.println(ts.add("vishal"));
        ts.add("vishal@jtc");
        System.out.println(ts.add("som"));
        ts.add("aaaa");
        ts.add("bbbb");
        ts.add("cccc");
        System.out.println(ts);// IN ALPHABETICAL ORDER
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(new Integer(99));
        System.out.println(lhs.add("som"));
        lhs.add("som@jtc");
        System.out.println(lhs.add("som"));
        System.out.println(lhs);//ADDED ORDER IS PRESERVED
    }
}
