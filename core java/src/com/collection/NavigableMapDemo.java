package com.collection;

import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        TreeMap<String,String> t=new TreeMap<String,String>();
        t.put("D","Delhi");
        t.put("F","Facebook");
        t.put("A","Amazon");
        t.put("T","Tesla");
        t.put("M","Microsoft");
        System.out.println(t);//{A=Amazon, D=Delhi, F=Facebook, M=Microsoft, T=Tesla}
        System.out.println(t.ceilingKey("F"));//F
        System.out.println(t.higherKey("M"));//T
        System.out.println(t.floorKey("M"));//M
        System.out.println(t.lowerKey("M"));//F
        System.out.println(t.pollFirstEntry());//A=Amazon
        System.out.println(t.pollLastEntry());//T=Tesla
        System.out.println(t.descendingMap());//{M=Microsoft, F=Facebook, D=Delhi}
        System.out.println(t);//{D=Delhi, F=Facebook, M=Microsoft}
    }
}
