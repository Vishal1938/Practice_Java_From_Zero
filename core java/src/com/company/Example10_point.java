package com.company;
class que{
    void m1(){
        System.out.println("m1 in hello");
    }
    static int m2(){
        System.out.println("m2 in hello");
        return 10;
    }
    private void m3(){
        System.out.println("private in m3");
    }
    protected void m4(){
        System.out.println("protected in m4");
    }

}
class AAR extends que{
    void m1(){
        System.out.println("M1 in arr");
    }
    static int m2(int a, int b){
        System.out.println("m2 in arr");
        return 10;
    }
    void m3(){
        System.out.println("m3 in arr");
    }
    public void m4(){
        System.out.println("m4 in arr");
   }
}

public class Example10_point {
    public static void main(String[] args) {
        que q1=null;
        q1=new AAR();
        q1.m1();
        q1.m2();
     //   q1.m3(); //private access in que class.
        q1.m4();
        que q2=new que();
       // q2.m3(); //private access in que calss.
        q2.m1();
        q2.m2();
        q2.m4();
        System.out.println("----------");
        AAR a1=new AAR();
        a1.m2();
        a1.m2(11,22);
        a1.m3();
        a1.m4();

    }
}
