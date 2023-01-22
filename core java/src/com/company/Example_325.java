package com.company;
class Trial{
    int m1(int a){
        System.out.println("m1 in trial");
        try{
            System.out.println("In try of m1");
            int x=10/a;
            System.out.println("x= "+x);
        }
        catch (Exception e){
            System.out.println("in catch of m1");
          //  e.printStackTrace();
        }finally {
            {
                System.out.println("In finally....important code");
                return 22;
            }

            //  System.out.println("after catch block in m1");
        }
    }
    int m2(int a){
        System.out.println("m2(int a) in trial");
        try{
            System.out.println("in m2(int a)try block");
            int x=10/a;

         return 10;
        }catch (ArithmeticException e){
            System.out.println("catch in m2");
            e.printStackTrace();
        }
        finally {
            System.out.println("very important code in finally of m2");
            return 5;
            // System.out.println("out of catch in m2");
       // return 20;
    }
}

public class Example_325 {
    public static void main(String[] args) {
        Trial t1 = new Trial();
        //   t1.m1(0);
        t1.m2(2);
        System.out.println(t1.m2(2));
    }
    }
}
