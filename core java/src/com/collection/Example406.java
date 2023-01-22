package com.collection;

import java.util.*;

public class Example406 {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.put("sid",new Integer(99));
        hm.put("sname","Vishal");
        hm.put("email","abc@gmail");
        System.out.println("1..."+hm);
        System.out.println("2..."+hm.size());
        System.out.println("3..."+hm.isEmpty());
        System.out.println("4..."+hm.containsKey("sid"));
        System.out.println("5..."+hm.containsKey("sid1"));
        System.out.println("6..."+hm.containsValue("vishal"));
        System.out.println("7..."+hm.containsValue("xyz"));
        System.out.println("8..."+hm.get("sname"));
        System.out.println("9..."+hm);
        hm.put("sname","singh");
        System.out.println("10..."+hm);
        hm.put("sname1","singh");
        System.out.println("11..."+hm);
        hm.put(null,"singh");
        hm.put(new Double(999.99),null);
        System.out.println("12..."+hm);
        hm.remove("xx");
        System.out.println(hm);
        Collection col=hm.values();
        System.out.println("13..."+col);
        System.out.println("using KeySet()");
        Set s=hm.keySet();
        System.out.println("14..."+s);
        Iterator it=s.iterator();
        while(it.hasNext()){
            Object o1=it.next();
            String Key="";
            if(o1!=null){
                Key=o1.toString();
            }
            else {
                Key=null;
            }
            System.out.println("key ..:"+Key);
            Object o2=hm.get(Key);
            String val="";
            if(o2!=null){
                val=o2.toString();
            }
            else{
                val=null;
            }
            System.out.println("15..."+val);
        }
        System.out.println("using entrySet()");
        Set es=hm.entrySet();
        Iterator it1=es.iterator();
        while (it1.hasNext());
        Object o=it1.next();
        Map.Entry me=(Map.Entry)o;
        Object o1=me.getKey();
        String key="";
        if(o1!=null){
           key =o1.toString();
        }
        else {
            key=null;
        }
        Object o2=me.getKey();
        String val="";
        if(o1!=null){
            val =o2.toString();
        }
        else {
            val=null;
        }
        System.out.println(key+"..."+val);
    }
}
