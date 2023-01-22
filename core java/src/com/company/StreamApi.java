package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> marks=new ArrayList<Integer>();
        marks.add(40);
        marks.add(32);
        marks.add(10);
        marks.add(85);
        marks.add(70);
        marks.add(95);
        marks.stream().filter(i->i>35).forEach(System.out::println);
        ListIterator ltr=marks.listIterator();
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }
        while(ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(12);
        set.add(34);
        set.add(38);
        set.add(78);
        set.add(45);
        set.add(26);
        set.stream().filter(i->i%2==0).forEach(System.out::println);
        ArrayList<Integer> lst=new ArrayList<Integer>(set);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator ltr1=lst.listIterator();
        while(ltr1.hasNext()){
            System.out.println(ltr.next());
        }
        while(ltr1.hasPrevious()){
            System.out.println(ltr1.previous());
        }

    }
}
