package com.collection;

import java.util.*;

public class HashMapDemo11 {
    public static void main(String[] args) {
        //HashMap m=new HashMap();//added order is not preserved
        LinkedHashMap m=new LinkedHashMap();// added order is preserved
        m.put("Ashish",700);
        m.put("banti",600);
        m.put("Rahul",500);
        m.put("Neeraj",800);
        m.put("Vishal",900);
        System.out.println(m);
        System.out.println("******1");
        System.out.println(m.put("banti",650));
        Set s=m.keySet();
        System.out.println(s);
        Collection c=m.values();
        System.out.println(c);
        Set s1=m.entrySet();
        System.out.println(s1);
        System.out.println("*****iterator*****");
        Iterator itr=s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1=(Map.Entry)itr.next();
            System.out.println(m1.getKey()+"______"+m1.getValue());
            if(m1.getKey().equals("Neeraj")){
                m1.setValue(10000);
            }
        }
        System.out.println(m);
    }
}//                DONE COMPLETELY
/*{Rahul=500, Neeraj=800, banti=600, Ashish=700, Vishal=900}
        ******1
        600
        [Rahul, Neeraj, banti, Ashish, Vishal]
        [500, 800, 650, 700, 900]
        [Rahul=500, Neeraj=800, banti=650, Ashish=700, Vishal=900]
        *****iterator*****
        Rahul______500
        Neeraj______800
        banti______650
        Ashish______700
        Vishal______900
        {Rahul=500, Neeraj=10000, banti=650, Ashish=700, Vishal=900}*/

