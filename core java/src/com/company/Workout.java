package com.company;

public class Workout{
    public static void main(String[] args) {
     //   Workout();
        System.out.println("it's a nap time");
        Workout.workhard();
    }
     static void workhard(){
        try {
            System.out.println("before in workhard");
       // Workhard();
            System.out.println("workhard in try");
        }
        finally {
         //   workhard();
            System.out.println("workhard in finally");
        }
    }
}
