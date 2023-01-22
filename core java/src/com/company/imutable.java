package com.company;
class createimmutable{
     int i;
     createimmutable(int i){
         this.i=i;
     }
}

public class imutable {
    public static void main(String[] args) {
        createimmutable c1=new createimmutable(11);
        System.out.println(c1.i);
        c1.i=22;
       System.out.println(c1.i);
    }
}
