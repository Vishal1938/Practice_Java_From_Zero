package com.company;
final class Imutable{
    private String sid;
    Imutable(String sid){
        this.sid=sid;
    }
    public Imutable modify(String sid){
        if(this.sid==sid)
            return this;
        else
            return (new Imutable(sid));
    }
}
public class progaram14_mutable {
    public static void main(String[] args) {
        Imutable m1=new Imutable("22");
        Imutable m2=m1.modify("33");
        Imutable m3=m1.modify("22");
        Imutable m4=m3.modify("33");
        System.out.println(m1==m2);
        System.out.println(m1==m3);
        System.out.println(m2==m4);
        System.out.println();
    }
}
