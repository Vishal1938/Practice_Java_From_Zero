package com.company;
import java.util.Scanner;
public class vishal_ps3 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age =sc.nextInt();
     /*   if (age>60) {
            System.out.println("retired");
        }
        else if(age>50){
            System.out.println("experianced");
        }
        else if(age>40){
            System.out.println("semi experianced");
        }
        else if(age>30) {
            System.out.println("not experianced");
        }*/
        switch (age){
            case 60:
            System.out.println("retired");
            break;

        case 50:
            System.out.println("experianced");
            break;

        case 40:
            System.out.println("semi experianced");
            break;

        default:
            System.out.println("not experianced");
        }
    }

}
