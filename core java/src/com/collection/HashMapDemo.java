package com.collection;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashMapDemo {
    public static void main(String[] args) throws InterruptedException{
     //   HashMap m=new HashMap();//system.gc method is not called
        WeakHashMap m=new WeakHashMap();//system.gc is called
        Temp t=new Temp();
        m.put(t,"vishal");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}
class Temp{
    public String toString(){
        return "temp";
    }
    public void finalize(){
        System.out.println("Finalize method called");
    }
}//           DONE COMPLETELY