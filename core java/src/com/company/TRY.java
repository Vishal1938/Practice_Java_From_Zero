package com.company;

public class TRY {
    public static void main(String[] args) {
        int i=10;
        try{
            int i1=Integer.parseInt(args[0]);
            int i2=i/i1;
        }
        catch (NumberFormatException e){
            System.out.println("Plz provide number value..."+e);
        }
        catch (ArithmeticException e){
            System.out.println("plzz provide non zero value..."+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("plzz provide some value..."+e);
        }
        catch (NullPointerException e){
            System.out.println("trying exception type..."+e);
        }
        catch (Exception e){
            System.out.println("super class of all the exception class..."+e);
        }
    }
}
