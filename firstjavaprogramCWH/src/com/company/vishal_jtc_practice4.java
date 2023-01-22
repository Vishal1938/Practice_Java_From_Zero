package com.company;

public class vishal_jtc_practice4 {
    public static void main(String[] args) {


        int a = 10;
        for (int i = 0; i < 15; i++) {
            System.out.println("value of i\t:" + i);
            if (i == 5)
                break;
            System.out.println("After Break in for loop");
        }
        System.out.println("after looping statement");
        System.out.println("\n******");
        for(int i=0;i<10;i++){
            System.out.println("value\t:"+i);
            if(i==3)
                break;
            System.out.println("after");
        }
        System.out.println("\n*****");
        for(int i=0;i<7;i++){
            System.out.println("Before in j");
            for(int j=0;j<5;j++){
                System.out.println(i+"\t"+j);
                if(i==3)
                    break;
                System.out.println("After in j");
            }
            System.out.println("after in i");
        }
        System.out.println("\n_____jtcd_____");
        for(int i=0;i<7;i++) {
            System.out.println("Before in j");
            for (int j = 0; j < 5; j++) {
                System.out.println(i + "\t" + j);
                if (i == 3)
                    continue;
                System.out.println("After in j");
            }
            System.out.println("After in i");
        }
       for(int i=0;i<7;i++){
            System.out.println("value is : "+i);
            if(i==3)
                break;
            System.out.println("break the loop");
        }
        System.out.println("loop terminate");
    }

}