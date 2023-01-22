package com.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("Bunti");
        l.add("vishal");
        l.add("Neeraj");
        l.add("Raju");
        l.add("Sanjay");
        System.out.println("one :"+l);
        ListIterator ltr= l.listIterator();
        while(ltr.hasNext()){
            String s=(String) ltr.next();
            if(s.equals("vishal")){
                ltr.remove();
                System.out.println("Two :"+l);
            }
            else if(s.equals("Raju")){
                ltr.add("Ravi");
                System.out.println("Three :"+l);
            }
            else if(s.equals("Bunti")){
                ltr.set("Bubly");
                System.out.println("Four :"+l);
            }
        }
    }
}//               DONE COMPLETELY
/*Output-one :[Bunti, vishal, Neeraj, Raju, Sanjay]
        Four :[Bubly, vishal, Neeraj, Raju, Sanjay]
        Two :[Bubly, Neeraj, Raju, Sanjay]
        Three :[Bubly, Neeraj, Raju, Ravi, Sanjay]
*/