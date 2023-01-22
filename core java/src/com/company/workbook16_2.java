package com.company;
class AA$BB{}
class AA{}
class BB{}
class X111 {
    int var = 10;

    class Y111 {
    }
}
class HELL555{
    static int VAL=9090;
    String msg;
    HELL555(String msg){
        this.msg=msg;
    }
    class JTCInner1{
        final static int CONS=9999;
        int intValue;
        public JTCInner1(int intValue){

        }
        void showDataInInnerClass(){
            System.out.println("\n**showData in Inner class**");
            System.out.println(intValue);
            System.out.println(CONS);
            System.out.println(msg);
            System.out.println(VAL);
        }
    }//close inner
    void show(){
        System.out.println("\n--INSTANCE show methode");
        System.out.println(VAL);
        System.out.println(msg);
        System.out.println(this.msg);
        JTCInner1 ref=null;
        ref=new JTCInner1(1111);
        ref=this.new JTCInner1(1111);
        System.out.println(ref.intValue);
        ref.showDataInInnerClass();
    }
    static void display(){
        System.out.println("\n---static Display Methode--");
        System.out.println(VAL);
        HELL555 ref=new HELL555("MSG in Display");
        System.out.println(ref.msg);
        JTCInner1 ref1=null;
        ref1=ref.new JTCInner1(2222);
        ref1.showDataInInnerClass();
    }
}
public class workbook16_2 {
    public static void main(String[] args) {
       AA$BB ref=null;
       ref=new AA$BB();
        System.out.println(ref);
      //  X111.Y111 ref1=null;
        X111 ref2=new X111();
      //  ref1=new Y();
        X111.Y111 ref1 =ref2.new Y111();
        ref1 =new X111().new Y111();
        System.out.println(ref1);
        System.out.println("\n\n---------------------");
        HELL555.display();
        System.out.println();
        HELL555 he=new HELL555("MSG IN MAIN");
        System.out.println(he.msg);
        he.show();
        HELL555.JTCInner1 inRef =null;
        inRef=new HELL555("MSG IN MAIN AGAIN").new JTCInner1(6060);
       // inRef.showDataInInnerClass();
        inRef=he.new JTCInner1(4040);
        inRef.showDataInInnerClass();
        System.out.println(inRef.intValue);
    }
}
