package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSearchDemo {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("z");
        l.add("A");
        l.add("M");
        l.add("K");
        l.add("a");
        System.out.println(l);//[z,A,M,K,a]
        Collections.sort(l);
        System.out.println(l);//[A,K,M,a,z]
        System.out.println(Collections.binarySearch(l,"z"));//4
        System.out.println(Collections.binarySearch(l,"J"));//-2
    }
}
