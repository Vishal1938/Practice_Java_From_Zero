package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue(15,new MyComparator77());
        q.offer("A");
        q.offer("Z");
        q.offer("C");
        q.offer("D");
        q.offer("R");
        System.out.println(q);
    }
}
class MyComparator77 implements Comparator{
    public int compare(Object obj1,Object obj2){
        String s1=(String) obj1;
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }
}//this processor won't provide proper support for PriorityQueue