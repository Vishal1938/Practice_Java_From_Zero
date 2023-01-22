package com.company;

public class workbook15_of2 {
    public static void main(String[] args) {
        System.out.println(Myouterclass.MyInnerClass.LENGTH);
        System.out.println(Myouterclass.MyInnerClass.val);
        Myouterclass.MyInnerClass.val=33;
        Myouterclass.MyInnerClass.displayMessage();
        Myouterclass.MyInnerClass ref=null;
        //System.out.println(ref.msg);
       //Myouterclass.MyInnerClass ref=null;
              ref =new Myouterclass.MyInnerClass("message from main methode");
      //  System.out.println(ref.msg);
        Myouterclass.displayinouterclass();
        new Myouterclass().showOuterclass();
        ref.showResult();

    }
}
class Myouterclass {

    int result = 1045;
    static int value=1212;
    static class MyInnerClass{
        static int val=9090;
        static final int LENGTH=10;
        String msg;
        MyInnerClass(String msg){
            this.msg=msg;
        }
        static void displayMessage(){
            System.out.println("--display messsage static in Inner class--");
        }
        void showResult(){
            System.out.println("\n---show result in inner class--");
            System.out.println("MSG\t:"+msg);
            System.out.println("val\t:"+value);
           // System.out.println("static\t:"+result);
            System.out.println("ins\t:"+new Myouterclass().result);
        }
    }
    void showOuterclass(){
        System.out.println("\n--show in outer class");
        MyInnerClass ref1=new MyInnerClass("message in display method");
        System.out.println(ref1.msg);
    }
    static void displayinouterclass(){
        System.out.println("\n--displayinouterclass--");
        MyInnerClass  ref11=new MyInnerClass("message in display methode");
    }
}