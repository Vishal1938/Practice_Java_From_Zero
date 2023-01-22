package com.InnerClass;
class outer1{
    int a=10;
    int b=20;
    static int c=30;
    {
        System.out.println("IB in outer");
    }
    static {
        System.out.println("sb in outer");
    }
    class Inner1 {
        int a1 = 101;
         static final int ab1 = 300;

        class Inner2 {
            int ab = 202;
            static final int bc = 303;

            void showinner2() {
                System.out.println("showinner2");
                System.out.println(a);//10
                System.out.println(b);//20
                System.out.println(c);//30
                System.out.println(a1);//101
                System.out.println(ab);//202
                System.out.println(bc);//303
            }
        }//inner2 closed
        void showinner1() {
            System.out.println("showinner in inner");
            System.out.println(new Inner2().ab);//202
            System.out.println(Inner2.bc);//303
        }
    }//Inner1 closed
    void showouter(){
        System.out.println("showOuter() in outer");
        Inner1 inr=new Inner1();
        System.out.println(inr.a1);//101
        System.out.println(Inner1.ab1);//303
        Inner1.Inner2 inr12=new Inner1().new Inner2();
        System.out.println(inr12.ab);//202
        //System.out.println(new Inner1.Inner2().bc);
    }
}

public class program12_point8 {
    public static void main(String[] args) {
        outer1.Inner1.Inner2 oinr12=new outer1().new Inner1().new Inner2();
        oinr12.showinner2();
        outer1.Inner1 oi12=new outer1().new Inner1();
        oi12.showinner1();
    //    outer1 o1=new outer1();
        new outer1().showouter();

    }
}
