package com.collection;

import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<Integer>();
        t.add(333);
        t.add(222);
        t.add(111);
        t.add(555);
        t.add(444);
        System.out.println(t);
        System.out.println(t.ceiling(222));
        System.out.println(t.higher(200));
        System.out.println(t.floor(333));
        System.out.println(t.lower(300));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t.descendingSet());
        System.out.println(t);
    }
}
