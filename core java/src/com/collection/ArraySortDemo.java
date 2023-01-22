package com.collection;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {
    public static void main(String[] args) {
        int [] a={10,5,20,11,6};
        System.out.println("Primitive Array before Sorting :");
        for(int a1:a){
            System.out.println(a1);
        }
        Arrays.sort(a);
        System.out.println("Primitive Array After Sorting :");
        for(int a1:a){
            System.out.println(a1);
        }
        String[] s={"A","Z","B"};
        System.out.println("Object Array Before Sorting :");
        for(String a2:s){
            System.out.println(a2);
        }
        Arrays.sort(s);
        System.out.println("Object Array After Soerting :");
        for(String a1:s){
            System.out.println(a1);
        }
        Arrays.sort(s,new Comparator66());
        System.out.println("Onject Array After Sorting by Comparator :");
        for(String a1:s){
            System.out.println(a1);
        }
    }
}
class Comparator66 implements Comparator{
    public int compare (Object obj1,Object obj2){
        String s1=obj1.toString();
        String s2=obj2.toString();
        return s2.compareTo(s1);
    }
}