package com.company;

public class workbook10_point3 {
    public static void main(String[] args) {
        int ab=11;
        String st1=String.valueOf(ab);
        System.out.println(st1);
        boolean b1=true;
        String st2=String.valueOf(b1);
        System.out.println(st2);
        long val=1111l;
        String st3=String.valueOf(val);
        System.out.println(st3);
        pen p11=null;
        String st11=String.valueOf(p11);
        System.out.println(st11);
        pen p1=new pen();
        pencil p2=new pencil();
        String st4=String.valueOf(p1) ;
        String st5=String.valueOf(p2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
class pen{
    public String toString(){
        return "mera sir";
    }
}
class pencil{
      public String toString(){
       return "Person Obj";
    }
}