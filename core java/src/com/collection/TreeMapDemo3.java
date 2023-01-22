package com.collection;

import java.util.TreeMap;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        TreeMap m=new TreeMap();
        m.put(100,"zzz");
        m.put(103,"yyy");
        m.put(101,"xxx");
        m.put(104,106);
       // m.put("DDD","XXX");//class cast exception
       // m.put(null,"xxx");//null pointer exeception
        System.out.println(m);
        //output-on the basis of ascending order of key
        //{100=zzz,101=xxx,103=yyy,104=106}
    }
}
