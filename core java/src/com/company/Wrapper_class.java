package com.company;

public class Wrapper_class {
    public static void main(String[] args) throws Exception{
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);
        Integer i3=new Integer("10");
        Integer i4=new Integer("10");
        Integer i5=new Integer("130");
        Character ch1=new Character('A');
        Character ch2=new Character('A');
        Boolean b1=new Boolean(true);
        Boolean b2=new Boolean("True");
        Boolean b3=new Boolean("yes ");
        Boolean b4=new Boolean(false);
        Character ch3=Character.valueOf('A');
        System.out.println(i1);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        System.out.println(i3);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));
        System.out.println(i1.equals(i4));
        System.out.println(ch1==ch3);//(ch1==ch2)
        System.out.println(ch1.equals(ch3));//(ch1.equals(ch2))
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        System.out.println(b3.equals(b4));
        System.out.println(i5.byteValue());
        System.out.println(i5.longValue());
        System.out.println(i5.doubleValue());
        System.out.println(ch1.charValue());
        System.out.println(b3.booleanValue());
        int i=Integer.parseInt("110",2);
        String s1=Integer.toString(110,2);
        System.out.println(i);
        System.out.println(s1);
        String s2=Integer.toBinaryString(12);


    }
}
