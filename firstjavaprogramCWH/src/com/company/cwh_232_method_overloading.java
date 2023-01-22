package com.company;

public class cwh_232_method_overloading {
    static void change(int a){
        a=0;

    }

    public static void main(String[] args) {

        int [] marks ={ 95,97,78,83,37};
        int x= 45;
        change(x);
        System.out.println("the value of x after running change is -"+ x);
    }
}
