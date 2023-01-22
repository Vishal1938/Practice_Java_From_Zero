package com.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreesetDemo2 {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new MyComparator10());
        t.add("Neeraj");
        t.add("Shardul");
        t.add("Ravi");
        t.add("Vishal");
        t.add("Bunti");
        t.add("Rajamauli");
        System.out.println(t);
    }
}
class MyComparator10 implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1=obj1.toString();
        String s2=obj2.toString();
        return s2.compareTo(s1);//output-in reverse alphabetical order
      //  return s1.compareTo(s2);//output-in alphabetical order
      //  return -s2.compareTo(s1);//output-in alphabetcal order
      //  return -s1.compareTo(s2);//output- in reverse alphabetical order
    }
}//                               DONE COMPLETELY