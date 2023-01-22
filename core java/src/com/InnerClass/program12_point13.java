package com.InnerClass;
class OUT11{
    int  a=99;
    static int b=88;
    {
        System.out.println("IB i outer");
    }
    static {
        System.out.println("sb in outer");
    }
    static class IN1{
        {
            System.out.println("ib in inner...inner 1");
        }
        static {
            System.out.println("sb in inner....inner 1");
        }
        static class IN2{

            {
                System.out.println("ib in inner 2");
            }
           static  {
               System.out.println("sb in inner 2");
            }
        }
    }
}

public class program12_point13 {
    public static void main(String[] args) {
       OUT11.IN1 oi1=new OUT11.IN1();
      //  OUT11 o1= new OUT11();
      //  OUT11.IN1.IN2 oii=new OUT11.IN1.IN2();
    }
}
