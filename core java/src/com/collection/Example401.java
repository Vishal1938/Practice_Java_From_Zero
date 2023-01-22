package com.collection;

import java.util.HashSet;

public class Example401 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add("aa");
        hs.add("bbc");
        hs.add("cc");
        hs.add("dd");
        hs.add(new Integer(56));
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.add("aa"));//false
        System.out.println(hs);
        hs.add(null);
        System.out.println(hs.add(null));//false
        System.out.println(hs);
    }
}//             DONE COMPLETELY
