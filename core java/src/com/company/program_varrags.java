package com.company;
class varrags{
    int a;
    int b;
    static int c=30;
    {
        System.out.println("Instance block");
        System.out.println(this);
    }
    static {
        System.out.println("Static block");
    }
    varrags(){
        System.out.println("Default constructor");
    }
    varrags(int a){
        System.out.println("1 para cons");
    }
    varrags(int a,int b){
        System.out.println("2 para cons");
    }
    varrags(int...a){
        System.out.println("var_args cons invoke");
        for(int i=0;i<a.length;i++){
            System.out.println(i+":"+a[i]);
        }
    }
    void show(){
        System.out.println("show methode inside hello class");
        System.out.println(this);
    }
}

public class program_varrags {
    public static void main(String[] args) {
        varrags v1=new varrags();
        System.out.println("-----------------");
        System.out.println(v1);
        v1.show();
        varrags v2=new varrags();
        System.out.println("-----------");
        varrags v3=new varrags(111);
        System.out.println(v3);
        varrags v4=new varrags(11,13,14,15,16,17);
        System.out.println("------------");
        varrags v5=new varrags(22,33,44);
    }
}
