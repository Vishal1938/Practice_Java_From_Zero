package com.company;
class god{
    int a;
    int b;
    static int c=30;
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    god(int a,int b){
        System.out.println("2 param");
        this.a=a;
        this.b=b;
    }
    god(int a){
        this(301,201);
        System.out.println("1 param");
        this.a=a;
    }
    god(){
        this(1010);
        System.out.println("default cons");
    }
    void show(){
        System.out.println("show method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

public class practice_cons {
    public static void main(String[] args) {
        god g1=new god();
        g1.show();
    }
}
