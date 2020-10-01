/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Logan
 */
import java.util.Scanner;
import java.util.Random;

public class DiceGuessing{

   public static void main (String [] args) {
       
        int playCount = 1;
        int correctCount = 0;
        double correctPercent = 0.0;

   	Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        while(playCount < 11) {
        
            int DiceRoll = (rand.nextInt(6 - 1 + 1)) + 1;
        
            System.out.print("What is your guess? ");
            int userGuess = input.nextInt();
        
            if(userGuess == DiceRoll) {
                System.out.println("The dice landed on " + DiceRoll + ", Your guess was correct!" );
                correctCount += 1;
                System.out.println("");
            }
            else {
                System.out.println("The dice landed on " + DiceRoll + ", Your guess was wrong." );
                System.out.println("");
            }
            playCount += 1;
        }
        System.out.print("You had " + correctCount + " correct guess(es). ");
        correctPercent = ((double)correctCount) / ((double)playCount) * 100;
        System.out.print(correctPercent + "% of your guesses were correct. ");
        
        if (correctPercent >= 30.0) {
            System.out.println("Excellent!");
        }
        else if (correctPercent >= 15.0) {
            System.out.println("Good job. Better than Average.");
        }
        else if (correctPercent >= 10.0) {
            System.out.println("You can do better. Below Average.");
        }
        else {
            System.out.println("Poor. Try again!");
        }
        
        
        
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
   }
}