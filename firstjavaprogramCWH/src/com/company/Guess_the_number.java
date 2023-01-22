package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int Inputnumber;
    public int Noofguesses=0;

    public int getNoofguesses() {
        return Noofguesses;
    }

    public void setNoofguesses(int Noofguesses) {
        this.Noofguesses = Noofguesses;
    }
    Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);
    }
    void takeuserinput(){
        System.out.println("Guess the no :");
        Scanner sc= new Scanner(System.in);
        Inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber() {
        Noofguesses++;
        if (Noofguesses == number) {
            System.out.format("yes you guessed it right, it was %d\n and you guessed it in %d attempt",number,Noofguesses);
            return true;
        } else if (Inputnumber < number){
        System.out.println("Too low");
    }else if(Inputnumber>number){
            System.out.println("Too high");
        }
        return false;

    }


}

public class Guess_the_number {
    public static void main(String[] args) {
        Game g= new Game();
        boolean b= false;
        while (!b){
            g.takeuserinput();
            b=g.iscorrectnumber();
        }
        
    }
}
