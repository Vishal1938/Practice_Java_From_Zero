package com.company;
final class Create{
    private int x;
    Create(int x){
        this.x=x;
    }
     public Create modify (int x){
       if(this.x==x) {
           return this;
       }
       else {
           return (new Create(x));
       }
    }
}
public class Muttable {
    public static void main(String[] args) {
        Create C1= new Create(22);
        //C1.x=44; //"x has private access in create class we cant access it outside the class".
        Create c2=C1.modify(100);
        Create c3=c2.modify(22);
        System.out.println(C1==c3);
        System.out.println(C1==c2);
    }
}
