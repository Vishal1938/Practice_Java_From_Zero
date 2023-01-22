package com.company;
final class STudent555{
    private final int sid;
    private final String sname;
    private final long phone;
    private final Address studAdd;
    public STudent555(int sid,String sname,long phone,Address studAdd){
        this.sid=sid;
        this.sname=sname;
        this.phone=phone;
        this.studAdd=new Address(studAdd.aid,studAdd.street,studAdd.city,studAdd.pin);
    }
    public String toString(){
        return "Stud Info\t:"+sid+"\t"+sname+"\t"+phone+"\nAdd Info\t:"+studAdd;
    }
    public int getSid(){
        return this.sid;
    }
    public Address getStudAddAddress() throws CloneNotSupportedException {
        return (Address) studAdd.clone();
    }
}
class Address implements Cloneable{
    int aid;
    String street;
    String city;
    int pin;
    public Address(int aid,String street,String city,int pin){
        this.aid=aid;
        this.city=city;
        this.street=street;
        this.pin=pin;
    }
    public Object clone(){
        return new Address(this.aid,this.city,this.street,this.pin);
    }
    public String toString(){
        return aid+"\t"+street+"\t"+city+"\t"+pin;
    }
}
public class workbook5_of3 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Address add=new Address(101,"c-29 sector noida","noida",201301);
        STudent555 stud=new STudent555(99,"vishal",6526668,add);
        System.out.println(stud);
        System.out.println("--modifying the add ref in main--");
        add.aid=14523;
        add.street="Sector 2 noida";
        System.out.println(stud.getSid());
        Address ref=stud.getStudAddAddress();
        ref.aid=11111;
        System.out.println(stud);
    }
}
