package com.company;

public class cwh_ps_while_break {
    public static void main(String[] args) {
        int x =0;
        while(x<5){
            System.out.println(x);
            System.out.println("java is fun");
            if(x==2){
                System.out.println("ending the loop");
                break;
            }
            x++;
        }
      //  System.out.println("loop ends here");
        int i =0;
        do {
            i++;
            if (i == 2) {
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");

        } while(i<5);
            System.out.println("loops ends here ");


    }
}
