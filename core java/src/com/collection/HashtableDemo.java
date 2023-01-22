package com.collection;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();
        h.put(new TempTemp(5),"A");
        h.put(new TempTemp(2),"B");
        h.put(new TempTemp(6),"C");
        h.put(new TempTemp(15),"D");
        h.put(new TempTemp(34),"E");
        h.put(new TempTemp(15),"A");
        System.out.println(h);//{15=D, 2=B, 6=C, 5=A, 34=E, 15=A}
    }
}
class TempTemp{
    int i;
    TempTemp(int i){
        this.i=i;
    }
    public int hashcode(){
        return i;
    }
    public String toString(){
        return i+"";
    }
}