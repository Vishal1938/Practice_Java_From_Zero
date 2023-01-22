package com.company;

public class workbook18_of2 {
    public static void main(String[] args) {
        INSAN i1=null;
        System.out.println(INSAN.minAgeToVote);
        i1=new Majdoor("VISHAL",87657719);
        i1.showWorkinfo();
        System.out.println(i1.name+"\t"+i1.phone);
        i1=new OldBACHA();
        i1.showWorkinfo();
        System.out.println("\n****************");
        INSAN i=null;
        i=InsanService.getInstance("Majdoor");
        System.out.println(i.getINSANType());
        i=InsanService.getInstance("OldBACHA");
        System.out.println(i.getINSANType());
        i=InsanService.getInstance("CurrentBACHA");
        System.out.println(i.getINSANType());
    }
}
abstract class INSAN{
    static int minAgeToVote=18;
    String name;
    long phone;
     INSAN(String name,Long phone){
         this.name=name;
         this.phone=phone;
         System.out.println("--INSAN(STRING,LONG)Cons..\t:"+this);
     }
    {
        System.out.println("\n**INSAN INSTANCE BLOCK**");
    }
     INSAN(){
         System.out.println("--INSAN()cons..\t"+this);
     }
     abstract void showWorkinfo();
     abstract String getINSANType();
     void show(){
     }
}
class Majdoor extends INSAN{
    Majdoor(String name,long phone){
        super(name,phone);
    }
    Majdoor(){}
    String getINSANType(){
        return "Majdoor";
    }
    void showWorkinfo(){
        System.out.println("---EMPLOYEE WORKING IN COMPANY---");
    }
}
abstract class BACHA extends INSAN{}
class CurrentBACHA extends BACHA{
    void showWorkinfo() {
        System.out.println("--Attending the classess--");
    }
    String getINSANType(){
        return "CurrentStudent";
    }
}
class OldBACHA extends BACHA{
    void showWorkinfo(){
        System.out.println("--searching for job--");
    }
    String getINSANType(){
        return "oldStudent";
    }
}
class InsanService{
    static INSAN getInstance(String cName){
        if(cName.equals("Majdoor"))
            return new Majdoor();
        else if(cName.equals("OldBACHA"))
            return new OldBACHA();
        else if(cName.equals("CurrentBACHA"))
            return new CurrentBACHA();
        else
            return null;
    }
}