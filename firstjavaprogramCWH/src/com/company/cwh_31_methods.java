package com.company;

public class cwh_31_methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5;
        }
         x =54;
        return z;
    }
    public static void main(String[] args) {
        int a= 8;
        int b= 7;
        int c= logic(a,b);
        int a1 = 5;
        int b1 = 4;
        int c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);


    }
}
