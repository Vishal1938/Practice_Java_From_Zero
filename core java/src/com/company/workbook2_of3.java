package com.company;

public class workbook2_of3 {
    public static void main(String[] args) {
        String st1="jtc";
        String st2="jtc";
        String st3=new String("jtc");
        System.out.println(st1+"\t"+st2+"\t"+st3);
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1.equals(st3));
        System.out.println("----student----");
        STUendt s1=new STUendt(11,"vishal");
        STUendt s2=new STUendt(11,"vishal");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println("----employee---");
        EMployee emp1=new EMployee(99,"vishal");
        EMployee emp2=new EMployee(99,"vishal");
        EMployee emp3=new EMployee(101,"rahul");
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1==emp2);
    }
}
class STUendt{
    int sid;
    String name;
    public STUendt(int sid,String name){
        this.name=name;
        this.sid=sid;
    }
    public boolean equals(Object ob){
        STUendt stu=(STUendt) ob;
        return this.sid==(stu.sid)&& this.name.equals(stu.name);
    }
}
class EMployee {
    int eid;
    String name;
    public EMployee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }
    public boolean equals(Object obj){
        EMployee emp=(EMployee) obj;
        return this.eid==emp.eid && this.name.equals(emp.name);
    }
}