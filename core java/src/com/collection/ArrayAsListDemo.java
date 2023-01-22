package com.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {
    public static void main(String[] args) {
        String[] s={"A","z","B"};
        List l= Arrays.asList(s);
        System.out.println(l);
        s[0]="K";
        System.out.println(l);
        l.set(1,"L");
        for(String s1:s){
            System.out.println(s1);
         //   l.add("Vishal");//Unsupported Exception
         //   l.remove(l);// Unsupported Exception
        //    l.set(1,new Integer(10));//ArraySorted
            //    Exception
        }
    }
}
