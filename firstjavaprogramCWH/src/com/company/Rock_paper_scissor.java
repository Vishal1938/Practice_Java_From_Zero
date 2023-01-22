package com.company;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissor {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock,1 for paper,2 for scissor :");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerinput= sc.nextInt();
        if (userinput==computerinput){
            System.out.println("Draw");
        }
        else if(userinput==0&&computerinput==2 ||userinput==1&&computerinput==0||
        userinput==2&&computerinput==1) {
            System.out.println("you win");
        }
        else {
                System.out.println("computer win");
            }
        if(computerinput==0){
            System.out.println("Compuet choice is : rock");
        }
        else if(computerinput==1){
            System.out.println("Computer choice is :paper");
        }
        else if(computerinput==2){
            System.out.println("Computer choice is scissors");
        }
    }
}