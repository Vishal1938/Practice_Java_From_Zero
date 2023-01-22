package com.company;
class good{
    int a;
    int b;
    static int c=30;
    good(){
        System.out.println("Default cons in good");
    }
    good(int a){
        System.out.println("1 param");
        this.a=a;
    }
    good(int a,int b){
        System.out.println("2 param");
        this.a=a;
        this.b=b;
    }
    good(int a,int b,int c){
        System.out.println("3 param");
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void show(){
        System.out.println("show method");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(this.c);
    }

}
public class program_practice {
    public static void main(String[] args) {
        good g1= new good();
        g1.show();
        good g2= new good(10);
        g2.show();
        good g3=new good(11,22);
        g3.show();
        good g4=new good(101,202,303);
        g4.show();
    }
}
