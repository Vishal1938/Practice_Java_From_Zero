package com.company;
class OUTER11{
    int a=11;
    static int b=44;
    void m1(){
        int a=22;
        int b=33;
        System.out.println(a);
        System.out.println(b);
        System.out.println(this.a);
        System.out.println(this.b);
        System.out.println(OUTER11.b);
        System.out.println(new OUTER11().a);
        class Methodeinner{
           static int a=55;
            void m11(){
                System.out.println("Inner class in methode inner class");
                System.out.println(a);
                System.out.println(b);
                System.out.println(new OUTER11().a);
                System.out.println(this.a);
            }//methode close
        }//class close
        Methodeinner inr= new Methodeinner();
        inr.m11();
    }

}

public class practice_program {
    public static void main(String[] args) {
        OUTER11 o1=new OUTER11();
        o1.m1();
    }
}
