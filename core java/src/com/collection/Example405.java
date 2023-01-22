package com.collection;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example405 {
    public static void main(String[] args) {
        LinkedHashMap hm=new LinkedHashMap();
        hm.put("sid",new Integer(99));
        hm.put("sname","vishal");
        hm.put("fee",new Double(90000.99));
        System.out.println("One :"+hm);
        hm.put("x","10");
        hm.put(new Integer(99),"10");
        System.out.println("Two :"+hm);
        hm.put("x","20");
        System.out.println("Three :"+hm);
        hm.put(null,null);
        System.out.println("Four :"+hm);
        Hashtable ht=new Hashtable();
        ht.put("sid",new Integer(99));
        ht.put("sname","vishal");
        ht.put("fee",new Double(90000.88));
        System.out.println("Five :"+ht);
        ht.put("x","10");
        ht.put(new Integer(99),"10");
        System.out.println(ht);
        ht.put("x","20");
        System.out.println("Six :"+ht);
        TreeMap tm=new TreeMap();
        tm.put("sid",new Integer(99));
        tm.put("sname","vishal");
        tm.put("x","20");
        System.out.println("Seven :"+tm);
        tm.put("x","20");
        System.out.println("Eight :"+tm);
        tm.put("z",null);
        System.out.println("Nine :"+tm);

    }
}
