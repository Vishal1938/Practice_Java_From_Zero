package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("N");
        //l.add(new Integer(10));//class cast Exception
        //l.add(null);//Null pointer Exception
        System.out.println("Before Sorting :" + l);//[Z,A,K,N]
        Collections.sort(l);
        System.out.println("After Sorting :" + l);//[A,K,N,Z]
    }
}