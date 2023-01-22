package com.company;

public class cwh_33_varrags {
  /*  static int sum(int a, int b ){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }*/
static int sum(float...arr){
    int result=0;
    for(float a:arr){
        result+= a;
    }
    return result;
}




    public static void main(String[] args) {
        System.out.println(sum(4,7));
        System.out.println(sum(4,5,6));
        System.out.println(sum(4.5f,5.7f,9.6f,7.7f));
      //  System.out.println(69);
    }

}
