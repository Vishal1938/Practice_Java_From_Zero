package com.company;

public class Catch {
    public static void main(String[] args) {
        int i1 = 10;
        try {
            int i2 = Integer.parseInt(args[0]);
            int i3 = i1 / i2;
        } catch (NumberFormatException | NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("plzz enter some ligal valu..."+e);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}