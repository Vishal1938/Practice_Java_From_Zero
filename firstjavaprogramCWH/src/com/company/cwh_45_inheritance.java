package com.company;

class Base{
    public int x;
    public int getx(){
        return x;
    }
    public void setx(int x){
        System.out.println("i am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("i am a construcor");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }
    public void sety(int y){
        this.y = y;
    }

public class cwh_45_inheritance {
    public static void main(String[] args) {
        Base b =new Base();
        b.setx(4);
        System.out.println(b.getx());
        Derived d = new Derived();
        d.sety(43);
        System.out.println(d.getY());
    }
}
}
