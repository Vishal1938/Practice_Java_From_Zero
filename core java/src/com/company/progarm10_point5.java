package com.company;
class Animal{
    int a =10;
    int b=20;
    static int c=30;
    void eating(){
        System.out.println("Animal is eating");
    }
    int sleeping(){
        System.out.println("Animal is sleeping");
        return 10;
    }
    void thinking(){
        System.out.println("Animal is thinking");
    }
    static void seeing(){
        System.out.println("Animal is seeing");
    }
}
class Dog extends Animal {
    int a = 101;
    int b = 202;
    static int c = 303;

    void eating() {
        System.out.println("Dog is eating");
    }

    int sleeping() {
        System.out.println("Dog is sleeping");
        return 11;
    }

    static void seeing() {
        System.out.println("Dog is seeing");
    }

    void barking() {
        System.out.println("Dog is barking");
    }
class cat extends Animal{
        void eating(){
            System.out.println("cat is eating");
        }
        static void seeing(){
            System.out.println("cat is seeing");
        }
}
public class progarm10_point5 {
    public static void main(String[] args) {
        Animal ani1=new Animal();
        ani1.eating();
        ani1.thinking();
        ani1.seeing();
        Dog dog1 = new Dog();
        dog1.eating();
        dog1.thinking();
        dog1.seeing();
        dog1.barking();
        System.out.println("*****************\n");
        Animal ani2=null;
        ani2= new Dog();
        ani2.eating();
        ani2.thinking();
        ani2.seeing();
    //    ani2.barking();
        System.out.println(ani2.a);
        System.out.println(ani2.c);
    }
}
}
