package com.company;

public class Java8 {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.driver();
        c1.Fuel();
        c1.m1();
        //Vehicle.driver();you cannot call a nonstatic methode from static context
    }
}
interface Vehicle {
    int headlight=1;
    default void driver(){
        System.out.println("vehchle needs driver");
    }
    public static void Fuel() {
        System.out.println("Vehicle needs Fuel");
    }
    /*default String toString(){
        you cannot override a methode of Object class using default Keyword.
    }*/
}
class Car implements Vehicle{
    public void driver(){
        System.out.println("Car needs driver");
    }
    public void Fuel(){
        System.out.println("Car needs Fuel");
    }
    public void m1(){
        Vehicle.super.driver();
    }
}