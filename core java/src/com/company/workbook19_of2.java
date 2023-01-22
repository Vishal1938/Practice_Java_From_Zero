package com.company;
abstract class Person{
    static int minagetovote=18;
    String name;
    long phone;
    Person(String name,long phone){
        this.name=name;
        this.phone=phone;
        System.out.println("--person(String.long)Cons..\t:"+this);
    }
    Person(){
        System.out.println("--person() cons..\t:"+this);
    }
    {
        System.out.println("\n**person Instance block**");
    }
    abstract void showWorkInfo();
    abstract String getPersonType();
    void show(){

    }
}
class EMPLoyee extends Person{
    EMPLoyee(String name,long phone){
        super(name,phone);
    }
    EMPLoyee(){}
    String getPersonType(){
        return "Employee";
    }
    void showWorkInfo(){
        System.out.println("--Employee working in company--");
    }
}
abstract class Stu extends Person{}
class CurrentStudent extends Stu{
    void showWorkInfo(){
        System.out.println("--Attending the class--");
    }
    String getPersonType(){
        return "currentstudent";
    }
}
class OldStudent extends Stu{
    void showWorkInfo(){
        System.out.println("--getting the job--");
    }
    String getPersonType(){
        return "oldStudent";
    }
}
class personservice{
    static Person getInstance(String cName){
        if(cName.equals("Employee"))
            return  new EMPLoyee();
        else if(cName.equals("oldStudent"))
            return new OldStudent();
        else if(cName.equals("currentStudent"))
            return new CurrentStudent();
        else
            return null;
    }
}
public class workbook19_of2 {
    public static void main(String[] args) {
        System.out.println(Person.minagetovote);
        Person per=null;
        per=new EMPLoyee("SomPrakash",7676767676L);
        per.showWorkInfo();
        System.out.println("\n*************");
        Person p=null;
        p=personservice.getInstance("Employee");
        System.out.println(p.getPersonType());
        p=personservice.getInstance("oldstudent");
        System.out.println(p.getPersonType());
        p=personservice.getInstance("currentstudent");
        System.out.println(p.getPersonType());
    }
}
