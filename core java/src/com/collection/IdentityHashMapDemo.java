package com.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
       // HashMap m=new HashMap();//output-{11=Ravi}".equals comapre on the basis content(I1.equals(I2)
        //returns true
        IdentityHashMap m=new IdentityHashMap();//output-{11=Ashish,11=bunti,11=Rahul,11=Ravi,11=Vishal,
        Integer I1=new Integer(11);//11=Neeraj}here == operator is used compare on the basis of
        Integer I2=new Integer(11);//address(reference) that's why everytime different address is
        Integer I3=new Integer(11);// available I1==I2 returns false
        Integer I4=new Integer(11);
        Integer I5=new Integer(11);
        Integer I6=new Integer(11);
        m.put(I1,"Ashish");
        m.put(I2,"Bunti");
        m.put(I3,"Neeraj");
        m.put(I4,"Vishal");
        m.put(I5,"Rahul");
        m.put(I6,"Ravi");
        System.out.println(m);//{11=Ashish, 11=Bunti, 11=Rahul, 11=Ravi, 11=Vishal, 11=Neeraj}
    }
}
