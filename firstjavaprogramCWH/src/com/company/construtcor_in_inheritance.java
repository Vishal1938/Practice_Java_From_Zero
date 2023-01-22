package com.company;
class Grandfather{
    public Grandfather() {
        System.out.println("I am a constructor of Grandfather class");
    }
    public Grandfather(int x) {
        System.out.println("I am a  overloaded constructor of Grandfather class with the value of x :" + x);
    }

}
class Father extends Grandfather{
    public Father() {
        super(0);
        System.out.println("I am a constructor of father class");
    }
    public Father(int x,int y ) {
        super(x);
        System.out.println("I am an overloaded constructor of father class with value of y as :" +y);
    }

}
class Child extends Father{
    public Child() {
        System.out.println("I am a construcor of child class" );
    }
    public Child(int x, int y, int z) {
        super(x,y);
        System.out.println("I am an overloaded  construcor of child class with the value of z as:"+ z);
    }
}


public class construtcor_in_inheritance {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        Father f = new Father(14,9);
      //  Father f = new Father();
        Child c= new Child(12,14,15);
    }

}
