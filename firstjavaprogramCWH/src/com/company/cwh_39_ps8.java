package com.company;
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
class cellphone {
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrate");
    }
    public void calling(){
        System.out.println("calling rahul...");
    }
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class cwh_39_ps8 {
    public static void main(String[] args) {
        Employee1 rahul = new Employee1();
        rahul.setName("fantastic rahul");
        rahul.salary=444;
        System.out.println(rahul.getSalary());
        System.out.println(rahul.getName());

        cellphone redmi = new cellphone();
        redmi.vibrate();
        redmi.ring();
        redmi.calling();

        square sq =new square();
        sq.side=7;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
