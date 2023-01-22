package com.ExceptionHandling;

public class EXCEPT {
    public static void main(String[] args) {
        System.out.println("in Except");
        try{
            int i=Integer.parseInt(args[0]);
            int i1=10/i;
            System.out.println(i);
        }
        catch (Exception e){
            System.out.println("in catch....");
            if(e instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Plz provide the value..."+e);
            }
            else if(e instanceof NumberFormatException){
                System.out.println("plzz provide the numaric value...."+e);
            }
            else if(e instanceof ArithmeticException){
                System.out.println("plzz provide a non zero value...."+e);
            }
        }
    }
}
