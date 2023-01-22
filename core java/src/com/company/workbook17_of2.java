package com.company;

public class workbook17_of2 {
    public static void main(String[] args) throws Exception{
        Abc ref1=new Abc("welcome");
       Abc.Pqr ref =new Abc("message from main methode").new Pqr(9);
       ref.show();
       new Abc("THANKS").new Pqr(4141).show();
    }
}
class Abc{
    static String stvar="STATIC IN outer";
    String var;
    Abc(String var){
        this.var=var;
    }
    class Pqr{
        final static String stvar="STATIC VAR IN inner";
        int var;
        Pqr(int var){
            this.var=var;
        }
        void show(){
            boolean var=false;
            System.out.println("\n--in show Methode--in inner class--");
            System.out.println(var);
            System.out.println(this);
            System.out.println(this.var);
            System.out.println(Abc.stvar);
            System.out.println(Pqr.stvar);
            System.out.println(Abc.this);
            System.out.println(Abc.this.var);
            System.out.println(new Abc("message ").var);
        }
    }
}