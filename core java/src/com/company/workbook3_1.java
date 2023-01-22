package com.company;
class STUDENT{
    int sid;
    String name;
    long phone;
    public STUDENT(int sid,String name,long phone){
        this.sid=sid;
        this.name=name;
        this.phone=phone;
    }
}
public class workbook3_1 {
    public static void main(String[] args) {
        System.out.println("******hashcode*****");
        System.out.println("=======student======");
        STUDENT stu1=new STUDENT(11,"vishal",81782980);
        STUDENT stu2=new STUDENT(11,"vishal",81782980);
        STUDENT stu3=new STUDENT(33,"sameer",87657719);
        STUDENT stu4=stu1;
        System.out.println(stu1.hashCode());
        System.out.println(stu4.hashCode());
    }
}
