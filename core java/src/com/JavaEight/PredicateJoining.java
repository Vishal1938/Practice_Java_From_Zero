package com.JavaEight;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        int [] x={0,5,10,15,20,25,30,35};
        Predicate <Integer> p1=i->i%2==0;
        Predicate <Integer> p2=i->i>10;
        System.out.println("The numbers which are even and greater then 10 are :");
        for (int x1:x){
            if((p1.and(p2).test(x1))){
                //p1.or(p2)
                //p1.negate(),p2.negate()
                System.out.println(x1);
            }
        }
    }
}
