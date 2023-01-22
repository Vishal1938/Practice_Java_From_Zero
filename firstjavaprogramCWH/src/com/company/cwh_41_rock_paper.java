package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Scanner;

public class cwh_41_rock_paper {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter 0 for rock,1 for paper,2 for scissor");
        int userInput =sc.nextInt();
        Random random= new Random();
        int computerinput = random.nextInt(3);

        if (userInput== computerinput){
            System.out.println("Draw");
        }else if(userInput==0 && computerinput==2 || userInput==1 && computerinput==0
        ||computerinput==2 && computerinput==1){
            System.out.println("you win");
        }else{
            System.out.println("computer win");
        }
        if(computerinput==0){
            System.out.println("computer choice: Rock");
        }
        else if(computerinput==1){
            System.out.println("compuet choice: paper");
        }

    }
}
