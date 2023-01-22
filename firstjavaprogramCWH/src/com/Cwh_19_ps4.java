package com;
  import java.util.Scanner;
public class Cwh_19_ps4 {
    public static void main(String[] args) {
    //    int a =11;
   //     if (a==11){
    //    System.out.println("i am 11");
    //    else {
     //           System.out.println("i am not");
      //      }
        System.out.println();
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        m1 =sc.nextByte();

        System.out.println("enter your chemistrey marks");
        m2 =sc.nextByte();

        System.out.println("enter your maths marks");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is: " + avg);

        if(avg>40 && m1>33 && m2>33 && m3>33) {
            System.out.println("your are promoted");
        }
        else{
            System.out.println("sorry you have not been promoted! please try again.");
         //   Question3

        }
    }
}
