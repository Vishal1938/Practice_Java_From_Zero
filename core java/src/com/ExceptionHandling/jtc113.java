package com.ExceptionHandling;
class Invalidaccountnumber extends Exception{
    int accno;
    public Invalidaccountnumber() {
    }
    Invalidaccountnumber(int accno) {
    }
    public String toString(){
        return "provide acc no"+" : "+ getMessage();
    }
    public String getMessage() {
        return "invalid acc no.";
    }
}class ServernotfoundException extends RuntimeException{


}
public class jtc113 {
    public static void main(String[] args) {
        try{
            int i=Integer.parseInt(args[0]);
        }
        catch (Exception e){
            System.out.println(e);
        }
        Invalidaccountnumber i1=new Invalidaccountnumber();
        i1.toString();
        i1.getMessage();
        System.out.println(i1);
        System.out.println(i1.getMessage());
    }
}
