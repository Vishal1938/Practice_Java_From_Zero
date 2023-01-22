package com.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySearchDemo {
    public static void main(String[] args) {
        int [] a={10,5,20,11,6};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,6));//1
        System.out.println(Arrays.binarySearch(a,14));//-5
        String [] s={"A","Z","B"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"Z"));//2
        System.out.println(Arrays.binarySearch(s,"J"));//-3
        Arrays.sort(s,new Comparator77());
        System.out.println(Arrays.binarySearch(s,"Z",new Comparator77()));//0
        System.out.println(Arrays.binarySearch(s,"J",new Comparator77()));//-2
        System.out.println(Arrays.binarySearch(s,"N"));//unpredictable output
    }
}
class Comparator77 implements Comparator{
    public int compare(Object o1,Object o2){
        String s1=o1.toString();
        String s2=o2.toString();
        return s2.compareTo(s1);
    }
}