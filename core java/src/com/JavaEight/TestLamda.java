package com.JavaEight;

import java.util.*;
import java.util.stream.*;

class Mycomparator implements Comparator{
    public int compare(Object Obj1,Object Obj2){
        Integer I1=(Integer) Obj1;
        Integer I2=(Integer) Obj2;
      /*  if(I1<I2){
            return -1;
        }
        else if(I1>I2){
            return +1;
        }
        else {
            return 0;
        }*/
        return (I1<I2)?+1:(I1>I2)?-1:0;
    }
}
public class TestLamda {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<Integer>();
        l.add(11);
        l.add(34);
        l.add(23);
        l.add(15);
        l.add(77);
        l.add(97);
        System.out.println(l);
      //  Collections.sort(l,new Mycomparator());
      //  System.out.println(l);
        Comparator<Integer> c=(I1,I2)->(I1>I2)?-1:(I1>I2)?1:0;
        Collections.sort(l,c);
        System.out.println(l);
        l.stream().forEach(System.out::println);
        List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
    }
}
