package com.ExceptionHandling;

public class Workbook_4 {
    public static void main(String[] args) {
        System.out.println("IN MAIN");
        int ab=ArithmaticOperation.getRemainder("12","7");
        System.out.println("In Main rem\t :"+ab);
        int xy=ArithmaticOperation.getRemainder("12","0");
        System.out.println("In main rem\t :"+xy);
        try{
            int rt=ArithmaticOperation.getRemainder("12","J");
            System.out.println("In main rem\t:"+rt);
        }catch (NumberFormatException e){
            System.out.println("==catch Main Completed==");
        }
        System.out.println("\n--Main Completed--");
    }
}
class ArithmaticOperation{
    public static int getRemainder(String val1,String val2){
        int rem=-1;
        try{
            System.out.println("\n** getRemainder**");
            System.out.println("Values\t:"+val1+"\t"+val2);
            System.out.println("--Converting into int type--");
            int ab=Integer.parseInt(val1);
            int bc=Integer.parseInt(val2);
            System.out.println("Remainder \t:"+rem);
            rem=ab%bc;
            System.out.println("Remainder \t:"+rem);
            return rem;
        }catch (Exception e){
            System.out.println("--catch in getRemainder--");
        }finally {
            System.out.println("++Finally Block in getRemainder++");
        }
        return rem;
    }
}