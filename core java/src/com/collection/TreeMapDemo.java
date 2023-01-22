package com.collection;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap t=new TreeMap();
        t.put("XXX",10);
        t.put("AAA",20);
        t.put("ZZZ",30);
        t.put("LLL",40);
        System.out.println(t);
    }
}
class MyComparator22 implements Comparator{
    public int compare(Object Obj1,Object Obj2){
        String s1=Obj1.toString();
        String s2=Obj2.toString();
        return s2.compareTo(s1);
        //output-reverse alphabetical order
        //{ZZZ=30,XXX=10,LLL=40,AAA=20}
    }
}