package com.company;

public class cwh_27_ps5 {
    public static void main(String[] args) {
        float [] marks = {87.0f, 95.5f,83.7f,71.3f,37.6f};
      //  System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        for (int i= marks.length-1; i>0; i--){
            System.out.println(marks[i]);
        }
        for (float element: marks){
            System.out.println(element);
        }

    }
}
