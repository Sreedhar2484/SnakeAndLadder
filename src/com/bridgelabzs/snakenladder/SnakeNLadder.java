package com.bridgelabzs.snakenladder;

import java.util.Random;

public class SnakeNLadder {
    
    public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
        int position = 0;
        final int WinningPosition = 100;
        while(position <= WinningPosition) {
            Random rand = new Random();
            int DiceValue = 1+rand.nextInt(6);
            System.out.println("Dice Value is " + DiceValue);
            int option = rand.nextInt(3);
            System.out.println("Current Option : " +option);
            if(position==WinningPosition){
                System.out.println("You Won the game");
                break;
            }
            switch(option){
                case 0:
                System.out.println("No Play");
                    break;
                case 1:
                    System.out.println("Ladder");
                    position += DiceValue;
                    System.out.println("Current Position is " + position);

                    if(position > 100) {
                        position = position - DiceValue;
                        System.out.println("Current Position is " + position);
                    }
                    break;
                case 2:
                    System.out.println("Snake");
                    position -= DiceValue;
                    System.out.println("Current Position is " + position);

                    if(position < 0) {
                        position = 0;
                        System.out.println("Current Position is " + position);
                    }
                    break;
                default:
                    System.out.println("Not Correct Option");
            }
        }
    }
}
