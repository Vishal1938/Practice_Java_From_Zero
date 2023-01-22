package com.company;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        int num=5678;
        int even_count=0;
        int odd_count=0;
        int digit=0;
        int sum=0;
        //# counting the digit
       /* while (num > 0) {
            num=num/10;
            digit++;
        }*/
        //# counting of no of  odd and even no of digit
       /* while(num>0){
          int  rem=num%10;
          if (rem%2==0){
              even_count++;
          }
          else{
              odd_count++;
          }
          num=num/10;
        }*/
        //# sum of digit
       /* while(num>0){
             sum=sum+num%10;
             num=num/10;
        }*/
       // System.out.println("no of digit :"+digit);
        System.out.println("sum of digit :"+sum);
     /*   System.out.println("no of even digit :"+even_count);
        System.out.println("no of odd digit :"+odd_count);
        System.out.println("no of digit :"+(even_count+odd_count));*/
        //find the largest of three no taking input from keyboard
        Scanner sc=new Scanner(System.in);
     /*   System.out.println("Enter the first no :");
        int a= sc.nextInt();
        System.out.println("Enter the second no :");
        int b= sc.nextInt();
        System.out.println("Enter th third no :");
        int c= sc.nextInt();
        //using if else condition
       /* if (a>b&&a>c){
            System.out.println("Greatest no is :"+a);
        }
        else if (b>a&&b>c){
            System.out.println("b is gretest :"+b);
        }
        else {
            System.out.println("C is grstest :"+c);
        }


        // using ternery opertor
        int largest =(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("largest no is :"+largest);
*/

        //fibonachi seris
        int number= sc.nextInt();
        System.out.println("Enter the no : ");
        for(int i=0;i<number;i++){
            sum =sum+i;
            System.out.print("\t"+sum);
             System.out.print("\n");
        }
        System.out.println("finonaci sum :"+sum);
    }
}
