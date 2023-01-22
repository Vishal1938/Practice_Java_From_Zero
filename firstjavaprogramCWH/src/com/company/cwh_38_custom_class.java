package com.company;
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("my id "+id);
        System.out.println("and my name is " +id);
        System.out.println("and my salary is "+salary);
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee vishal = new Employee();
        Employee rahul =new Employee();
        vishal.id =9;
        vishal.salary=30 ;
        vishal.name ="fantstic vishal";
        rahul.id =11;
        rahul.name ="fool rahul";
        rahul.salary=00;

        vishal.printDetails();
        rahul.printDetails();


    }
}
