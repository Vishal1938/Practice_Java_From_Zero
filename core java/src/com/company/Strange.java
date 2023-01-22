package com.company;
class Missing{
    Missing(){
        System.out.println("default constructor");
    }
}

class Strange1{
    public static void main(String[] args) {
        try {
            Missing m1= new Missing();
        }
        catch (java.lang.NoClassDefFoundError ex){
        }
    }
}
public class Strange {
    public static void main(String[] args) {
        Missing m;
        try {
            m=new Missing();
            }
        catch (java.lang.NoClassDefFoundError ex ){
            System.out.println("got it");
        }
        Strange1 s1=new Strange1();

    }
}
