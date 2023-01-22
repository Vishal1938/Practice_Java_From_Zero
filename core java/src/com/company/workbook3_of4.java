package com.company;

public class workbook3_of4 {
    public static void main(String[] args) {
        System.out.println("IN MAIN");
        int ab= ArithnaticOperation.getRemainder("12","7");
        System.out.println("In main rem\t:"+ab);
        int xy= ArithnaticOperation.getRemainder("12","0");
        System.out.println("In Main rem\t:"+xy);
        try{
            int rt=ArithnaticOperation.getRemainder("12","j");
            System.out.println("In Main rem\t:"+rt);
        }catch (NumberFormatException e){
            System.out.println("===catch Main Methode===");
        }
        System.out.println("\n--Main Coompleted--");
    }
}
class ArithnaticOperation{
    public static int getRemainder(String val1,String val2){
        int rem=-1;
        try {
            System.out.println("\n** getRemainder**");
            System.out.println("Values\t:"+val1+"\t,"+val2);
            System.out.println("---Converting into int type--");
            int ab=Integer.parseInt(val1);
            System.out.println("-----------");
            int bc=Integer.parseInt(val2);
            System.out.println("--Accessing remainder--");
            rem=ab%bc;
            System.out.println("Remainder\t:"+rem);
            return rem;
        }
        catch (ArithmeticException e){
            System.out.println("--catch in getRemainder--");
        }finally {
            System.out.println("++Finally Block in getRemainder++");
        }
        return rem;
    }

}