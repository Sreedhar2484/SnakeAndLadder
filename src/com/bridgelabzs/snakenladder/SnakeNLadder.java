package com.bridgelabzs.snakenladder;

import java.util.Random;

public class SnakeNLadder {
    
    public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
        int position = 0;
		Random rand = new Random();
        int DiceValue = 1+rand.nextInt(6);
        System.out.println("Dice Value is " + DiceValue);
        int option = rand.nextInt(3);
        System.out.println("Current Option : " +option);
        if(option == 0){
            System.out.println("No play");
        }
        else if(option==1){
            System.out.println("Ladder");
            position += DiceValue;
            System.out.println("Current Position : "+position);
        }
        else{
            System.out.println("Snake");
            position += DiceValue;
            System.out.println("Current Position : "+position);

        }
        
    }
}
