package com.collection;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Collector;

public class TreeSetDemo1 {
    public static void main(String[] args) {
     //   TreeSet t=new TreeSet();//output-[0,10,21,25,30,55]
        TreeSet t=new TreeSet(new Mycomparator());
        t.add(21);
        t.add(10);
        t.add(55);
        t.add(25);
        t.add(0);
        t.add(30);
        System.out.println(t);//output-[55,30,25,21,10,0] ON THE BASIS OF PROVIDED IMPLEMENTATION
    }
}
class Mycomparator implements Comparator {
    public int compare (Object obj1,Object obj2){
        Integer I1=(Integer) obj1;
        Integer I2=(Integer) obj2;
        if(I1<I2){
            return +1;
        }
        else if(I1>I2){
            return -1;
        }
        else {
            return 0;
        }
    }
}//                            DONE COMPLETELY