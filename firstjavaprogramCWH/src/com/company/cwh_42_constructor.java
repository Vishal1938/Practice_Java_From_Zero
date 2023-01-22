package com.company;
class myEmployee{
    myEmployee(String s, int i){
        System.out.println("the name of first employee: "+ s);
        System.out.println("the id of the first employee: "+ i);
    }
    myEmployee(String s, int i ,int salary){
        System.out.println("the name of second employee is :"+ s);
        System.out.println("the id of second employee is :"+ +i);
        System.out.println("the salary of second employee is :" + salary);
    }


}

public class cwh_42_constructor {
    public static void main(String[] args) {
        myEmployee sameer = new myEmployee("sameer",1);
        myEmployee vivek = new myEmployee("vivek",2,50000);
    }
}
