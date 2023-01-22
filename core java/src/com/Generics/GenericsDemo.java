package com.Generics;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        //Generic Area
        l.add("A");
       /* l.add(10) ;
        Required type:
        String
        Provided:
        int*/
        MethodeOne(l);
       /*l.add(10.5);

        Required type:
        String
        Provided:
        double*/
        System.out.println(l);//[A,10,10.5,true]

    }
    public static void MethodeOne(ArrayList l){
        //Non-generic area
        l.add(10);
        l.add(10.5);
        l.add(true);
    }
}
