package com.bridgelabzs.snakenladder;

import java.util.Random;

public class SnakeNLadder {
    
    public static void main(String[] args) {
		System.out.println("welcome to snake and ladder game ");
		Random rand = new Random();
        int DiceValue = 1+rand.nextInt(6);
        System.out.println("Dice Value is " + DiceValue);
        
    }
}
