package com;
class hello1{
    {
        System.out.println("IB in hello1");
        {
            System.out.println("local block in ib");
        }
    }
    static {
        System.out.println("SB in hello1");
        {
            System.out.println("local block in sb");
        }
    }
}
public class vishal_local {
    public static void main(String[] args) {
        hello1 h1= new hello1();
    }
}
