package com.company;

public class cwh_32_overloading{
    static  void change(int a){
        a= 98;
    }
    static  void telljoke90(){
        System.out.println("i invented a new world!\n"+ "plagiarism!");
    }

    public static void main(String[] args) {
        int [] marks = {52, 73, 77, 89,98,94};
        int x = 45;
        change(x);
        System.out.println("the value of x after running change is -" + x);
    }
}
