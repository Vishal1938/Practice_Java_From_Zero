package com.company;
class con{
    con(){
        System.out.println("Default con in con class");
    }
    con(con c1){
        System.out.println("1 para con in cons class");
    }
    con(con c1,con c2){
        System.out.println("2 para con in cons class");
    }
}

public class practice_constructor {
    public static void main(String[] args){
        con c3=new con(new con(new con(new con(new con(),new con()))));

    }
}
